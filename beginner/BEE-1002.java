import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        double pi = 3.14159;
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double a = pi*r*r;
        System.out.printf("A=%.4f\n",a);
    }
 
}
