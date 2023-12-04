package lista05_ex02;

import java.util.Scanner;

public class Lista05_ex02 {
public static void main(String[] args) {
	
	
	int n1,n2;
	Scanner t = new Scanner(System.in);
	System.out.println("n1");
	n1= t.nextInt();
	System.out.println("n2");
	n2= t.nextInt();
	
	for(int i = n1;i<=n2;i++) {
		System.out.println(i);		
	}		
}
}
