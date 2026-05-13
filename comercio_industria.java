import static java.lang.IO.*;

void main() {
    IO.print("Digite o consumo de água: ");
    float consumo = Float.parseFloat(readln());
    float conta;

    if(consumo <= 10){
        conta = 44.95f;
    } else if(consumo <= 20){
        conta = consumo * 8.75f;
    } else if(consumo <= 50){
        conta = consumo * 16.76f;
    } else {
        conta = consumo * 17.46f;
    }

    IO.print("Conta: R$ " + conta);
}