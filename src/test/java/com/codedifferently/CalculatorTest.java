package com.codedifferently;
import org.junit.*;

public class CalculatorTest {
    @Test
    public void calcTest(){
        //Given 
        Display testDisplay = new Display();
        double expectedDisplayNum = testDisplay.getAnswer();

        //When
        Calculator testCalc = new Calculator();
        double actualCalcDisplay = testCalc.getDisplayNum();

        //Then
        Assert.assertEquals(expectedDisplayNum, actualCalcDisplay, 0.00001);
    }

    @Test
    public void newAnswerTest(){
        //Given
        double expectedAns = 5.0;

        //When
        Calculator calc = new Calculator();
        calc.getDisplayNum();
        double actualAns = calc.getDisplayNum();

        //Then
        Assert.assertEquals(expectedAns, actualAns, 0.0001);

    }

    @Test
    public void addTest(){
        //Given
        double expectedAns = 7.0;
        
        //When
        Calculator calc = new Calculator();
        calc.add(5.0, 2.0);
        double actualAns = calc.getDisplayNum();

        //Then
        Assert.assertEquals(expectedAns, actualAns, 0.0001); //third value is delta - the max between expected and actual for which both numbers are still considered equal.
    }

    @Test
    public void subtractTest() {
        //Given
        double expectedAns = 3.0;

        //When
        Calculator calc = new Calculator();
        calc.subtract(5.0, 2.0);
        double actualAns = calc.getDisplayNum();

        //Then
        Assert.assertEquals(expectedAns, actualAns, 0.0001);
    }

    @Test
    public void multiplyTest(){
        //Given
        double expextedAns = 10.0;

        //When
        Calculator calc = new Calculator();
        calc.multiply(5.0, 2.0);
        double actualAns = calc.getDisplayNum();

        //Then
        Assert.assertEquals(expextedAns, actualAns, 0.0001);
    }

    @Test
    public void divisionTest(){
        //Given
        double expectedAns = 2.0;

        //When
        Calculator calc = new Calculator();
        calc.divide(10.0, 5.0);
        double actualAns = calc.getDisplayNum();

        //Then
        Assert.assertEquals(expectedAns, actualAns, 0.0001);
    }
    
    @Test
    public void squareNumTest(){
    }

    @Test
    public void SqaureRootTest(){

    }

    @Test
    public void exponentTest(){

    }

    @Test
    public void inverseTest(){
    }

    @Test
    public void invertSignTest(){
    }

    @Test
    public void cubeRootTest(){

    }

    @Test
    public void elursTest(){
        
    }
}