import static java.lang.IO.*;

void main() {
    IO.print("Digite o consumo de água: ");
    float consumo = Float.parseFloat(readln());
    float conta;

    if(consumo <= 10){
        conta = 7.59f;
    } else if(consumo <= 20){
        conta = consumo * 1.31f;
    } else if(consumo <= 30){
        conta = consumo * 4.64f;
    } else if(consumo <= 50){
        conta = consumo * 6.62f;
    } else {
        conta = consumo * 7.31f;
    }

    IO.print("Conta: R$ " + conta);
}