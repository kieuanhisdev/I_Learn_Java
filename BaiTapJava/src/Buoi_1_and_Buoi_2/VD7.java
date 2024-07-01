package Buoi_1_and_Buoi_2;

import java.util.Scanner;

public class VD7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double p, r, n, t;
		
		System.out.println("số tiền gốc la:");
		p = sc.nextDouble();
		System.out.println("lãi xuất hàng năm la:");
		r = sc.nextDouble();
		System.out.println("số lần lãi la:");
		n = sc.nextDouble();
		System.out.println("thời gian tiền được đầu tư hoặc vay la:");
		t = sc.nextDouble();
		
		
		double amount = p * Math.pow(1 + (r / n), n * t);
		double cinterest = amount - p;
		System.out.println("Lãi kép sau " + t + " năm là : "+cinterest);
		System.out.println("Số tiền có được sau " + t + " năm là: "+amount);
		
		sc.close();
	}
}
