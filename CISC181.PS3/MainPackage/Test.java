package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account c;
		
		Account ID  = new Account(1122, 0);
		Account Balance = new Account(20000, 0);
		Account AnnualInterestRate = new Account(0, 0.045);
		}
		@Before
		public void setUp() throws Exception {
			Account c = new Account(101, 0);
		}

		@After
		public void tearDown() throws Exception {
			Object c = null;
		}

		@Test
		public final void testwithdraw()throws InsufficientFundsException {
			int x = 0;
			while (x < 20) {
				Account c;
				c.withdraw(2500);
		}
	}
		@Test
		public final void testdeposit()throws InsufficientFundsException {
			int x = 0;
			while (x < 20) {
				Account c;
				c.deposit(3000);
		}		
	}

		//Ran out of time so this is what I was able to complete so far.

}
