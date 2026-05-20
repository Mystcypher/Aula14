import static java.lang.IO.*;

void main() {

    float salario = Float.parseFloat(readln("Digite seu salário: "));
    float percentual = 0f;

    if (salario <= 1000.00){
        percentual = 20;
    } else if (salario <= 1700.00){
        percentual = 15;
    } else if (salario <= 2300.00){
        percentual = 10;
    } else {
        percentual = 5;
    }

    float valoraumento = (salario * percentual) / 100;
    float novosalario = salario + valoraumento;

    println("Salário digitado: R$ " + salario);
    println("Aumento aplicado: " + percentual + "%");
    println("Valor do aumento: R$ " + valoraumento);
    println("Novo salário: R$ " + novosalario);
}