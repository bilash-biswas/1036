#include<iostream>
#include<iomanip>
#include<cmath>
using namespace std;
int main()
{
    double A,B,C,X1,X2,Z;
    cin>>A;
    cin>>B;
    cin>>C;
    Z = sqrt(B * B - 4 * A * C);
    X1 = ( - B + Z) / (2 * A);
    X2 = ( - B - Z) / (2 * A);
    if(A == 0 || (B * B - 4 * A * C) < 0)
    {
        cout<<"Impossivel calcular"<<endl;
    }
    else
    {
     cout<<"R1 = "<<fixed<<setprecision(5)<<X1<<endl;
     cout<<"R2 = "<<fixed<<setprecision(5)<<X2<<endl;
    }
    return 0;
}
