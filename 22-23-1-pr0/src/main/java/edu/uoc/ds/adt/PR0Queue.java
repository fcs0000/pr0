package edu.uoc.ds.adt;

import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

import java.math.BigDecimal;

import static java.lang.Math.sin;

public class PR0Queue {

    public final int CAPACITY = 37;

    private Queue<BigDecimal> queue;

    public PR0Queue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }

    public void fillQueue() {
        for(int n=0;n<=360;n=n+10){
            double k = funcioTrig(n);
            BigDecimal k2 = new BigDecimal(k).setScale(3, BigDecimal.ROUND_HALF_EVEN);
            System.out.print(" "+k2);
            queue.add(k2);
        }
    }

    public String clearFullQueue() {
        StringBuilder sb = new StringBuilder();
        char r;
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
        }
        return sb.toString();
    }

    public Queue<BigDecimal> getQueue() {
        return this.queue;
    }

    //funció trigonomètrica
    public static double funcioTrig(int n){
        double ft = 0;
        double c = Math.toRadians(n);
        ft = sin(c);
        return ft;
    }

}
