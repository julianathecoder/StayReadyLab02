package com.codedifferently;
//Each operation automatically updates the display

public class Calculator {
    private Display display;

    public Calculator(){
        this.display = new Display();
    }

    //Calculator Core Features
    public void clear(){
        this.display.updateAnswer(0.0);
    }
 
    public double getDisplayNum(){
        return this.display.getAnswer();
    }

    public void newDisplayNum(double answer){ //updating the display
        this.display.updateAnswer(answer);
    }

    public void add(double firstValue, double secondValue){ 
        double answer = firstValue+secondValue;
        this.display.updateAnswer(answer);
    }

    public void subtract(double firstValue, double secondValue){
        double answer = firstValue - secondValue;    
        this.display.updateAnswer(answer);        
    }

    public void multiply(double firstValue, double secondValue){
        double answer = firstValue * secondValue;
        this.display.updateAnswer(answer);
    }

    public void divide(double firstValue, double secondValue){
        if(firstValue == 0.0 || secondValue == 0.0){
            this.display.getErr(); //"Cannot divide by zero."
            clear();
        } 
        double answer = firstValue / secondValue;
        this.display.updateAnswer(answer);
    }

    public void squareNum(double num){
         double answer = Math.pow(num, 2);
         this.display.updateAnswer(answer);
    }

    public void squareRoot(double num){
        while(num < 0.0){
            this.display.getErr(); //"Cannot calculate squareRoot less than 0.0."
            clear();
        } 
        double answer = Math.sqrt(num);
        this.display.updateAnswer(answer);
    }

    public void exponent(double num, double powerOf){
        double answer = Math.pow(num, powerOf);
        this.display.updateAnswer(answer);
    }

    public void inverse(double num){
        if(num < 0.0){
            this.display.getErr(); //"Cannot take the inverse of zero"
            clear();
        }
        double answer = 1 / num;
        this.display.updateAnswer(answer);
    }

    public void invertSign(double num){ //negate the value
        double answer = - num ;
        this.display.updateAnswer(answer);
    }   

    // Custom Features
    public void cubeRoot(double num){
        while(num < 0.0){
            this.display.getErr(); //"Cannot calculate cubeRoot less than 0.0."
            clear();
        }
        double answer = Math.cbrt(num);
        this.display.updateAnswer(answer);
    }

    public void eulersNum(double num){ //e in mathematics 
        double answer = Math.exp(num);
        this.display.updateAnswer(answer);
    }
}