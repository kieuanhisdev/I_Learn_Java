package Buoi_1_and_Buoi_2;

import java.util.Scanner;

public class VD1_2 {
	public static void main(String[] args) {
		//cộng 2 số sử dụng scanner (nhập từ bàn phím)
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: ");
		int a = sc.nextInt();
		System.out.println("Nhap so thu hai: ");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("Tong 2 so tren la " + sum);
		sc.close();
}
}
