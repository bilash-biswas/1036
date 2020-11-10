var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines = input.split(' ');
var A = parseFloat(lines.shift());
var B = parseFloat(lines.shift());
var C = parseFloat(lines.shift());

var X1,X2,Z;

Z = Math.sqrt(B * B - 4 * A * C);
X1 = ( - B + Z) / (2 * A);
X2 = ( - B - Z) / (2 * A);
if(A === 0 || (B * B - 4 * A * C) < 0)
{
    console.log("Impossivel calcular");
}
else
{
    console.log("R1 = " + X1.toFixed(5));
    console.log("R2 = " + X2.toFixed(5));
}
