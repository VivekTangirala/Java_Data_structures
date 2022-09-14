import java.util.*;

public class PowerEfficientRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        sc.close();
        PowerEfficientRecursive p = new PowerEfficientRecursive();
        System.out.println(p.power(base, power));
    }

    public double power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        double temp = power(a, b / 2);
        temp = temp * temp;
        if (b % 2 == 0) {
            return temp;
        }
        return temp * a;
    }

}