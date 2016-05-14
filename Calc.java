/**
 * Created by Roman on 14.05.2016.
 */
import java.util.Scanner;

public class Calc {
    public Calc() {
    }

    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int n1 = sc.nextInt();
        System.out.println("Введите второе число:");
        int n2 = sc.nextInt();
        System.out.println("Введите знак операции:");
        String op = sc.next();
        sc.close();
        switch(op.hashCode()) {
            case 42:
                if(op.equals("*")) {
                    res = n1 * n2;
                }
                break;
            case 43:
                if(op.equals("+")) {
                    res = n1 + n2;
                }
                break;
            case 45:
                if(op.equals("-")) {
                    res = n1 - n2;
                }
                break;
            case 47:
                if(op.equals("/")) {
                    res = n1 / n2;
                }
        }

        System.out.println(res);
    }
}
