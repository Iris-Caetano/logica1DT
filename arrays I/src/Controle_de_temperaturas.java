import static java.lang.IO.*;
void main() {
    List<Float> celsius = new ArrayList<>();
    List<Float> fahrenheit = new ArrayList<>();

    println("Informe a temperatura em grau celcius!");

    while(true){
        String temperaturac = IO.readln("Digite a temperatura: ");

        if (temperaturac.equalsIgnoreCase("sair")){
            break;
        }

        Float temperatura1 = Float.parseFloat(temperaturac);

        celsius.add(temperatura1);

        float tempf = (temperatura1 * 9 / 5) + 32;

        fahrenheit.add(tempf);

    }

    float somaC = 0;
    float somaF = 0;

    for(int i = 0; i < celsius.size(); i++){

        somaC += celsius.get(i);
        somaF += fahrenheit.get(i);
    }

    println("Temperturas em Celcius: " + celsius);

    println("Temperturas em Fahrenheit: " + fahrenheit);

    println("Média em Fahrenheit: " + somaF);

    println("Media em Celsius: " + somaC);


}