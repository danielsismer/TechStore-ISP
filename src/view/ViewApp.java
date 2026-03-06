package view;

import model.Cliente;

import java.util.Scanner;

public class ViewApp {

    Scanner input = new Scanner(System.in);

    public Cliente save(){

        System.out.print("Nome -> ");
        String nome = input.nextLine();

        System.out.println();

        System.out.print("Email -> ");
        String email = input.nextLine();

        System.out.print("Tipo -> ");
        String tipo = input.nextLine();

        System.out.println();

        return new Cliente(nome, email, tipo);
    }
}
