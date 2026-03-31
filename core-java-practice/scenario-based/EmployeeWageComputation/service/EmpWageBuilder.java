package service;

import model.CompanyEmpWage;
import java.util.ArrayList;

public class EmpWageBuilder implements IEmpWageBuilder {

    // UC 12 – Using ArrayList instead of array
    private ArrayList<CompanyEmpWage> companyList;

    public EmpWageBuilder() {
        companyList = new ArrayList<>();
    }

    // UC 8 – Compute wage for multiple companies
    // UC 9 – Save total wage for each company
    @Override
    public void addCompanyEmpWage(String companyName, int wagePerHour,
                                  int maxWorkingDays, int maxWorkingHours) {

        companyList.add(new CompanyEmpWage(companyName, wagePerHour,
                maxWorkingDays, maxWorkingHours));
    }

    // UC 10 – Manage multiple companies
    @Override
    public void computeEmpWage() {

        for (CompanyEmpWage company : companyList) {

            int totalWorkingDays = 0;
            int totalWorkingHours = 0;

            // UC 7 – Calculate till condition (100 hrs & 20 days)
            while (totalWorkingDays < company.maxWorkingDays &&
                    totalWorkingHours < company.maxWorkingHours) {

                totalWorkingDays++;

                int empHrs = 0;

                int attendance = (int) (Math.random() * 3);

                // UC 4 – Switch Case
                switch (attendance) {

                    case 1: // UC 1 – Present
                        empHrs = 8;
                        break;

                    case 2: // UC 3 – Part Time
                        empHrs = 4;
                        break;

                    default: // Absent
                        empHrs = 0;
                }

                totalWorkingHours += empHrs;

                // UC 2 – Daily Wage Calculation
                int dailyWage = empHrs * company.wagePerHour;

                // UC 13 – Store Daily Wage
                company.dailyWages.add(dailyWage);
            }

            int totalWage = totalWorkingHours * company.wagePerHour;

            company.setTotalEmpWage(totalWage);
        }
    }

    // UC 14 – Get Total Wage by Company
    @Override
    public int getTotalWage(String companyName) {

        for (CompanyEmpWage company : companyList) {
            if (company.companyName.equals(companyName)) {
                return company.getTotalEmpWage();
            }
        }
        return -1;
    }
}
