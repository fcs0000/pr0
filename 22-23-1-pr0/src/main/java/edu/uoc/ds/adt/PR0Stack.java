package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

import java.math.BigDecimal;

import static java.lang.Math.sin;

public class PR0Stack {
    public final int CAPACITY = 37;

    private Stack<BigDecimal> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<BigDecimal>(CAPACITY);
    }

    public void fillStack() {
        for(int n=0;n<=360;n=n+10){
            double k = funcioTrig(n);
            BigDecimal k2 = new BigDecimal(k).setScale(3, BigDecimal.ROUND_HALF_EVEN);
            System.out.print(" "+k2);
            stack.push(k2);
        }
    }

    public String clearAllStack() {
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop()).append(" ");
        return sb.toString();
    }

    public Stack<BigDecimal> getStack() {
        return this.stack;
    }

    public void push(BigDecimal c) {
        this.stack.push(c);
    }

    public static double funcioTrig(int n){
        double ft = 0;
        double c = Math.toRadians(n);
        ft = sin(c);
        return ft;
    }
}
