using System;

namespace Sum
{
    class Program
    {
        static void Main(string[] args)
        {
            double A,B,C,D,E,Z,X1,X2;
            var p = Console.ReadLine().Split();
            A = Double.Parse(p[0]);
            B = Double.Parse(p[1]);
            C = Double.Parse(p[2]);
            Z = Math.Sqrt(B * B - 4 * A * C);
            X1 = (- B + Z) / (2 * A);
            X2 = (- B - Z) / (2 * A);
            if (A == 0 || (B * B - 4 * A * C) < 0)
            {
                Console.WriteLine("Impossivel calcular");
            }
            else
            {
                Console.WriteLine("R1 = " + string.Format("{0:0.00000}", X1));
                Console.WriteLine("R2 = " + string.Format("{0:0.00000}", X2));
            }
            Console.ReadLine();
        }
    }
}
