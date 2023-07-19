package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId(){
        Job jobOne = new Job();
        Job jobTwo = new Job();
        assertNotEquals(jobOne.getId(),jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob instanceof Job);
        Assert.assertEquals(testJob.getName(),"Product tester");
        assertTrue(testJob.getEmployer() instanceof Employer);
        Assert.assertEquals(testJob.getEmployer().getValue(), "ACME");
        assertTrue(testJob.getLocation() instanceof Location);
        Assert.assertEquals(testJob.getLocation().getValue(), "Desert");
        assertTrue(testJob.getPositionType() instanceof PositionType);
        Assert.assertEquals(testJob.getPositionType().getValue(), "Quality control");
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        Assert.assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(jobOne.equals((jobTwo)));
    }

}
