package com.dam.principal;
 import com.dam.serveis.CalculadoraPreus;
  public class Main { 
  public static void main(String[] args) 
{ double[] preus = {15.50, 42.00, 8.25, 120.00};
 int[] quantitats = {2, 6, 12, 1};
double acumuladorFactura = 0.0;

for (int i = 0; i < preus.length; i++) 
{ double costLinia = CalculadoraPreus.calcularPreuFinal(preus[i], quantitats[i]);
acumuladorFactura += costLinia;
System.out.println("Article " + (i + 1) + ": " + costLinia + " €");
  } 
 System.out.println("Totalfactura a cobrar: " + acumuladorFactura + " €"); } }