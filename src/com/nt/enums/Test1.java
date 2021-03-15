package com.nt.enums;
 
enum Beer1{
	KF,KO,RC,FO ;
}



public class Test1 {

	public static void main(String[] args) {

		Beer1 b1 =Beer1.RC;
		System.out.println(b1);
		
		switch(b1) {
		
		case KF:
			System.out.println("It is KF brand");
			break;
		
		case KO:
			System.out.println("It is KO brand");
			break;
			
		case RC:
			System.out.println("It is RC brand");
			break;
			
		case FO:
			System.out.println("It is FO brand");
			break;
			
			default :
				System.out.println("None of ur choice");
			
			
		}
		
	}
}