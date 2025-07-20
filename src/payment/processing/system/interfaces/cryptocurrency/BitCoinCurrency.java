package payment.processing.system.interfaces.cryptocurrency;

import payment.processing.system.entities.Order;

public class BitCoinCurrency implements CryptoCurrency{
    @Override
    public void doPayment(Order order) {
        System.out.println("BitCoin payment : " + order);
    }
}
