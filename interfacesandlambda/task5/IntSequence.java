package com.nzavod.interfacesandlambda.task5;

public interface IntSequence {
    boolean hasNext();
    int next();
    public static IntSequence constat(int number){
        return new IntSequence(){
            @Override public boolean hasNext() {
                return true;
            }

            @Override public int next() {
                return number;
            }
        };
    }
}
