/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
public class VehicleElectricTest {
    
    public VehicleElectricTest() {
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
     * Test of getMinRpm method, of class VehicleElectric.
     */
    @Test
    public void testGetMinRpm() {
        System.out.println("getMinRpm");
        VehicleElectric instance = new VehicleElectric();
        instance.setMinRPM(300);
        double expResult = 300.0;
        double result = instance.getMinRpm();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getMaxRpm method, of class VehicleElectric.
     */
    @Test
    public void testGetMaxRpm() {
        System.out.println("getMaxRpm");
        VehicleElectric instance = new VehicleElectric();
        instance.setMaxRPM(500);
        double expResult = 500.0;
        double result = instance.getMaxRpm();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getFinalDriveRatio method, of class VehicleElectric.
     */
    @Test
    public void testGetFinalDriveRatio() {
        System.out.println("getFinalDriveRatio");
        VehicleElectric instance = new VehicleElectric();
        instance.setFinalDriveRatio(20);
        double expResult = 20.0;
        double result = instance.getFinalDriveRatio();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getGearbox method, of class VehicleElectric.
     */
    @Test
    public void testGetGearbox() {
        System.out.println("getGearbox");
        VehicleElectric instance = new VehicleElectric();
        List<Gear> gears = new LinkedList<>();
        Gear g1 = new Gear(01, 3);
        Gear g2 = new Gear(02, 0);
        Gear g3 = new Gear(03, 1);
        Gear g4 = new Gear(04, 2);
        gears.add(g1);
        gears.add(g2);
        gears.add(g3);
        gears.add(g4);
        Gearbox gearbox = new Gearbox(gears);
        instance.setGearbox(gearbox);
        Gearbox expResult = gearbox;
        Gearbox result = instance.getGearbox();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAccelerator method, of class VehicleElectric.
     */
    @Test
    public void testGetAccelerator() {
        System.out.println("getAccelerator");
        VehicleElectric instance = new VehicleElectric();
        
        List<Regime> regimeList = new LinkedList<>();
        
        Regime r1 = new Regime(10, 20, 4, 8, 1);
        Regime r2 = new Regime(20, 40, 5, 6, 2);
        Regime r3 = new Regime(19, 29, 1, 7, 3); 
        
        regimeList.add(r1);
        regimeList.add(r2);
        regimeList.add(r3);
        Throttle t1 = new Throttle(regimeList);
        Map<Integer, Throttle> throttleMap = new HashMap<>();
        throttleMap.put(25, t1);
         
        Accelerator accelerator = new Accelerator();
        accelerator.setThrottleList(throttleMap);
        instance.setAccelerator(accelerator);
        Accelerator expResult = accelerator;
        Accelerator result = instance.getAccelerator();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaximumEngineVelocity method, of class VehicleElectric.
     */
    @Test
    public void testGetMaximumEngineVelocity() {
        System.out.println("getMaximumEngineVelocity");
        VehicleElectric instance = new VehicleElectric();
        instance.setWheelSize(1.8);
        instance.setFinalDriveRatio(1.2);
        instance.setMaxRPM(200);
        
        List<Gear> gears = new LinkedList<>();
        Gear g1 = new Gear(01, 3);
        Gear g2 = new Gear(02, 2);
        Gear g3 = new Gear(03, 1);
        Gear g4 = new Gear(04, 2);
        gears.add(g1);
        gears.add(g2);
        gears.add(g3);
        gears.add(g4);
        Gearbox gearbox = new Gearbox(gears);
        instance.setGearbox(gearbox);
        
        double expResult = 56.548667764616276;
        double result = instance.getMaximumEngineVelocity();
        assertEquals(expResult, result, 0.0);
    }
//
//    /**
//     * Test of getEnergyRegenerationRatio method, of class VehicleElectric.
//     */
//    @Test
//    public void testGetEnergyRegenerationRatio() {
//        System.out.println("getEnergyRegenerationRatio");
//        VehicleElectric instance = new VehicleElectric();
//        double expResult = 0.0;
//        double result = instance.getEnergyRegenerationRatio();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMinRPM method, of class VehicleElectric.
//     */
//    @Test
//    public void testSetMinRPM() {
//        System.out.println("setMinRPM");
//        double m_min_rpm = 0.0;
//        VehicleElectric instance = new VehicleElectric();
//        instance.setMinRPM(m_min_rpm);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMaxRPM method, of class VehicleElectric.
//     */
//    @Test
//    public void testSetMaxRPM() {
//        System.out.println("setMaxRPM");
//        double m_max_rpm = 0.0;
//        VehicleElectric instance = new VehicleElectric();
//        instance.setMaxRPM(m_max_rpm);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setFinalDriveRatio method, of class VehicleElectric.
//     */
//    @Test
//    public void testSetFinalDriveRatio() {
//        System.out.println("setFinalDriveRatio");
//        double m_final_drive_ratio = 0.0;
//        VehicleElectric instance = new VehicleElectric();
//        instance.setFinalDriveRatio(m_final_drive_ratio);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setGearbox method, of class VehicleElectric.
//     */
//    @Test
//    public void testSetGearbox() {
//        System.out.println("setGearbox");
//        Gearbox m_gearbox = null;
//        VehicleElectric instance = new VehicleElectric();
//        instance.setGearbox(m_gearbox);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAccelerator method, of class VehicleElectric.
//     */
//    @Test
//    public void testSetAccelerator() {
//        System.out.println("setAccelerator");
//        Accelerator m_accelerator = null;
//        VehicleElectric instance = new VehicleElectric();
//        instance.setAccelerator(m_accelerator);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEnergyRegenerationRatio method, of class VehicleElectric.
//     */
//    @Test
//    public void testSetEnergyRegenerationRatio() {
//        System.out.println("setEnergyRegenerationRatio");
//        double m_energy_regeneration_ratio = 0.0;
//        VehicleElectric instance = new VehicleElectric();
//        instance.setEnergyRegenerationRatio(m_energy_regeneration_ratio);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class VehicleElectric.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        VehicleElectric instance = new VehicleElectric();
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of validateElectricVehicle method, of class VehicleElectric.
//     */
//    @Test
//    public void testValidateElectricVehicle() {
//        System.out.println("validateElectricVehicle");
//        VehicleElectric instance = new VehicleElectric();
//        boolean expResult = false;
//        boolean result = instance.validateElectricVehicle();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of copy method, of class VehicleElectric.
//     */
//    @Test
//    public void testCopy() {
//        System.out.println("copy");
//        VehicleElectric instance = new VehicleElectric();
//        Vehicle expResult = null;
//        Vehicle result = instance.copy();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
