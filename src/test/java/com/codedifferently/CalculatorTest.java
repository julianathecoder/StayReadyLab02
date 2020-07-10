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
        double actualCalcDisplay = testCalc.getDisplayAns();

        //Then
        Assert.assertEquals(expectedDisplayNum, actualCalcDisplay, 0);
    }

    @Test
    public void newAnswerTest(){
        //Given
        double expectedAns = 5.0;

        //When
        Calculator calc = new Calculator();
        calc.newDisplayNum(5.0);
        double actualAns = calc.getDisplayAns();

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
        double actualAns = calc.getDisplayAns();

        //Then
        Assert.assertEquals(expectedAns, actualAns, 0.0001); //delta - the max between expected and actual for which both numbers are still considered equal.
    }

    @Test
    public void subtractTest() {
        //Given
        double expectedAns = 3.0;

        //When
        Calculator calc = new Calculator();
        calc.subtract(5.0, 2.0);
        double actualAns = calc.getDisplayAns();

        //Then
        Assert.assertEquals(expectedAns, actualAns, 0.0001);
    }

    @Test
    public void multiplyTest(){
        //Given
        double expextedAns = 10;

        //When
        Calculator calc = new Calculator();
        calc.multiply(5.0, 2.0);
        double actualAns = calc.getDisplayAns();

        //Then
        Assert.assertEquals(expextedAns, actualAns, 0.0001);
    }

    @Test
    public void divisionTest(){
        //Given
        double expectedAns = 3.0;

        //When
        Calculator calc = new Calculator();
        calc.divide(6.0, 2.0);
        double actualAns = calc.getDisplayAns();

        //Then
        Assert.assertEquals(expectedAns, actualAns, 0.0001);
    }
    
    @Test
    public void squareNumTest(){
        //Given
        double expectedAns = 16;

        //When
        Calculator calc = new Calculator();
        calc.squareNum(4.0);
        double actualAns = calc.getDisplayAns();

        //Then
        Assert.assertEquals(expectedAns, actualAns, 0.0001);
    }

    @Test
    public void SqaureRootTest(){
        //Given
        double expectedAns = 12;

        //When
        Calculator calc = new Calculator();
        calc.squareRoot(144);
        double actualAns = calc.getDisplayAns();

        //Then
        Assert.assertEquals(expectedAns, actualAns, 0.0001);
    }

    @Test
    public void exponentTest(){

        double expectedAns = 8.0;

        Calculator calc = new Calculator();
        calc.exponent(2, 3); 
        double actualAns = calc.getDisplayAns();

        Assert.assertEquals(expectedAns, actualAns, 0.0001);
    }

    @Test
    public void inverseTest(){

        double expectedAns = 0.5;

        Calculator calc = new Calculator();
        calc.inverse(2); 
        double actualAns = calc.getDisplayAns();

        Assert.assertEquals(expectedAns, actualAns, 0.0001);
    }

    @Test
    public void invertSignTest(){
        double expectedAns = -2;

        Calculator calc = new Calculator();
        calc.invertSign(2); 
        double actualAns = calc.getDisplayAns();

        Assert.assertEquals(expectedAns, actualAns, 0.0001);
    }

    @Test
    public void cubeRootTest(){

        double expectedAns = 4.0;

        Calculator calc = new Calculator();
        calc.cubeRoot(64); 
        double actualAns = calc.getDisplayAns();

        Assert.assertEquals(expectedAns, actualAns, 0.0001);
    }

    @Test
    public void elursTest(){
        
        double expectedAns = 20.0855;

        Calculator calc = new Calculator();
        calc.eulersNum(3); 
        double actualAns = calc.getDisplayAns();

        Assert.assertEquals(expectedAns, actualAns, 0.0001);
    }
}