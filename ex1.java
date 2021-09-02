import java.util.Scanner;

class Suma {

   public static void main( String[] args ) {
      int a, b, c = 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "DIGITE DOIS NÚMEROS: ");
      a = s.nextInt();
      b = s.nextInt();
      c = a + b;
      System.out.println( "A SOMA DE a E b: " + c );
   }
