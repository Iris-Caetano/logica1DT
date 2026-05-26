import static java.lang.IO.*;
void main() {

    float[] precos = new float[5];

    float maior = 0;
    float menor = 0;

    for (int i = 0; i < precos.length; i++){
        float valores = Float.parseFloat(readln("Informe o " + (i+1) + "° valor: "));
        precos[i] = valores;

        // primeira posição vira referencia
        if (i == 0){
            maior = valores;
            menor = valores;
        }

        //verificando o maior valor
        if (valores > maior){
            maior = valores;
        }

        //verificando o menor valor
        if(valores < menor){
            menor = valores;
        }

    }

    println("Maior valor: " +  maior);
    println("Menor valor: " + menor);

    
}