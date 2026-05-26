import static java.lang.IO.*;
void main() {
    ArrayList<String> lista = new ArrayList<>();

    while(true) {
       String atividade = IO.readln("Digite sua lista de atividades: ");

       if (atividade.equalsIgnoreCase("fim")){
           break;
       }
       lista.add(atividade);

    }

    println("******************** Lista de Tarefas *************************");

    for (int i = 0; i < lista.size(); i++){
        println((i + 1) + "°" + lista.get(i));
    }
}