var
A,B,C,X1,X2,Z : double;
begin
    read(A);
    read(B);
    read(C);
    
    if(A = 0)then
        writeln('Impossivel calcular')
    else if((B * B - 4 * A * C) < 0.0)then
        writeln('Impossivel calcular')
    else
    begin
        Z := sqrt(B * B - 4 * A * C);
        X1 := (- B + Z) / (2 * A);
        X2 := (- B - Z) / (2 * A);
        writeln('R1 = ',X1:-1:5);
        writeln('R2 = ',X2:-1:5);
    end
    
end.
