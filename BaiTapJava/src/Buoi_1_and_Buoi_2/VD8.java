package Buoi_1_and_Buoi_2;

import java.util.Scanner;

public class VD8 {
	public static void main(String[] args) {
		float p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào số tiền gửi vào ngân hàng : ");
        p = scan.nextFloat();
        System.out.print("Nhập vào lãi xuất hàng năm (%) : ");
        r = scan.nextFloat();
        System.out.print("Nhập vào thời gian gửi (tính bằng năm) : ");
        t = scan.nextFloat();
        scan.close();
        sinterest = (p * r * t) / 100;
        System.out.print("Số tiền lãi là: " +sinterest);
        
        scan.close();
	}
}
