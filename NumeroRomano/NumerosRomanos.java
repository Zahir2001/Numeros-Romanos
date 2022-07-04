import java.util.Scanner;

public class NumerosRomanos {

  public static void main(String[] args) {
      
     Scanner input = new Scanner(System.in);
     int N;

      do {
             System.out.print("Introduzca un numero entre 1 y 3999: ");
             N = input.nextInt();
      } 
      while (N < 1 || N > 3999);
      System.out.println(N + " en numeros romanos es: " + convNumerosRomanos(N));                            
  }

  public static String convNumerosRomanos(int num) {
      
     int i, miles, centenas, decenas, unidades;
      String romano = "";
      
      miles = num / 1000;
      centenas = num / 100 % 10;
      decenas = num / 10 % 10;
      unidades = num % 10;

      for (i = 1; i <= miles; i++) {
             romano = romano + "M";
      }


      if (centenas == 9) {
          romano = romano + "CM";
      }
      else if (centenas >= 5) {
          romano = romano + "D";
          for (i = 6; i <= centenas; i++) {
               romano = romano + "C";
          }
      }
      else if (centenas == 4) {
          romano = romano + "CD";
      }
      else {
          for (i = 1; i <= centenas; i++) {
               romano = romano + "C";
             }
      }


      if (decenas == 9) {
          romano = romano + "XC";
      }
      else if (decenas >= 5) {
          romano = romano + "L";
          for (i = 6; i <= decenas; i++) {
               romano = romano + "X";
          }
      }
      else if (decenas == 4) {
          romano = romano + "XL";
      }
      else {
          for (i = 1; i <= decenas; i++) {
                romano = romano + "X";
               }
      }


      if (unidades == 9) {
          romano = romano + "IX";
      }
      else if (unidades >= 5) {
          romano = romano + "V";
          for (i = 6; i <= unidades; i++) {
               romano = romano + "I";
          }
      }
      else if (unidades == 4) {
          romano = romano + "IV";
      }
      else {
          for (i = 1; i <= unidades; i++) {
               romano = romano + "I";
          }
      }
      return romano;
  }
}