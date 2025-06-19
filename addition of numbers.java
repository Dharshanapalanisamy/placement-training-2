import java.util.Scanner; 
class Addition {  
    public static void main(String[] args) {
        int a,b,sum;  
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers to be added: "); 
        a = input.nextInt(); 
        b = input.nextInt(); 
        sum = a + b;  
        System.out.println("Solution: " + sum); 
    }
}
