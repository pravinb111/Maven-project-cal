package program.sample.controller;

import junit.framework.Assert;
import junit.framework.TestCase;

public class Apptest extends TestCase {
    Calculator cal = new Calculator();

    public void testAdd() {
        Assert.assertEquals(cal.add(10, 20), 30);
    }
    
    public void testAddNeg() {
        Assert.assertEquals(cal.add(10, -20), -10);
    }
    
    public void testAddNeg1() {
        Assert.assertEquals(cal.add(-10, 20), 10);
    }
    
    public void testMultiply() {
        Assert.assertEquals(cal.mul(10, 20), 200);
    }
}