import java.util.Scanner;

public class dztest1 {
        public static void main(String[] args) {              
                Scanner iScanner = new Scanner(System.in);
                System.out.printf("Хотите продолжить?");
                String a = iScanner.nextLine().toLowerCase();
                System.out.printf(a);
}
}