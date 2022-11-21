package metier;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testCalculeMnsualite {
	
	private ICredietMetier metier;

	@Before
	public void setUp() throws Exception {
		metier =new CreditMetierImplementatio();
	}

	@Test
	public void testCalculerMesualiteCredit() {
		
		double c=200000;
		int d =240;
		double t=4.5;
		
		double RA = 1265.2987;
		double RC=metier.calculerMesualiteCredit(c, t, d);
		assertEquals(RA, RC, 0.0001);
	}

}
