
public class FORMATO {
	int edad;
	boolean sexo;
	String telefono;
	static String nombre;
	
	FORMATO (int edad, String nombre) {
		this.edad=edad;
		this.nombre=nombre;
	}
	FORMATO(String nombre,boolean sexo,int edad){	
	this.nombre=nombre;
	this.sexo=sexo;
	this.edad=edad;
	   
	
	}
	
String comprobar(){
			if (edad>18)
			return "mayor";
		
			else 
				return "menor";
	}
	
public static void main (String X[]) {
			FORMATO X1=new FORMATO("lukas",true,23);
			System.out.println(X1.comprobar());
			
		}
		
		
	
String mostrar(){
	if (edad==23)
	return "joven";

	else 
		return "adolescente";
	

}
public static void main1 (String t[]) {
	FORMATO t1=new FORMATO("lukas",true,23);
	System.out.println(t1.mostrar());
	System.out.println(nombre);
}
}



	
	
	
	
	
