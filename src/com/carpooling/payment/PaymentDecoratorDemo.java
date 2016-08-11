package com.carpooling.payment;

public class PaymentDecoratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payment paymentOne;
		paymentOne = new CreditCardPayment();
		paymentOne.collectPayment();

		PayPalExtension paymentTwo = new PayPalExtension(paymentOne);
		paymentTwo.collectPayment();
		paymentTwo.increasePayment();
		paymentTwo.decreasePayment();

	}

}
