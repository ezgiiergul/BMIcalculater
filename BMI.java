import javax.swing.JOptionPane;
public class BMI {
    public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Please enter your name:");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Please enter your weight:"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Please enter your height:"));
		double BMI = weight / (height*height);
		JOptionPane.showMessageDialog(null, name+ " your body mass index (BMI) is: " + BMI + " kg/m2" );
		
     
    
        switch (1+(BMI>16 ? 1:0) + (BMI>17 ? 1:0) + (BMI >18.5 ? 1:0) + (BMI>25 ? 1:0) + (BMI>30 ? 1:0) + (BMI>35 ? 1:0) + (BMI>40 ? 1:0)) {
         case 1 :
    	   JOptionPane.showMessageDialog(null, "You are Severe Thinness" );
           break;
         case 2 :
           JOptionPane.showMessageDialog(null, "You are Modarete Thinness" );
           break;
         case 3 :
           JOptionPane.showMessageDialog(null, "You are Mild Thinness" );
           break;
         case 4 :
        	 JOptionPane.showMessageDialog(null, "You are Normal" );
        	 break;
         case 5 :
        	 JOptionPane.showMessageDialog(null, "You are Overweight");
        	 break;
         case 6 :
        	 JOptionPane.showMessageDialog(null, "You are Obese Class I" );
        	 break;
         case 7 :
        	 JOptionPane.showMessageDialog(null, "You are Obese Class II" );
        	 break;
         case 8 :
        	 JOptionPane.showMessageDialog(null, "You are Obese Class III" );
        	 break;
        default : 
        	break; 
     
     }
    
    

}  
}    
    
 
    
    
  
    
    
    
    
    
    
    
    
    
    
    

