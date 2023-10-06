// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        // write your code here

        int nota = 80;
        String graduacao;

    // A 80 B 70 C 60 D 0
    if (nota >=80) {
        graduacao = "A";
    } else if (nota < 80 && nota >= 70) {
        graduacao = "B";
    } else if (nota < 70 && nota >=60) {
        graduacao = "C";
    } else if (nota < 60 && nota >=0) {
        graduacao = "D";
    } else {
        graduacao = "NUll";
    }

    switch (graduacao) {
        case "A":
            case "B":
                System.out.println("Aluno aprovado!");
        case "C":
        case "D":
            System.out.println("Não aprovado");
        default:
            System.out.println("Graduação inválida");
    }
    }
}
