package Les_go;

import java.util.*;

public class Employee_payroll {
    int salary, allowances, deductions, net_pay;

    Employee_payroll() {
        if (salary < 10000) {
            allowances = 3500;
            deductions = 2000;
        } else if (salary >= 10000 && salary < 20000) {
            allowances = 4500;
            deductions = 3000;
        } else if (salary >= 20000 && salary < 30000) {
            allowances = 5500;
            deductions = 4000;
        } else if (salary >= 30000 && salary < 40000) {
            allowances = 6500;
            deductions = 5000;
        } else if (salary >= 40000 && salary < 50000) {
            allowances = 7500;
            deductions = 6000;
        } else {
            allowances = 8500;
            deductions = 7000;
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee_payroll emp[] = new Employee_payroll[3];
        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Employee_payroll();
            System.out.println("Enter the Salary of employee " + (i + 1) + ": ");
            emp[i].salary = sc.nextInt();
        }
        for (int i = 0; i < emp.length; i++) {
            System.out.println();
            System.out.println("The pay details of employee " + (i + 1) + ": ");
            System.out.println("Salary: " + emp[i].salary);
            System.out.println("Allowances: " + emp[i].allowances);
            System.out.println("Deductions: " + emp[i].deductions);
            emp[i].net_pay = emp[i].salary - emp[i].deductions + emp[i].allowances;
            System.out.println("Net Pay: " + emp[i].net_pay);
        }
    }
}
