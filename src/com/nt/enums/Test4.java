package com.nt.enums;

enum Beer4{
	KF(60),KO(65),RC(70),FO(75),KALYANI;
	
	int price;
	
	Beer4(){
		this.price=80;
	}
	Beer4(int price){
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	
}
public class Test4 {

	public static void main(String[] args) {

		Beer4[] b =Beer4.values();
	
		for(Beer4 xx:b) {
			System.out.println(xx+"...."+xx.getPrice());
		}
		
	}

}
