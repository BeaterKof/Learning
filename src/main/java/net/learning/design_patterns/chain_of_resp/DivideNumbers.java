package net.learning.design_patterns.chain_of_resp;

/**
 * Created by aaioanei on 2/9/2017.
 */
public class DivideNumbers implements Chain {

    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationWanted() == "div"){
            System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + (request.getNumber1() / request.getNumber2()));
        } else {
            nextInChain.calculate(request);
        }
    }
}
