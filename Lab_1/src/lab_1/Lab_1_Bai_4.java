
package lab_1;
import java.util.Scanner;
public class Lab_1_Bai_4 {
    public static void main(String[] args) {
       Scanner ptbac2=new Scanner(System.in);
       float a, b, c;
       System.out.print("Nhap a: ");
       a=ptbac2.nextInt();
       System.out.print("Nahp b: ");
       b=ptbac2.nextInt();
       System.out.print("Nhap c: ");
       c=ptbac2.nextInt();
       float delta = (float) (Math.pow(b, 2)- 4*a*c);
       System.out.print("Can delta bang: "+(float)(Math.sqrt(delta)));
    }
}
