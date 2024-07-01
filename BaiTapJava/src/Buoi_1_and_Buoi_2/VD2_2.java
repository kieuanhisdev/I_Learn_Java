package Buoi_1_and_Buoi_2;

import java.util.Scanner;

public class VD2_2 {
	public static void main(String[] args) {
		//kiểm tra số chẵn lẻ với số nhập vào
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so : ");
		int a = scanner.nextInt();
		
		if(a%2==0) {
			System.out.println(a + " la so chan");
		}
		else {
			System.out.println(a + " la so le");
		}
		
		scanner.close();
	}
}
