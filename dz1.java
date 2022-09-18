import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        int a;        
        do{
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        String var1 = iScanner.nextLine();
        int var2 = Integer.parseInt(var1.trim());
        System.out.printf("Введите второе число: ");
        String var3 = iScanner.nextLine();
        int var4 = Integer.parseInt(var3.trim());
        System.out.printf("Введите желаемую операцию: ");
        String operation = iScanner.nextLine();
            int result = 0;
            switch (operation){
                case "+": result = var2 + var4; break;
                case "-": result = var2 - var4; break;
                case "*": result = var2 * var4; break;
                case "/": result = var2 / var4; break;
                default:throw  new IllegalArgumentException("Некорректная операция! Попробуйте еще раз: ");
            }
        System.out.println("Результат: " + result);
        System.out.printf("Хотите продолжить? 1 - Да; 0 - Нет.");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();;
        }
        while(a > 0);
        {
            System.out.printf("До встречи!");
        }
         
    }
                             
}
