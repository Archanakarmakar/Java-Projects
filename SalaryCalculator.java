package study;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Input for basic pay, BOA, and Bonus
        System.out.println("Enter Basic Pay:");
        double basic = sc.nextDouble();

        System.out.println("Enter Basket Of Allowance (BOA):");
        double boa = sc.nextDouble();

        System.out.println("Enter Bonus:");
        double bonus = sc.nextDouble();

        // Calculate PF contribution (12% of basic pay)
        double pf = basic * 0.12;

        // Monthly gross salary
        double monthlyGross = basic + boa + bonus - pf;
        System.out.println("Monthly Gross Salary: " + monthlyGross);

        // Yearly gross salary
        double yearlyGross = monthlyGross * 12;
        System.out.println("Yearly Gross Salary: " + yearlyGross);

        // Calculate tax based on slab rates
        double yearlyTax = 0;
        if (yearlyGross <= 250000) {
            yearlyTax = 0;
        } else if (yearlyGross > 250000 && yearlyGross <= 500000) {
            yearlyTax = (yearlyGross - 250000) * 0.05;
        } else if (yearlyGross > 500000 && yearlyGross <= 750000) {
            yearlyTax = 250000 * 0.05 + (yearlyGross - 500000) * 0.10;
        } else if (yearlyGross > 750000 && yearlyGross <= 1000000) {
            yearlyTax = 250000 * 0.05 + 250000 * 0.10 + (yearlyGross - 750000) * 0.15;
        } else if (yearlyGross > 1000000 && yearlyGross <= 1250000) {
            yearlyTax = 250000 * 0.05 + 250000 * 0.10 + 250000 * 0.15 + (yearlyGross - 1000000) * 0.20;
        } else if (yearlyGross > 1250000 && yearlyGross <= 1500000) {
            yearlyTax = 250000 * 0.05 + 250000 * 0.10 + 250000 * 0.15 + 250000 * 0.20 + (yearlyGross - 1250000) * 0.25;
        } else {
            yearlyTax = 250000 * 0.05 + 250000 * 0.10 + 250000 * 0.15 + 250000 * 0.20 + 250000 * 0.25 + (yearlyGross - 1500000) * 0.30;
        }

        // Monthly tax deduction
        double monthlyTax = yearlyTax / 12;
        System.out.println("Monthly Tax Deduction: " + monthlyTax);

        // Monthly take home salary after tax
        double monthlyTakeHome = monthlyGross - monthlyTax;
        System.out.println("Monthly Take Home Salary: " + monthlyTakeHome);
        
        // Close the scanner
        sc.close();
    }

	}


