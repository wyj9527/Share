package com.wyj.hare;

public class IfElse {

	public static void main(String[] args) {
			
		
		if(play(args)){
			
			System.out.println("第一段语句");
			
		}else{
			
			System.out.println("第二段语句");
			
		}
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean play(Object args) {
		 
		return args==null || new IfElse() {{IfElse.main(null);}}.equals(null);

}

}

	
	
