package entradas;

import java.util.Scanner; 
public class entradas {

public static void main (String [] args){
	Scanner x=new Scanner (System.in);
	int r=x.nextInt(); 
	int m=x.nextInt();
	int a=0;
	System.out.println("introduce el primer numero"+" "+r);
	System.out.println("introduce el segundo numero"+ " "+ m);
	int s=r+m;
	System.out.println("el resultado"+" "+s);

	
	a=r;
	r=m;
    m=a;
   System.out.println("valor de r"+" "+ r);
   System.out.println("valor de m"+" "+m);
   
   int numero1,numero2;
   
   if (r>m) {
	   System.out.println("el numero mayor"+" "+r);
	   System.out.println("el numero menor"+ " "+m);
	
} else {
	System.out.println("el numero mayor"+" "+m );
	System.out.println("el numero menor"+" "+r);

	numero1=m;
	numero2=r;
	
	
	System.out.println("la potencia es"+" "+Math.pow(numero1, numero2) );
	
	if (m>r) {
		System.out.println("el numero mayor"+" "+m);
		   System.out.println("el numero menor"+ " "+r);
	} else {
		System.out.println("el numero mayor"+" "+r);
		   System.out.println("el numero menor"+ " "+m);

	}
	
	if (m%3 ==0) {
		System.out.println("es multiplo de m ");
		
	} else {
      System.out.println("no es multiplo de m  ");
        
	}
	if (r%3 ==0) {
		System.out.println("es multiplo de r ");
		
	} else {
      System.out.println("no es multiplo de r ");
      
   
	}
}
   
   
	



 }
}
