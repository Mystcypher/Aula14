import static java.lang.IO.*;

void main() {
    IO.print("Digite o valor do primeiro número: ");
    int num1 = Integer.parseInt(readln());

    IO.print("Digite o valor do segundo número: ");
    int num2 = Integer.parseInt(readln());

    IO.println("1 - Adição");
    IO.println("2 - Subtração");
    IO.println("3 - Multiplicação");
    IO.println("4 - Divisão");
    IO.println("5 - Potência");
    IO.println("6 - Raiz quadrada");
    IO.println("7 - Número par");
    IO.println("8 - Número ímpar");

    IO.print("Digite a operação aritmética: ");
    int op = Integer.parseInt(readln());

    if (op == 1) {
        IO.print(num1 + " + " + num2 + " = " + (num1 + num2));
    } else if (op == 2) {
        IO.print(num1 + " - " + num2 + " = " + (num1 - num2));
    }  else if (op == 3) {
        IO.print(num1 + " x " + num2 + " = " + (num1 * num2));
    } else if (op == 4) {
        IO.print(num1 + " / " + num2 + " = " + (num1 / num2));
    } else if (op == 5) {
        IO.print(num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
    } else if (op == 6) {
        IO.println("√" + num1 + " = " + Math.sqrt(num1));
        IO.print("√" + num2 + " = " + Math.sqrt(num2));
    } else if (op == 7) {
        if (num1 % 2 == 0){
            IO.println(num1 + " é par!");
        } else {
            IO.println(num1 + " não é par!");
        }
        if (num2 % 2 == 0){
            IO.println(num2 + " é par!");
        } else {
            IO.println(num2 + " não é par!");
        }
    } else if (op == 8) {
        if (num1 % 2 != 0){
            IO.println(num1 + " é ímpar!");
        } else {
            IO.println(num1 + " não é ímpar!");
        }
        if (num2 % 2 != 0){
            IO.println(num2 + " é ímpar!");
        } else {
            IO.println(num2 + " não é ímpar!");
        }
    }
}