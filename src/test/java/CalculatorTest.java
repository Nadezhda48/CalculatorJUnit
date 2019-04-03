import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    ICalculator iCalculator;

    @Before
      public void setUp() {
        iCalculator = new Calculator("76");
    }

    @Test
        public void metodPlus() {

        Assert.assertEquals(5, iCalculator.metodPlus(2, 3), 0);
        Assert.assertEquals(399852, iCalculator.metodPlus(58904, 340948), 0);
        Assert.assertEquals(0.0001, iCalculator.metodPlus(0, 0.0001), 0);
        Assert.assertEquals(148.901, iCalculator.metodPlus(197.901, -49), 0);
        Assert.assertEquals(-256, iCalculator.metodPlus(-120, -136), 0);
        Assert.assertEquals(-794.36, iCalculator.metodPlus(-694.2, -100.16), 0);
    }

    @Test
    public void metodMinus() {

        Assert.assertEquals(32, iCalculator.metodMinus(41, 9), 0);
        Assert.assertEquals(-516.86, iCalculator.metodMinus(32.14, 549), 0);
        Assert.assertEquals(0, iCalculator.metodMinus(0, 0), 0);
        Assert.assertEquals(44.13, iCalculator.metodMinus(0, -44.13), 0);
        Assert.assertEquals(954326, iCalculator.metodMinus(-189810, -1144136), 0);
       // Assert.assertEquals(-758.921, iCalculator.metodMinus(0.1, 759.021), 0);
    }

    @Test
    public void metodDivision() {

        //Assert.assertEquals(0.02222222, iCalculator.metodDivision(1, 45), 0);
       // Assert.assertEquals(0, iCalculator.metodDivision(0, 38), 0);
       // Assert.assertEquals(1000, iCalculator.metodDivision(0.1, 0.0001), 0);
        //Assert.assertEquals(0.22098765, iCalculator.metodDivision(-17.9, -81), 0);
        //Assert.assertEquals("E", iCalculator.metodDivision(-11, 0), 0);
        //Assert.assertEquals(0.004853551, iCalculator.metodDivision(4567412, 941045401), 0);
    }

    @Test
    public void metodMultiplication() {

        Assert.assertEquals(13, iCalculator.metodMultiplication(13, 1), 0);
        Assert.assertEquals(0, iCalculator.metodMultiplication(584, 0), 0);
       // Assert.assertEquals(0.4518, iCalculator.metodMultiplication(4518, 0.0001), 0);
        Assert.assertEquals(35629, iCalculator.metodMultiplication(-451, -79), 0);
        Assert.assertEquals(60.72, iCalculator.metodMultiplication(-10.12, -6), 0);
        Assert.assertEquals(92378672, iCalculator.metodMultiplication(92, 1004116), 0);
    }


    @Test
    public void metodSqrt() {

        Assert.assertEquals(5, iCalculator.metodSqrt(25), 0);
        Assert.assertEquals(10, iCalculator.metodSqrt(100), 0);
        Assert.assertEquals(0, iCalculator.metodSqrt(0), 0);
        Assert.assertEquals(20, iCalculator.metodSqrt(400), 0);
        Assert.assertEquals(1, iCalculator.metodSqrt(1), 0);
        Assert.assertEquals(26.9814751264640829, iCalculator.metodSqrt(728), 0);
    }
}