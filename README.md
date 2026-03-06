# O Problema da Interface Monolítica (ISP)

O **Interface Segregation Principle (ISP)** estabelece que "nenhuma classe deve ser forçada a depender de métodos que não utiliza". Quando criamos uma **Interface Monolítica** (ou "Interface Gorda"), violamos esse princípio fundamental.



## Por que a interface monolítica é prejudicial?

O design monolítico força classes clientes a dependerem de métodos irrelevantes pelos seguintes motivos:

* **Acoplamento Indevido:** A interface expõe um contrato vasto que abrange múltiplas responsabilidades. A classe cliente, ao implementar essa interface, fica acoplada a todo esse conjunto de funcionalidades, mesmo que precise apenas de uma fração delas.
* **Implementações Vazias ou "Fake":** Para satisfazer o compilador, a classe é obrigada a fornecer implementação para todos os métodos. Isso resulta em código "sujo", onde métodos desnecessários são deixados vazios, retornam `null` ou lançam exceções como `UnsupportedOperationException`.
* **Fragilidade do Sistema:** Como a interface é usada por diversas classes com necessidades diferentes, qualquer alteração nela (adição ou remoção de um método) causa um efeito cascata. Todas as classes implementadoras são afetadas, exigindo recompilação e possíveis correções em locais onde o novo método não faz sentido.
* **Quebra do Princípio da Responsabilidade Única:** Interfaces monolíticas tendem a agregar comportamentos que não pertencem ao mesmo domínio de negócio, dificultando a coesão do código e tornando o entendimento da API confuso para o desenvolvedor.

### Resumo do Impacto
Ao forçar uma classe a conhecer métodos que ela não utiliza, o sistema torna-se mais **rígido** (difícil de alterar), mais **frágil** (quebra facilmente com mudanças) e menos **reutilizável**. A segregação em interfaces menores e específicas é a solução para manter o sistema leve e desacoplado.