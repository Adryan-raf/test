import java.io.IOException;
 
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        
        int dif = a*b -c*d;
        
        System.out.printf("DIFERENCA = %d\n", dif);
    }

}
