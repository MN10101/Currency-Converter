package currencyconverter;

class USD {
	static double convertToUSD(double amount) {
		// Conversion for USD is already in USD, so return the amount as is.
		return amount;
	}
}

class EUR {
	static double convertToUSD(double amount) {
		// Conversion for EUR to USD using the exchange rate of 1.19.
		return amount * 1.19;
	}
}

class GBP {
	static double convertToUSD(double amount) {
		// Conversion for GBP to USD using the exchange rate of 1.40.
		return amount * 1.40;
	}
}

class PLN {
	static double convertToUSD(double amount) {
		// Conversion for PLN to USD using the exchange rate of 0.25.
		return amount * 0.25;
	}
}

class SYP {
	static double convertToUSD(double amount) {
		// Conversion for SYP to USD using the exchange rate of 0.002.
		return amount * 0.002;
	}
}

public class CurrencyConverter {
	public static void main(String[] args) {
		// Create an array of different currency objects.
		Object[] currencies = { new USD(), new EUR(), new GBP(), new PLN(), new SYP() };
		double amount = 100.0;
		for (Object currency : currencies) {
			if (currency instanceof USD) {
				System.out.println("Exchange USD Amount is: " + USD.convertToUSD(amount));
			} else if (currency instanceof EUR) {
				System.out.println("Exchange EUR Amount is: " + EUR.convertToUSD(amount));
			} else if (currency instanceof GBP) {
				System.out.println("Exchange GBP Amount is: " + GBP.convertToUSD(amount));
			} else if (currency instanceof PLN) {
				System.out.println("Exchange PLN Amount is: " + PLN.convertToUSD(amount));
			} else if (currency instanceof SYP) {
				System.out.println("Exchange SYP Amount is: " + SYP.convertToUSD(amount));
			}
		}
	}
}


