import java.util.*;

public class EmployeeWageComputation {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 8;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        // UC1: Check Employee is Present or Absent
        int attendance = random.nextInt(2);
        if (attendance == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

        // UC2: Calculate Daily Employee Wage
        int dailyWage = 0;
        if (attendance == 1)
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOURS;
        System.out.println("Daily Wage = " + dailyWage);

        // UC3: Add Part Time Employee & Wage
        int partTimeWage = WAGE_PER_HOUR * PART_TIME_HOURS;
        System.out.println("Part Time Wage = " + partTimeWage);
 
        // UC4: Solving using Switch Case Statement
        int empType = random.nextInt(3);
        int empHours = 0;

        switch (empType) {
            case 1:
                empHours = FULL_DAY_HOURS;
                break;
            case 2:
                empHours = PART_TIME_HOURS;
                break;
            default:
                empHours = 0;
        }

        int empWage = empHours * WAGE_PER_HOUR;
        System.out.println("Employee Wage = " + empWage);

        // UC5: Calculating Wages for a Month
        int monthlyWage = 0;
        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            monthlyWage += WAGE_PER_HOUR * FULL_DAY_HOURS;
        }
        System.out.println("Monthly Wage = " + monthlyWage);

        // UC6: Calculate Wages till total hours or days is reached
        int totalHours = 0;
        int totalDays = 0;
        int totalWage = 0;

        while (totalHours < MAX_WORKING_HOURS && totalDays < WORKING_DAYS_PER_MONTH) {
            totalDays++;
            int num = random.nextInt(3);
            int hoursWorked = 0;

            switch (num) {
                case 1:
                    hoursWorked = FULL_DAY_HOURS;
                    break;
                case 2:
                    hoursWorked = PART_TIME_HOURS;
                    break;
                default:
                    hoursWorked = 0;
            }

            totalHours += hoursWorked;
            totalWage += hoursWorked * WAGE_PER_HOUR;
        }

        System.out.println("Total Days = " + totalDays);
        System.out.println("Total Hours = " + totalHours);
        System.out.println("Total Wage = " + totalWage);
    }
}