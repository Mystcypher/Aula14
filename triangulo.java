import static java.lang.IO.*;

void main() {
    IO.print("Informe o valor do primeiro lado: ");
    float l1 = Float.parseFloat(readln());

    IO.print("Informe o valor do segundo lado: ");
    float l2 = Float.parseFloat(readln());

    IO.print("Informe o valor do terceiro lado: ");
    float l3 = Float.parseFloat(readln());

    if (l1 == l2 && l2 == l3){
        IO.print("Triângulo Equilátero!");
    } else if (l1 == l2 || l1 == l3 || l2 == l3){
        IO.print("Triângulo Isósceles!");
    } else {
        IO.print("Triângulo Escaleno!");
    }
}