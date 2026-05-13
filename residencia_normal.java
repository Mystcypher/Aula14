import static java.lang.IO.*;

void main() {
    IO.print("Digite o consumo de água: ");
    float consumo = Float.parseFloat(readln());
    float conta;

    if(consumo <= 10){
        conta = 22.38f;
    } else if(consumo <= 20){
        conta = consumo * 3.50f;
    } else if(consumo <= 50){
        conta = consumo * 8.75f;
    } else {
        conta = consumo * 9.64f;
    }

    IO.print("Conta: R$ " + conta);
}