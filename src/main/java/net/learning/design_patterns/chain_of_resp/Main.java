package net.learning.design_patterns.chain_of_resp;

/**
 * created by: andrei
 * date: 19.11.2018
 **/
/*
    This pattern sends data to an object and if that object can't use it, it sends it to any number of other objects
    that may be able to use it.


 */
public class Main {

    public static void main(String[] args){

        Chain chain1 = new AddNumbers();
        Chain chain2 = new SubtractNumbers();
        Chain chain3 = new MultNumbers();
        Chain chain4 = new DivideNumbers();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);

        Numbers request = new Numbers(4, 1, "add");

        chain1.calculate(request);
    }
}