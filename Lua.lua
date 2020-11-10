A = io.read("*n")
B = io.read("*n")
C = io.read("*n")
Z = math.sqrt(B * B - 4 * A * C)
X1 = ( - B + Z) / (2 * A)
X2 = ( - B - Z) / (2 * A)
if (A == 0 or (B * B - 4 * A * C) < 0) then
    print("Impossivel calcular")
else
    print("R1 = "..string.format( "%.5f", X1 ))
    print("R2 = "..string.format( "%.5f", X2 ))
end
