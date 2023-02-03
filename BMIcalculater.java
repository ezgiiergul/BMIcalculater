package dataStructures;
import java.util.*;
public class BMIcalculater {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Enter your weight in kg: ");
	    double weight = scan.nextDouble();
	    
	    System.out.println("Enter your height in mt: ");
	    double height = scan.nextDouble(); 
	    
	    System.out.println(" Your bmi is: " +bmiCal(weight, height));
	    
	    double bmi = bmiCal(weight , height); 
	   
	   
    if( bmi < 17) {
	    	System.out.println("You are thin");
	    }
	    else if (bmi>18 && bmi<25) {
	    	System.out.println("You are normal");
	   }
	    else if (bmi>26 && bmi<30) {
	    	System.out.println("You are obese");
	    }
	    else if (bmi>30) {
	    	System.out.println("You are exceed obese");
	    }  
	    
	}
	   
       static double bmiCal (double weight , double height) {
    	   double bmiCal = ( weight / ((height/100) * (height/100)) );
    	   return bmiCal;
       }
       
     
}
