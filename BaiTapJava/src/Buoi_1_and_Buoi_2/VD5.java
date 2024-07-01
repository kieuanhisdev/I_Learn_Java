package Buoi_1_and_Buoi_2;

import java.util.Scanner;

public class VD5 {
	public static void main(String[] args) {
		//kiểm tra năm nhuận
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap nam can kiem tra");
		int a = sc.nextInt();
		
		if(a%400==0||a%4==0 && a%100!=0) {
			System.out.println(a + " la nam nhuan");
		}
		else {
			System.out.println(a + " khong phai la nam nhuan");
		}
		
		sc.close();
	}
}
