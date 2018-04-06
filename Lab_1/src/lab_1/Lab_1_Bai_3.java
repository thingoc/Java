package lab_1;
import java.util.Scanner;
public class Lab_1_Bai_3 {
    public static void main(String[] args) {
        Scanner lapphuong=new Scanner(System.in);
        System.out.print("Chieu dai canh: ");
        int canh=lapphuong.nextInt();
        System.out.print("The tich tich bang: "+Math.pow(canh, 3));
    }
}
