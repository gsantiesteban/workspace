package parcial;

import java.util.Scanner;

public class puntouno {
	
	
		static int sueldob;
		static int hextrasd, hextrasn;
		static double vhextras;
	    static double incrd;
		static double incrn;
		static double incrf;
	    static int diasf;
	    static double stotal, stotald;
		

		private static Scanner teclado;

		public static void main(String[] args) {
			
	teclado= new Scanner(System.in);

	    	
	        System.out.print("Ingrese el sueldo basico del empleado:");
	        sueldob=teclado.nextInt();
	        System.out.println();
	    	System.out.print("Digite las horas extras trabajadas diurnas");
	    	hextrasd=teclado.nextInt();
	    	System.out.println("Ingrese el incremento por horas extras diurnas trabajadas");
	    	incrd=teclado.nextDouble();
	    	System.out.println();
	    	System.out.print("Digite las horas extras trabajadas nocturnas");
	    	hextrasn=teclado.nextInt();
	    	System.out.println("Ingrese el incremento por horas extras nocturnas trabajadas");
	    	incrn=teclado.nextDouble();
	    	System.out.println();
	    	System.out.print("Digite los dias festivos trabajados");
	    	diasf=teclado.nextInt();
	    	System.out.println("Ingrese el incremento por dias festivos trabajados");
	    	incrf=teclado.nextDouble();
	    	System.out.println();
	    	
	    	vhextras=((sueldob/240)*(hextrasd*incrd)+(hextrasn*incrn)+(diasf*incrf));
	    	
	    	stotal=(vhextras+sueldob);	   
	    	System.out.println("El sueldo SIN descuento del empleado es:   "+stotal);
	    	System.out.println();
	    	
	    	stotald=(stotal*0.20);
	    	System.out.println("El sueldo CON descuento del empleado es:   "+stotald);
	    	System.out.println();
	    	System.out.println("El descuento que la empresa manifiesta es del 20%");
	    	
	    	
	    		
	    		
		
		    	
	   
		}

	}
