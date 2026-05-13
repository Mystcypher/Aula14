import static java.lang.IO.*;

void main() {
    IO.print("Digite um número de 1 a 7: ");
    int dia = Integer.parseInt(readln());

    if (dia == 1) {
        IO.print("Domingo");
    } else if (dia == 2) {
        IO.print("Segunda");
    } else if (dia == 3) {
        IO.print("Terça");
    } else if (dia == 4) {
        IO.print("Quarta");
    } else if (dia == 5) {
        IO.print("Quinta");
    } else if (dia == 6) {
        IO.print("Sexta");
    } else if (dia == 7) {
        IO.print("Sábado");
    } else {
        IO.print("Opção inválida!");
    }
}