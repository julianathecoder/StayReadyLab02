package com.codedifferently;

public class ScientificCalculator extends Calculator {
    private Display display;
    private Memory memory;
    private TrigUnits trigUnits;

public ScientificCalculator(){
    this.display = display;
    this.memory = memory;
    this.trigUnits = trigUnits; 
}

//Switch display mode
public void switchDisplayMode(){
    this.display.switchDisplayMode();
}

public void switchDisplayMode(String modeSwitch){
    this.display.switchDisplayMode(modeSwitch);
}

//Memory
public void addMemory(double num){
    this.memory.addToMemory(num);
}

public void resetMemory(){
    this.memory.resetMemory();
}

public double getMemory(){
    return this.memory.getMemoryValue();
}

//Trig Functions
public void sine(){

}

public void cosine(){

}

public void tangent(double num){

}

public void inverseSine(double num){

}

public void inverseCosine(double num){

}

public void inverseTangent(double num){

}

public void factorial(double num){

}

//Switch trig units mode
public void switchUnitsMode(){

}

public void switchUnitsMode(String mode){
    
}

//Logarithmic functions
public void log(){

}

}