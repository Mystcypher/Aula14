import static java.lang.IO.*;

void main() {
    IO.println("1 - Opção 1");
    IO.println("2 - Opção 2");
    IO.println("3 - Opção 3");
    IO.println("4 - Sair");

    IO.print("Digite uma opção: ");
    int op = Integer.parseInt(readln());

    if (op == 1){
        IO.println("Você selecionou a opção 1!");
    } else if (op == 2){
        IO.println("Você selecionou a opção 2!");
    } else if (op == 3){
        IO.println("Você selecionou a opção 3!");
    } else if (op == 4){
        IO.println("Você selecionou sair!");
    } else {
        IO.println("Opção inválida!!!");
    }

    IO.print("Fim do programa!");
}