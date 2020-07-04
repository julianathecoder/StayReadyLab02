package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigUnitsTest {

    @Test 
    public void TrigUnitTest(){
        //Given
        String expectedUnit = "degree";

        //When
        TrigUnits trigUnits = new TrigUnits(); // must create the object that is of itself first
        String actualUnit = trigUnits.getSetUnit();

        //Then
        Assert.assertEquals(expectedUnit, actualUnit);
    }

    @Test
    public void switchUnitsTest(){
        //Given
        String expectedUnit = "radians";

        //When
        TrigUnits trigUnits = new TrigUnits();
        trigUnits.SwitchUnitsMode();
        String actualUnit = trigUnits.getSetUnit();

        //Then
        Assert.assertEquals(expectedUnit, actualUnit);
    }

    @Test
    public void switchUnitsStrTest(){
        //Given
        String expectedUnit = "radians";

        //When
        TrigUnits trigUnits = new TrigUnits();
        trigUnits.SwitchUnitsMode("radians");
        String actualUnit = trigUnits.getSetUnit();

        //Then
        Assert.assertEquals(expectedUnit, actualUnit);
    }
}