package com.nzavod.interfacesandlambda.task4;

public interface IntSequence {
    boolean hasNext();
    int next();
    public static IntSequence of(int ... m){
        return new IntSequence() {
            int count = 0;
            @Override public boolean hasNext() {
                if(count < m.length){
                    return true;
                }
                return false;
            }

            @Override public int next() {
                count++;
                return m[count-1];
            }
        };
    }

}
