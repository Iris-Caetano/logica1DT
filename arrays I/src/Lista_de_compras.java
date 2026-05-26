import static java.lang.IO.*;

void main() {
    List<String> compras = new ArrayList<>();

    int opcao;

    do {
        println("\n===== LISTA DE COMPRAS =====");
        println("1 - Adicionar produto");
        println("2 - Pesquisar produto");
        println("3 - Remover produto");
        println("4 - Alterar produto");
        println("5 - Listar produtos");
        println("6 - Sair");

        println("Escolha uma opção acima: ");
        opcao = Integer.parseInt(readln());

        switch (opcao) {

            case 1:
                while (true) {
                    String adicionar = IO.readln("Digite um produto (ou 'sair'): ");

                    if (adicionar.equalsIgnoreCase("sair")) {
                        break;
                    }

                    compras.add(adicionar);

                    println("Produto adicionado!");
                }
                break;

            case 2:
                String pesquisar = IO.readln("Digite o produto para pesquisar: ");

                if (compras.contains(pesquisar)) {
                    println("Objeto encontrado!");
                } else {
                    println("Objeto não encontrado!");
                }
                break;

            case 3:
                String remover = IO.readln("Digite o produto que deseja remover: ");

                if (compras.contains(remover)) {

                    compras.remove(remover);
                    println("Produto Removido!");

                } else {

                    println("Produto não encontrado!");
                }
                break;
            case 4:
                String alterar = IO.readln("Digite o produto que deseja alterar: ");

                if (compras.contains(alterar)){

                    int antigo = compras.indexOf(alterar);

                    String novo = IO.readln("Digite o novo produto: ");
                    compras.set(antigo, novo);

                    IO.println("Produto alterado!");
                }else {
                    IO.println("Produto não encontrado!");
                }
                break;
            case 5:
                if (compras.isEmpty()){
                    println("Lista vazia!");
                }else {
                    IO.println("***** lISTA DE PRODUTOS *****");

                    for (int i = 0; i < compras.size(); i++){

                        IO.println((i + 1) + "° " + compras.get(i));
                    }
                }
                break;
            case 6:
                IO.println("Sistema encerrado!");
                break;

            default:
                IO.println("Opcão Invalida!");

        }

    } while (opcao != 6);

}