package com.carpooling.payment;

public abstract class PaymentDecorator extends Payment
{
	protected Payment payment;
	public PaymentDecorator(Payment pay) 
	{
		// TODO Auto-generated constructor stub
		payment = pay;
	}
	
	public void collectPayment()
	{
		payment.collectPayment();
	}

}
