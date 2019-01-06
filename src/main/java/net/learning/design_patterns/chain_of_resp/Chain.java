package net.learning.design_patterns.chain_of_resp;

/**
 * Created by aaioanei on 2/9/2017.
 */
public interface Chain {

    public void setNextChain(Chain nextChain);

    public void calculate(Numbers request);
}
