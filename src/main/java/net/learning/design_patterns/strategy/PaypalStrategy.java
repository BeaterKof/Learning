package net.learning.design_patterns.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: Andrei
 * Date: 9/28/15
 * Time: 2:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class PaypalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal.");
    }

}