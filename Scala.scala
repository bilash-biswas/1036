object Main {
  def main(args:Array[String]){
    var Array(a,b,c) = scala.io.StdIn.readLine().split(" ").map(_.toDouble)
    var Z = scala.math.sqrt(b * b - 4 * a * c)
    var X1 = ( - b + Z) / (2 * a)
    var X2 = ( - b - Z) / (2 * a)
    if(a == 0 || (b * b - 4 * a * c) < 0)
    {
        println("Impossivel calcular")
    }
    else
    {
     println("R1 = %.5f".format(X1))
     println("R2 = %.5f".format(X2))
    }
  }
}
