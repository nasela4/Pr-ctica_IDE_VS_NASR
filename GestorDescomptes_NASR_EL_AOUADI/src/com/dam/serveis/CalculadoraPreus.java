package com.dam.serveis;
 public class CalculadoraPreus { 
public static double calcularPreuFinal(double preuBase, int quantitat) 
{ double descompte = 0.0;
if (quantitat >= 5 && quantitat < 10)
 { descompte = 0.10; } //10%

else if (quantitat >= 10)
 { descompte = 0.20;} // 20% 
 
double preuAmbDescompte = preuBase - (preuBase * descompte);
double total = preuAmbDescompte * quantitat;
return total; }
}