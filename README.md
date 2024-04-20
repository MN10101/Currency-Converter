# Currency Converter

This is a simple Java program for converting various currencies to USD. It includes conversion methods for USD, EUR, GBP, PLN, and SYP currencies.

## Usage

To use this program, simply run the `CurrencyConverter` class. It will display the equivalent amount in USD for a given input amount in each supported currency.

## How It Works

Each currency has a corresponding class with a static method `convertToUSD(double amount)` which takes an amount in the currency and returns its equivalent in USD based on predefined exchange rates.

## Supported Currencies and Exchange Rates

- USD (United States Dollar): 1 USD = 1 USD
- EUR (Euro): 1 EUR = 1.19 USD
- GBP (British Pound): 1 GBP = 1.40 USD
- PLN (Polish Zloty): 1 PLN = 0.25 USD
- SYP (Syrian Pound): 1 SYP = 0.002 USD

## Author

- Mahmoud Najmeh

## License

This project is licensed under the Apache License 2.0 - see the LICENSE file for

## Example

```java
public class CurrencyConverter {
    public static void main(String[] args) {
        double amount = 100.0;
        Object[] currencies = { new USD(), new EUR(), new GBP(), new PLN(), new SYP() };
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

- This will output:
Exchange USD Amount is: 100.0
Exchange EUR Amount is: 119.0
Exchange GBP Amount is: 140.0
Exchange PLN Amount is: 25.0
Exchange SYP Amount is: 0.2

 details.
