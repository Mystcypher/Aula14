import static java.lang.IO.*;

void main() {

    // INCOMPLETO!!!

    String M = readln();
    String V = readln();
    String N = readln();

    IO.println("M = Matutino");
    IO.println("V = Vespertino");
    IO.println("N = Noturno");
    IO.print("Digite a letra do seu turno: ");

    String turno = readln();

    if (turno == M){
        IO.print("Bom Dia!");
    } else if (turno == V){
        IO.print("Boa Tarde!");
    } else if (turno == N){
        IO.print("Boa Noite!");
    } else {
        IO.print("Valor Inválido!");
    }
}