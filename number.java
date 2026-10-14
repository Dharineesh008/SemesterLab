import java.util.Scanner;

public class number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        int p = s.length();
        int sum = 0;
        for (int i = 0; i < p; i++) {
            int d = s.charAt(i) - '0';
            sum += (int) Math.pow(d, p);
        }
        if (sum ==n) System.out.println(n + " is an Armstrong number");
        else System.out.println(n + " is not an Armstrong number");
        sc.close();
    }
}