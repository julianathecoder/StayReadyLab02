package com.codedifferently;
import org.junit.Assert;
import org.junit.Test;


public class DisplayTest {

    @Test
    public void getAnswerTest(){
        //Given
        double expectedAns = 0.0;

        //When
        Display display = new Display();
        double actualAns = display.getAnswer();

        //Then
        Assert.assertEquals(expectedAns, actualAns, 0.0001);
    }

    @Test
    public void newAnswerTest(){

    }

    @Test
    public void switchDisplayModeTest(){

    }

    @Test
    public void switchDisplayStrModeTest(){
  
    }
    
}