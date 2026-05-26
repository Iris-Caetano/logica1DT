import static java.lang.IO.*;
void main() {

    String[] lista = new String[5];

    int soma = 0;
    for (int i = 0; i < lista.length; i++){
        String convidado = IO.readln("Digite o nome do convidado: ");
        lista[i] = convidado;
        println("convidado adicionado");
        soma ++;
    }

    IO.println("Lista de convidados ");

    for (int i = 0; i < lista.length; i++){
        println(lista[i]);

    }
    println("Total de convidados é " + soma);

}