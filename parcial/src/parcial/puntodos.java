package parcial;

import java.util.Scanner;

public class puntodos {

	private static Scanner d;
	
	public static void main(String[] args) {
		

		
				d = new Scanner (System.in);		  	   
				   		   
				double nota,ntotal = 0,dnota, pnotas;
			double x=0.0;
			double max=0, min=5;
				
				System.out.println("ingrese las notas del estudiante,teniendo en cuenta que la calificacion debe ser de 0 a 5 ");
				System.out.println();
				
                while (x<5.0){
					
					x++;
					
					System.out.println();
					
				System.out.println("Digite la  "+x+"  nota del estudiante");
				nota=d.nextDouble();
				
               
				ntotal= ntotal +nota;
				System.out.println();
				
               
                
				pnotas= ntotal /5;
				dnota=(nota*2);
			
				System.out.println("El total de las notas es: "+ntotal);
				
				System.out.println ("El promedio de notas del estudiante es "+pnotas);
				
				System.out.println("El doble de la nota es: "+dnota);
				
				
				if (min>nota)
					min=nota;
				
				if (max<nota)
					max=nota;
				
                }
                
                System.out.println("La nota minima es:  "+min+ " y la nota maxima es: "+max);
                System.out.println();
				System.out.println();
				
				
                
					
				
				
		}
		}		