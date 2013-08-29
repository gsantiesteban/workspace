 package parcial;

 import java.util.Scanner;

 public class puntotres {

	 
		static double num1,num2;
	    static double division;
		
		

		private static Scanner m;
		
	public static void main(String[] args) {
		
		m= new Scanner(System.in);
		
		
		System.out.print("Ingrese el primer numero:");
       num1=m.nextDouble();
        System.out.println();
    	System.out.print("Ingrese el segundo numero:");
    	num2=m.nextDouble();
    	System.out.println();
    	
    	num1=num2;
    	num2=num1;
    	
    	System.out.println("El valor del Primer numero es: "+num1+"  y el valor del segundo numero es: "+num2);
    	
    	if (num1<num2){
    	
    	      if ((num1%num2)==0)
    		
    		division=num1/num2;
    	System.out.println("la division de los dos numero digitados es: "+division);
    	
    	}
    	
    	else {
    		
    		System.out.println("los numeros no son divisibles");
		
    	}
    		

	}

}
