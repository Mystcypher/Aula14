import static java.lang.IO.*;

void main() {

    float n1 = Float.parseFloat(readln("Informe a primeira nota: "));
    float n2 = Float.parseFloat(readln("Informe a segunda nota: "));
    float n3 = Float.parseFloat(readln("Informe a terceira nota: "));
    float n4 = Float.parseFloat(readln("Informe a quarta nota: "));
    float mf = (n1 + n2 + n3 + n4) / 4;

    if (mf >= 0 && mf <= 10){
        println("Notas: " + n1 + ", " + n2 + ", " + n3 + ", " + n4 );
    }

    if (mf >= 0 && mf <= 10){
        println("Média final: " + mf);
    }

    if (mf >= 9 && mf <= 10) {
        String A = "A";
        println("Nota A");
    } else if (mf <= 8.9 && mf >= 7.5){
        String B = "B";
        println("Nota B");
    } else if (mf <= 7.4 && mf >= 6){
        String C = "C";
        println("Nota C");
    } else if (mf <= 5.9 && mf >= 4){
        String D = "D";
        println("Nota D");
    } else if (mf <= 3.9 && mf >= 0){
        String E = "E";
        println("Nota E");
    } else {
        println("Nota inválida!");
    }

    if (mf  >= 6 && mf <= 10 ){
        println("APROVADO!");
    } else if (mf <= 5.9 && mf >= 0){
        println("REPROVADO!");
    }

}