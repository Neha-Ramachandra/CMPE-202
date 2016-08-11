package com.carpooling.payment;

public class PayPalExtension extends PaymentDecorator 
{
	public PayPalExtension(Payment payment) 
	{
		// TODO Auto-generated constructor stub
		super(payment);
	}
	public void collectPayment()
	{
		super.collectPayment();
	}
	//change to credit limit
	public void increasePayment()
	{
		payment.setAccountBalance(payment.getCreditLimit()+1000.0);
	}
	public void decreasePayment()
	{
		payment.setAccountBalance(payment.getCreditLimit()-1000.0);
	}

}
