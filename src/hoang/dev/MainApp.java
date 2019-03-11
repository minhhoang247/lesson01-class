package hoang.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rt[] = new Rectangle[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < rt.length; i++ ) {
			System.out.println("Nhap vao chieu rong :");
			rt[i] = new Rectangle();
			rt[i].width = sc.nextInt();
			System.out.println("Nhap vao chieu dai :" );
			rt[i].height = sc.nextInt();
		}
		
		for (int i = 0; i < rt.length; i++ ) {
			System.out.println("Chu vi hcn" +  i  + " la: " + rt[i].chuVi() );
			System.out.println("Dien tich hcn" +  i  + " la: " + rt[i].dienTich());	
		}
	}
	
	static void printArray(Rectangle rt[]) {
		for (int i = 0; i < rt.length; i++ ) {
			System.out.println("rt[" + i + "]");
			System.out.println("Dien tich hcn: " + rt[i].dienTich());
			System.out.println("Chu vi hcn: " + rt[i].chuVi());
		}
	}
	
	static void findMax(Rectangle rt[]) {
		Rectangle max = rt[0];
		for (int i = 0; i < rt.length; i++ ) {
			if(max.dienTich() < rt[i].dienTich())
				max = rt[i];
		}
			System.out.println("HCN lon nhat: " + max.dienTich());
		
	}

}
