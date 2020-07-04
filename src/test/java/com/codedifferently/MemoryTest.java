package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class MemoryTest {

    @Test
    public void addToMemoryTest(){
        //Given
        double expectedVal = 5.0;

        //When
        Memory memory = new Memory();
        memory.addToMemory(5.0);
        double actualVal = memory.getMemoryValue();

        //Then
        Assert.assertEquals(expectedVal, actualVal, 0.0001);
    }

    @Test
    public void resetMemoryTest(){
        //Given 
        double expectedVal = 0.0;

        //When
        Memory memory = new Memory();
        memory.resetMemory();
        double actualVal = memory.getMemoryValue();

        //Then 
        Assert.assertEquals(expectedVal, actualVal, 0.0001);
    }

    @Test
    public void memoryTest(){
        //Given 
        double expectedVal = 0.0;

        //When
        Memory memory = new Memory();
        double actualVal = memory.getMemoryValue();

        //Then
        Assert.assertEquals(expectedVal, actualVal, 0.0001);
    }
}