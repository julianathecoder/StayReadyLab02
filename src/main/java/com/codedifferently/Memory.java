package com.codedifferently;

public class Memory {
private double memoryValue;

    public Memory(){
        this.memoryValue = 0.0;
    }

    public void addToMemory(double num){
        this.memoryValue += num;
    }

    public void resetMemory(){
        this.memoryValue = 0.0;
    }

    public double getMemoryValue(){ //Recalls 
        return this.memoryValue;
    }
}