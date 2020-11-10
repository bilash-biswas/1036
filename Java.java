import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    double A,B,C,X1,X2,Z;
    A = input.nextDouble();
    B = input.nextDouble();
    C = input.nextDouble();

    Z = Math.sqrt(B * B - 4 * A * C);
    X1 = ( - B + Z) / (2 * A);
    X2 = (- B - Z) / (2 * A);
    if(A == 0 || (B * B - 4 * A * C) < 0)
    {
        System.out.printf("Impossivel calcular\n");
    }
    else
    {
     System.out.printf("R1 = %.5f\n", X1);
     System.out.printf("R2 = %.5f\n", X2);
    }

     }
    
}
