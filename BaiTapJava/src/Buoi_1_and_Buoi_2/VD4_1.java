package Buoi_1_and_Buoi_2;

import java.util.Scanner;

public class VD4_1 {
	public static void main(String[] args) {
		//nhân 2 số nguyên
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so a = ");
		int a = sc.nextInt();
		System.out.print("Nhap so b = ");
		int b = sc.nextInt();
		long tich = (long)a*b;
		
		System.out.printf("tich cua %d va %d la %d%n", a , b, tich);
		sc.close();
	}
}
