import static java.lang.IO.*;
void main() {
    String[]nomes = new String[10];
    int[]idades = new int[10];
    String[]cursos = new String[10];

    int opcao;
    int cont = 0;
    int qtdCadastrado = 0;

    do {
        IO.println("** MENU DE OPÇÕES **");
        IO.println("1 - Cadastrar aluno");
        IO.println("2 - Listar alunos");
        IO.println("3 - Buscar aluno pelo nome");
        IO.println("4 - Remover aluno ");
        IO.println("5 - Sair ");

        opcao = Integer.parseInt(readln("Escolha uma opção: "));

        if (opcao == 1){

            String nomeCadastrado;
            int idadeCadastrada;
            String curso;

            nomeCadastrado = readln("Qual o nome do aluno cadastrado? ");
            nomes[cont] = nomeCadastrado;

            idadeCadastrada = Integer.valueOf(readln("Qual a idade do aluno cadastrado? "));
            idades[cont] = idadeCadastrada;


            curso = readln("Qual o curso do aluno? ");
            cursos[cont] = curso;
            qtdCadastrado = qtdCadastrado + 1;
            cont = cont + 1;


        }
        if (opcao == 2){
            for (int i = 0; i < qtdCadastrado; i++){
                println("---------------");
                println("Aluno " + (i+1));
                println("Nome: " + nomes[i]);
                println("Idade: " + idades[i]);
                println("Curso: " + cursos[i]);
                println("---------------");
            }
        }
        if (opcao == 3){
            String nomeBusca = readln("Digite o nome do aluno: ");
            boolean encontrado = false;

            for (int i = 0; i < qtdCadastrado; i++){
                if (nomes[i].equalsIgnoreCase(nomeBusca)){
                    println("------------------");
                    println("Aluno encontrado!");
                    println("Nome: " + nomes[i] );
                    println("Idade: " + idades[i]);
                    println("Curso: " + cursos[i]);
                    println("------------------");
                    encontrado = true;


                }
                if (!encontrado){
                    println("Aluno não encontrado.");
                }

            }

        }
        if (opcao == 4){
            String nomeRemover = readln("Qual nome do aluno que deseja remover?");
            int posicao = -1;

            for (int i = 0; i < qtdCadastrado; i++){
                if(nomes[i].equalsIgnoreCase(nomeRemover)){
                    posicao = i;
                }
            }
            if (posicao == -1){
                println("Aluno não encontrado.");
            }else {
                for (int i = posicao; i < qtdCadastrado; i++){
                    nomes[i] = nomes[i + 1];
                    idades[i] = idades[i + 1];
                    cursos[i] = cursos[i + 1];
                }
            }
            nomes [qtdCadastrado - 1] = null;
            cursos [qtdCadastrado - 1] = null;

            qtdCadastrado = qtdCadastrado - 1;
            cont = cont - 1;
            println("Aluno removido com sucesso!");

        }


    }while (opcao != 5 || cont == 10);
    println("Sistema Encerrado!");

}