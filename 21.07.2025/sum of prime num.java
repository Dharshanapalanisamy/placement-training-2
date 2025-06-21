import java.util.Scanner;
public class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), r = sc.nextInt(), sum = 0;
        for(int i = l; i <= r; i++) {
            int c = 0;
            for(int j = 2; j < i; j++) if(i % j == 0) c++;
            if(i > 1 && c == 0) sum += i;
        }
        System.out.println(sum);
    }
}
