package com.nt.enums;

enum Beer2{
	KF,KO,RC,FO ;
}

public class Test2 {

	public static void main(String[] args) {

		Beer2[] b1=Beer2.values();
		for(Beer2 x:b1) {
			System.out.println(x+"........."+x.ordinal()); 

			Beer2 beer2=Beer2.FO;
			System.out.println(beer2);
		}
	}	

}
