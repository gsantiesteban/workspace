
public class software {
	public  static void main (String[]args){ 



}
	double sueldo(int dias,double sueldo){
		double suel=sueldo/30*dias;
		return suel;
	}
	double sueldo(int fes,int noc,int domi,double sueldo,int dias){
		double suel=sueldo/240*(fes*1.75+noc*1.25+domi*2.25);
		suel=sueldo/30*dias+suel;
		return suel;
	}
	void factura( double valorar,int canti){
		
	}
	void factura(double valorar,float iva, int canti){
		
	}
}