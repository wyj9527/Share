package com.wyj.hare;

public class IfElse {

	public static void main(String[] args) {
			
		
		if(play(args)){
			
			System.out.println("��һ�����");
			
		}else{
			
			System.out.println("�ڶ������");
			
		}
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean play(Object args) {
		 
		return args==null || new IfElse() {{IfElse.main(null);}}.equals(null);

}

}

	
	
