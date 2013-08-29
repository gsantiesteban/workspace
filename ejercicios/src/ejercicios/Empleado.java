package ejercicios;

public class Empleado {
	final private String cedula;
	private String apellido;
	private String nombre;
	private double horasTrabajadas;
	private double sueldoXHoras;
	
	public Empleado(String cedula, String apellido, String nombre, double horasTrabajadas, double sueldoXHoras){
		
		if (cedula==null) this.cedula = cedula;
		else this.cedula = "";
		    setApellido(apellido);
		    setNombre(nombre);
		    setSueldoXHoras(sueldoXHoras);
		    setHorasTrabajadas(horasTrabajadas);
		    		    
     }
     public double calcularSalario(){
    	 return horasTrabajadas * sueldoXHoras;
     }
     public String getCedula(){
    	 return cedula;
     }
     public String getApellido(){
    	 return apellido;
     }
     public void setApellido(String apellido){
    	 if (apellido!=null) this.apellido = apellido;
    	 else this.apellido = "";
     }
     public String getNombre(){
    	 return nombre;
     }
     public void setNombre(String nombre){
    	 if(nombre!=null) this.nombre = nombre = "";
     }
     public double getHorasTrabajadas(){
    	 return horasTrabajadas;
     }
     public void setHorasTrabajadas(double horas){
    	 if (horasTrabajadas>=0) this.horasTrabajadas = horas;
    	 else this.horasTrabajadas = 0;
     }
     public double getSueldoXHoras(){
    	 return sueldoXHoras;
     }
     public void setSueldoXHoras(double sueldo){
    	 if (sueldoXHoras>=0) this.sueldoXHoras = sueldo;
    	 else this.sueldoXHoras = 0;
  		 
     }
}
