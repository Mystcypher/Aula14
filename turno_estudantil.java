import static java.lang.IO.*;

void main() {

    String M = "M";
    String V = "V";
    String N = "N";

    IO.println("M = Matutino");
    IO.println("V = Vespertino");
    IO.println("N = Noturno");
    IO.print("Digite a letra do seu turno: ");

    String turno = readln();

    if (Objects.equals(turno, M)){
        IO.print("Bom Dia!");
    } else if (Objects.equals(turno, V)){
        IO.print("Boa Tarde!");
    } else if (Objects.equals(turno, N)){
        IO.print("Boa Noite!");
    } else {
        IO.print("Valor Inválido!");
    }
}