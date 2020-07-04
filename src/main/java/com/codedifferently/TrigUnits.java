package com.codedifferently;

public class TrigUnits {
   private String setUnit;
   
   public TrigUnits(){
      this.setUnit = "degree"; //default unit, unless changed
   }
   public String getSetUnit(){ //Dont test getters
      return this.setUnit;
   }
   public void SwitchUnitsMode(){
      if(this.setUnit == "degree"){
         this.setUnit = "radians";
      } else {
         this.setUnit = "degree";
      }
   }
   public void SwitchUnitsMode(String mode){
      this.setUnit = mode;   
   }
}
