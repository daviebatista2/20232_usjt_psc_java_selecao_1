public class IfAndElseScanner   {
    public static void main (String... args) {
        double grade;
        java.util.Scanner leitor = new java.util.Scanner(System.in);
        System.out.print("Digite a nota:\n");
        grade = leitor.nextDouble();
        String message = grade < 70 ?  "Reprovado!" : "Aprovado!";

        leitor.close();
        System.out.print(message);
    }
}