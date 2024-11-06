package org.launchcode.techjobs.oo;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Tested;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;
import java.lang.reflect.Type;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job tJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(tJob.getName(), "Product tester");
        assertTrue(tJob.getName() instanceof String);

        assertEquals(tJob.getEmployer().getValue(), "ACME");
        assertTrue(tJob.getEmployer() instanceof Employer);

        assertEquals(tJob.getLocation().getValue(), "Desert");
        assertTrue(tJob.getLocation() instanceof Location);

        assertEquals(tJob.getPositionType().getValue(), "Quality control");
        assertTrue(tJob.getPositionType() instanceof PositionType);

        assertEquals(tJob.getCoreCompetency().getValue(), "Persistence");
        assertTrue(tJob.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        Job jobA = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobB = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(jobA, jobB);

    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job tJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        tJob.toString().startsWith(System.lineSeparator());
        tJob.toString().endsWith(System.lineSeparator());

    }
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job tJob = new Job("Product tester", new Employer("ACME"), new Location("Peru"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String tString =  tJob.toString();

        tString.contains("Job: Product tester");
        tString.contains("Employer: ACME");
        tString.contains("Location: Peru");
        tString.contains("Position Type: Quality control");
        tString.contains("Core Competency: Persistence");
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job tJob= new Job(" ", new Employer(" "), new Location(" " ), new PositionType(" "), new CoreCompetency(" "));
      String tString = tJob.toString();
        tString.contains("Job: Data not available");
        tString.contains("Employer: Data not available");
        tString.contains("Location: Data not available");
        tString.contains("Position Type: Data not available");
        tString.contains("Core Competency: Data not available");

    }

}



