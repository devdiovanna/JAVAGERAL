public class Equals {
    public static void main(String [] args) {
        String nome1 = "Maria";
        String nome2 = "Pedro";
        String nome3 = new String("Joao");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
}
