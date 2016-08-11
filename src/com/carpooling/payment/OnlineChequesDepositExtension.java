package com.carpooling.payment;

public class OnlineChequesDepositExtension extends PaymentDecorator
{
	public OnlineChequesDepositExtension(Payment payment) 
	{
		// TODO Auto-generated constructor stub
		super(payment);
	}
	public void collectPayment()
	{
		super.collectPayment();
	}
	//change to fraud detection
	public void increasePayment()
	{
		payment.setAccountBalance(payment.getAccountBalance()+100);
	}
	public void decreasePayment()
	{
		payment.setPercentageTax(payment.getAccountBalance()-100);
	}

}
