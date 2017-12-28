/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.calculations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel Santos <1161386@isep.ipp.pt>
 */
public class UnitConversionTest {
    
    public UnitConversionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convertKilometersToMeters method, of class UnitConversion.
     */
    @Test
    public void testConvertKilometersToMeters() {
        System.out.println("convertKilometersToMeters");
        String distance = "10";
        double expResult = 10000.0;
        double result = UnitConversion.convertKilometersToMeters(distance);
        assertEquals(expResult, result, 0.0);
        
        distance = "100";
        expResult = 1000.0;
        result = UnitConversion.convertKilometersToMeters(distance);
        assertNotEquals(expResult, result);
        
    }

    /**
     * Test of convertKilometersPerHourToMetersPerSecond method, of class UnitConversion.
     */
    @Test
    public void testConvertKilometersPerHourToMetersPerSecond() {
        System.out.println("convertKilometersPerHourToMetersPerSecond");
        String velocity = "20";
        double expResult = 5.555555555555555;
        double result = UnitConversion.convertKilometersPerHourToMetersPerSecond(velocity);
        assertEquals(expResult, result, 0.0);
        
        velocity = "30";
        expResult = 5.555555555555555;
        result = UnitConversion.convertKilometersPerHourToMetersPerSecond(velocity);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of convertMilesPerHourToKilometersPerHour method, of class UnitConversion.
     */
    @Test
    public void testConvertMilesPerHourToKilometersPerHour() {
        System.out.println("convertMilesPerHourToKilometersPerHour");
        String velocity = "20";
        double expResult = 32.18688;
        double result = UnitConversion.convertMilesPerHourToKilometersPerHour(velocity);
        assertEquals(expResult, result, 0.0);
        
        velocity = "30";
        expResult = 37.18688;
        result = UnitConversion.convertMilesPerHourToKilometersPerHour(velocity);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of convertMilesToKilometers method, of class UnitConversion.
     */
    @Test
    public void testConvertMilesToKilometers() {
        System.out.println("convertMilesToKilometers");
        String distance = "1";
        double expResult = 1.609344;
        double result = UnitConversion.convertMilesToKilometers(distance);
        assertEquals(expResult, result, 0.0);
        
        distance = "2";
        expResult = 2.18688;
        result = UnitConversion.convertMilesToKilometers(distance);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of convertGramsToKiloGrams method, of class UnitConversion.
     */
    @Test
    public void testConvertGramsToKiloGrams() {
        System.out.println("convertGramsToKiloGrams");
        String weight = "500";
        double expResult = 0.5;
        double result = UnitConversion.convertGramsToKiloGrams(weight);
        assertEquals(expResult, result, 0.0);
        
        weight = "100";
        expResult = 0.2;
        result = UnitConversion.convertGramsToKiloGrams(weight);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of convertKmToMeters method, of class UnitConversion.
     */
    @Test
    public void testConvertKmToMeters() {
        System.out.println("convertKmToMeters");
        double km = 10.0;
        double expResult = 10000.0;
        double result = UnitConversion.convertKmToMeters(km);
        assertEquals(expResult, result, 0.0);

        km = 5.0;
        expResult = 6000.0;
        result = UnitConversion.convertKmToMeters(km);
        assertNotEquals(expResult, result);        
    }

//    /**
//     * Test of convertToPretendedUnity method, of class UnitConversion.
//     */
//    @Test
//    public void testConvertToPretendedUnity() {
//        System.out.println("convertToPretendedUnity");
//        String number = "";
//        String pretended = "";
//        double expResult = 0.0;
//        double result = UnitConversion.convertToPretendedUnity(number, pretended);
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}