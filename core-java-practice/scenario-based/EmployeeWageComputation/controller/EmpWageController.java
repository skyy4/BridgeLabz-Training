package controller;

import service.IEmpWageBuilder;
import service.EmpWageBuilder;

public class EmpWageController {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

        IEmpWageBuilder empWageBuilder = new EmpWageBuilder();

        // UC 8 – Multiple Companies
        empWageBuilder.addCompanyEmpWage("TCS", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("Infosys", 25, 22, 120);

        empWageBuilder.computeEmpWage();

        System.out.println("Total Wage of TCS: " +
                empWageBuilder.getTotalWage("TCS"));

        System.out.println("Total Wage of Infosys: " +
                empWageBuilder.getTotalWage("Infosys"));
    }
}
