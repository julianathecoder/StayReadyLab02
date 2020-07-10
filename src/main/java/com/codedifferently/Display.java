package com.codedifferently;

public class Display {
   private double answer;
   private String displayErr;
   private String mode;
  // private String[] displayModes = {"binary", "decimal", "hexadecimal", "octal"};

    public Display(){
        this.answer = 0.0;
        this.displayErr = "Err";
        this.mode = "decimal"; //default mode, unless changed
    }

    public double getAnswer(){
         return this.answer;
    }

    public void updateAnswer(double newAnswer){
        this.answer = newAnswer;
    }

    public String getErr(){
        return this.displayErr;
    }

    public void switchDisplayMode(){
        if(mode.equalsIgnoreCase("binary")){
            mode = "octal";
        }
        else if(mode.equalsIgnoreCase("octal")){
            mode = "decimal";
        }
        else if(mode.equalsIgnoreCase("decimal")){
            mode = "hexadecimal";
        }
        else if(mode.equalsIgnoreCase("hexadecimal")){
            mode = "binary";
        }
        else{
            System.out.print("Not a valid mode");
        }
    }

    public void switchDisplayMode(String modeSwitch){ 
       modeSwitch = modeSwitch.toLowerCase();
        switch (modeSwitch) {
            case "binary":
                this.mode = modeSwitch;
                break;
            case "decimal":
                this.mode = modeSwitch;
                break;
            case "hexadecimal":
                this.mode = modeSwitch;
                break;
            case "octal":
                this.mode = modeSwitch;
                break;
            default:
                break;

        }
    }
}