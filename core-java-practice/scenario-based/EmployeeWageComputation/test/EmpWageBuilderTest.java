package test;

import org.junit.jupiter.api.Test;
import service.EmpWageBuilder;

import static org.junit.jupiter.api.Assertions.*;

public class EmpWageBuilderTest {

    @Test
    public void testTotalWage() {

        EmpWageBuilder builder = new EmpWageBuilder();

        builder.addCompanyEmpWage("ABC", 20, 10, 50);
        builder.computeEmpWage();

        int totalWage = builder.getTotalWage("ABC");

        assertTrue(totalWage >= 0);
    }
}
