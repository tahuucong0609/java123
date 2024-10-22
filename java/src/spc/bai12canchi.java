/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SPC
 */
public class bai12canchi {
 public static void main(String[] args) {

String[] can = {"canh", "tan", "nham", "quy", "giap", "at", "binh", "Dinh", "Mau", "Ky"};
String[] Chi = {"than", "Dau", "Tuat", "Hoi", "Ty", "Suu", "Đan", "Meo", "Thin", "Ti", "Ngo", "Mui"};

System.out.println("Chuong Trinh Tinh Can Chi");
Scanner SC = new Scanner(System.in);
System.out.print("Nhap Nam: ");
int nam,namcan,namchi;
nam = SC.nextInt();
namcan = nam %10;
namchi = nam %12;
System.out.print(can [namcan] + " ");
System.out.println(Chi [namchi]);
}
 
 
 
 
}
