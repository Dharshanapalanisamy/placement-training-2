public class HarshadNumber {
    public static void main(String[] args) {
        int num = 18, sum = 0, temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println(num + (num % sum == 0 ? " is Harshad" : " is not Harshad"));
    }
}
