
public class Clase {
	static int A=7,B=15;
	
	public static void main(String[] args) {
		int P;
		P=A;
		A=B;
		B=P;
		System.out.println("valor de A= "+A);
		System.out.println("valor de B= "+B);
		if (A>B) {
			System.out.println("Mayor A");
		} else {
			System.out.println("mayor B");
		}
		// TODO Auto-generated method stub

	}

}
