import java.util.*;

public class PowerEfficientIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        sc.close();
        PowerEfficientIterative p = new PowerEfficientIterative();
        System.out.println(p.power(base, power));
    }

    public double power(int a, int b) {
        int temp = a;
        double res = 1;
        while (b > 0) {
            if (b % 2 != 0) {
                res *= temp;
            }
            temp = temp * temp;
            b /= 2;
        }
        return res;
    }
}
