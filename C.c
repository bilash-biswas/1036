#include<stdio.h>
#include<math.h>
int main()
{
    double A,B,C,X1,X2,Z;
    scanf("%lf",&A);
    scanf("%lf",&B);
    scanf("%lf",&C);

    Z = sqrt(B * B - 4 * A * C);
    X1 = ( - B + Z) / (2 * A);
    X2 = ( - B - Z) / (2 * A);
    if(A == 0 || (B * B - 4 * A * C) < 0)
    {
        printf("Impossivel calcular\n");
    }
    else
    {
     printf("R1 = %.5lf\n", X1);
     printf("R2 = %.5lf\n", X2);
    }
    return 0;
}
