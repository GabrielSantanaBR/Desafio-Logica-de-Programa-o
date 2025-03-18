import java.util.Scanner;
import java.util.Locale;

public class RankHeroi {
    public static void main(String[] args) {
        //crinado o objeto scaner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Você é um aventureiro novo? (s/n)");
        String resposta = scanner.nextLine();

        if (resposta.equals("s")) {
            System.out.println("Bem vindo a Guilda herói, informe seu nome para registro!");

            System.out.println("Digite seu nome: ");
        String nomeRegistro = scanner.nextLine();

        System.out.println("Informe sua classe: ");
        String classe = scanner.nextLine();

        String rank = "Ferro";

        System.out.println(nomeRegistro + " o(a) " + classe + " ,você está no rank " + rank + " por enquanto, mas com o tempo e esforço você pode subir de rank!");

        } else {
            System.out.println("Gostaria de saber seu rank atual? (s/n)");
        String resposta1 = scanner.nextLine();

        if (resposta1.equals("s")) {

            System.out.println("Informe seu nome: ");
            String nomeLogin = scanner.nextLine();

            System.out.println("Seu nivel de XP atual: ");
            int xP = scanner.nextInt();

            if (xP <= 1000) {
                System.out.println(nomeLogin + ", você está no rank Ferro, parabéns! Seus dados foram salvos no codigo ");
            } else if (xP <= 2000) {
                System.out.println(nomeLogin + ", você está no rank Bronze, parabéns! Seus dados foram salvos no codigo ");
            } else if (xP <= 3000) {
                System.out.println(nomeLogin + ", você está no rank Prata, parabéns! Seus dados foram salvos no codigo " );
            } else if (xP <= 4000) {
                System.out.println(nomeLogin + ", você está no rank Ouro, parabéns! Seus dados foram salvos no codigo ");
            } else if (xP <= 5000) {
                System.out.println(nomeLogin + ", você está no rank Platina, parabéns! Seus dados foram salvos no codigo ");
            } else if (xP <= 6000) {
                System.out.println(nomeLogin + ", você está no rank Esmeralda, parabéns! Seus dados foram salvos no codigo ");
            } else if (xP <= 7000) {
                System.out.println(nomeLogin + ", você está no rank Diamante, parabéns! Seus dados foram salvos no codigo ");
            } else if (xP <= 8000) {
                System.out.println(nomeLogin + ", você está no rank Mestre, parabéns! Seus dados foram salvos no codigo ");
            } else if (xP <= 9000) {
                System.out.println(nomeLogin + ", você está no rank Grão-mestre, parabéns! Seus dados foram salvos no codigo ");
            } else if (xP > 9000) {
                System.out.println(nomeLogin + ", você está no rank Desafiante, parabéns! Seus dados foram salvos no codigo " );
            } else {
                System.out.println("Você não possui rank ou não foi possivel identificar seu rank Seus dados foram salvos no codigo ");
            }
        } else if (resposta1.equals("n")) {
            System.out.println("Obrigado por utilizar nosso sistema!");
        }
    }
    System.out.println("Caso precise de mais alguma coisa, estamos a disposição!");
        scanner.close();

    }
}
