/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Lab_1_Bai_1 {  
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ho va ten: ");
        String Hoten=scanner.nextLine();
        System.out.print("Diem tb: ");
        double Diemtb=scanner.nextDouble();
        System.out.printf("%s %f diem",Hoten,Diemtb);
    }
}
