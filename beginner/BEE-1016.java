import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input= new Scanner(System.in); 
        
        int distance = input.nextInt();
        
        int time = 2*distance;
        System.out.printf("%d minutos\n",time);
    }
}
