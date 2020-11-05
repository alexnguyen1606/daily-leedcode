package com.leetcode.designparttern.factorymethod.cycle;

/**
 * @author:Nguyen Anh Tuan
 * <p>
 * September 11,2020
 */
public class Tricycle implements Cycle {
    private Tricycle(){

    }
    @Override
    public void run() {
    System.out.println("Tricycle run");
    }
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}
