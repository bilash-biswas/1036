package main

import (
	"fmt"
	"math"
)

func main() {
	var A, B, C, X1, X2, Z float64
	fmt.Scan(&A)
	fmt.Scan(&B)
	fmt.Scan(&C)
	Z = math.Sqrt(B * B - 4 * A * C)
	X1 = (-B + Z) / (2 * A)
	X2 = (-B - Z) / (2 * A)
	if A == 0 || (B * B - 4 * A * C) < 0 {
		fmt.Printf("Impossivel calcular\n")
	} else {
		fmt.Printf("R1 = %.5f\n", X1)
		fmt.Printf("R2 = %.5f\n", X2)
	}
}
