import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    var A = read.nextDouble()
    var B = read.nextDouble()
    var C = read.nextDouble()
    var Z = Math.sqrt(B*B-4*A*C);
    var X1 = ( - B + Z) / (2 * A);
    var X2 = ( - B - Z) / (2 * A);
    if(A == 0.0 || (B * B - 4 * A * C) < 0)
    {
        println("Impossivel calcular");
    }
    else
    {
        println("R1 = %.5f".format(X1))
        println("R2 = %.5f".format(X2))
    }
}
