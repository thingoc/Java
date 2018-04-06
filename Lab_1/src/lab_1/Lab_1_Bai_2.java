package lab_1;
import java.util.Scanner;
public class Lab_1_Bai_2 {
    public static void main(String[] args) {
        Scanner hcn=new Scanner(System.in);
        int dai, rong;
        System.out.print("Chieu dai: ");
        dai=hcn.nextInt();
        System.out.print("Chieu rong: ");
        rong=hcn.nextInt();
        int chuvi=(dai+rong)*2;
        System.out.print("Chu vi bang: "+chuvi);
        int dientich=dai*rong;
        System.out.print("\nDien tich bang: "+dientich);
        System.out.print("\nCanh nho nhat la: "+Math.min(dai, rong));
    }   
}
