package Buoi_1_and_Buoi_2;

import java.util.Scanner;

public class VD6 {
	public static void main(String[] args) {
		//kiem tra chu cai la nguyen am hay phu am (A,E,I,O,U (cả chữ thường lẫn chữ hoa) được gọi là nguyên âm)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap chu cai can kiem tra:");
		char ch = sc.next().charAt(0);
		
		boolean isVowel = false;
		
		switch (ch) {
			case 'A' : 
			case 'a' :
			case 'E' :
			case 'e' :
			case 'I' :
			case 'i' :
			case 'O' :
			case 'o' :
			case 'U' :
			case 'u' : isVowel = true;
		}
		
		if(isVowel) {
			System.out.println(ch + " Day la nguyen am");
		}
		else if (ch>='a'&&ch<='z' || ch>='A'&&ch<='Z') {
			System.out.println(ch + " Day la phu am");
		}
		else {
			System.out.println(ch + " khong nam trong bang chu cai");
		}
			
		sc.close();
	}
}
