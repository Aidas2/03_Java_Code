import lt.itakademija.exam.*;

public class CurrencyConverterImpl implements CurrencyConverter {

    private final CurrencyRatesProvider currencyRatesProvider; //kad keisti pradziai reikia zinot keitimo santyki

    public CurrencyConverterImpl(CurrencyRatesProvider currencyRatesProvider) {
        this.currencyRatesProvider = currencyRatesProvider;
    }

    @Override
    public Money convert(Currency from, Currency to, Money amount) { //eilute generuojasi pati

        Money rate = currencyRatesProvider.getRate(from, to); //kad keisti pradziai reikia zinot keitimo santyki

        if (rate == null) { //patikrinimas ar keitimo santykis turi duomenis (nera null)
            throw new CurrencyConversionException("Could  not convert currency ... ");
        }

        return amount.multiply(rate);
    }
}
