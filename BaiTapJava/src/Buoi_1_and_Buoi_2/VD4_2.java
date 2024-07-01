package Buoi_1_and_Buoi_2;

import java.util.Scanner;

	public class VD4_2 {
		public static void main(String[] args) {
			//nhân 2 số nguyên
					Scanner sc = new Scanner(System.in);
					
					System.out.print("Nhap so a = ");
					float a = sc.nextFloat();
					System.out.print("Nhap so b = ");
					float b = sc.nextFloat();
					double tich = (double)a*b;
					
					System.out.printf("tich cua %.2f va %.2f la %.2f%n", a , b, tich);
					sc.close();
		}
	}
