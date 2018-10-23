/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprogramita1;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class binariodecimalascii {

  public static void main(String[] args) throws IOException {
    long numero, aux, digito, decimal;
     int exponente;
     boolean esBinario;
     Scanner sc = new Scanner(System.in);

     do {
          System.out.print("Introduce un numero binario: ");
          numero = sc.nextLong();
          esBinario = true;
          aux = numero;
          while (aux != 0) {
                     digito = aux % 10;
                     if (digito != 0 && digito != 1) { 
                          esBinario = false; 
                     }
                     aux = aux / 10; 
           }
      } while (!esBinario); 

      exponente = 0;
      decimal = 0;
      while (numero != 0) {
                digito = numero % 10;
                decimal = decimal + digito * (int) Math.pow(2, exponente);
                exponente++;
                numero = numero / 10;
      }
      System.out.println("Decimal: " + decimal);
      char digit = (char) decimal;
      System.out.println("Representacion en ASCII de " + decimal + " es " + digit); 
   }
}
