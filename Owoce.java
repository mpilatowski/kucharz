import java.util.Scanner;

public class Owoce {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ile masz jablek?: ");
        int J = scanner.nextInt();

        System.out.print("Ile masz pomaranczy?: ");
        int P = scanner.nextInt();

        System.out.print("Ile masz monet?: ");
        int Z = scanner.nextInt();

        int difference = Math.abs(J - P);
        int quantityApples = J;
        int quantityOranges = P;
        int quantityMoney = Z;

        if (J < P) {
            int maxApples = quantityApples + Math.min(quantityOranges, quantityMoney);
            quantityApples = maxApples;
            quantityOranges = P;
            difference = Math.abs(quantityApples - quantityOranges);
        }

        else if (P < J) {
            int maxOranges = quantityOranges + Math.min(quantityApples, quantityMoney);
            quantityApples = J;
            quantityOranges = maxOranges;
            difference = Math.abs(quantityApples - quantityOranges);
        }

        System.out.println("Minimalna różnica: " + difference);
        System.out.println("Ilość jabłek: " + quantityApples);
        System.out.println("Ilość pomarańczy: " + quantityOranges);
    }
        }


