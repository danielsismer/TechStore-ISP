package infra.repository;

import infra.database.DatabaseCredentials;
import model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteRepository {

    public Cliente find(String email) throws SQLException {

        String query = """
                SELECT id, nome, email
                FROM Cliente
                WHERE email = ?
                """;

        try(Connection conn = DatabaseCredentials.connection();
                PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, email);
            stmt.executeQuery();

            ResultSet rs = stmt.getResultSet();

            if(rs.next()){
                return new Cliente(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("tipo")
                );
            }

        }
        return null;
    }

    public Cliente save(Cliente cliente){

        String query = """
                INSERT INTO Cliente (nome, email, tipo)
                VALUES (?,?,?);
                """;

        try(Connection conn = DatabaseCredentials.connection();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getTipo());
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
