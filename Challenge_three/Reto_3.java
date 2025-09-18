//Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers..
package retos;

public class Reto_3 {
	
	    public static void main(String[] args){
	    	byte num1 = 3;
	    	byte num2 = 8;
	    	byte num3 = 5;
	    	byte num4= 4;
	    	
	    	System.out.println(Reto_3.EvenOrOdd(num1));
	    	System.out.println(Reto_3.EvenOrOdd(num2));
	    	System.out.println(Reto_3.EvenOrOdd(num3));
	    	System.out.println(Reto_3.EvenOrOdd(num4));
	    }
	    
	    public static String EvenOrOdd(int num){
 	        if(num % 2 == 0) {
 	        	return "Even";
	    } else {
	    	return "odd"; 
	    }
	}
	    

}
