package metier;

public class testMetier {

	public static void main(String[] args) {
		CreditMetierImplementatio metier =new CreditMetierImplementatio() ;
		double c =200000;
		int d =240;
		double t=4.5;
		double m = metier.calculerMesualiteCredit(c, t, d);
	   System.out.println(m);
	}

}
