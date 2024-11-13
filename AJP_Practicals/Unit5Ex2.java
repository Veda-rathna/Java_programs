package AJP_Practicals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Class representing a Project
class Project {
    private String projectName;
    private int durationMonths;
    private double projectBudget;

    public Project(String projectName, int durationMonths, double projectBudget) {
        this.projectName = projectName;
        this.durationMonths = durationMonths;
        this.projectBudget = projectBudget;
    }

    public String getProjectName() {
        return projectName;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public double getProjectBudget() {
        return projectBudget;
    }

    @Override
    public String toString() {
        return "Project: " + projectName + " | Duration (months): " + durationMonths + " | Budget: " + projectBudget;
    }
}

// Class representing an Employee
class Employee {
    private String employeeId;
    private String employeeName;
    private List<Project> projects;

    public Employee(String employeeId, String employeeName, List<Project> projects) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.projects = projects;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + " | Name: " + employeeName + " | Projects: " + projects;
    }
}

public class Unit5Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List to store employees
        List<Employee> employees = new ArrayList<>();

        // Taking input from user for employees and their projects
        int numEmployees = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 1; i <= numEmployees; i++) {
            String employeeId = scanner.nextLine().trim();
            String employeeName = scanner.nextLine().trim();

            int numProjects = Integer.parseInt(scanner.nextLine().trim());
            List<Project> projects = new ArrayList<>();

            for (int j = 1; j <= numProjects; j++) {
                String projectName = scanner.nextLine().trim();
                int durationMonths = Integer.parseInt(scanner.nextLine().trim());
                double projectBudget = Double.parseDouble(scanner.nextLine().trim());

                Project project = new Project(projectName, durationMonths, projectBudget);
                projects.add(project);
            }

            Employee employee = new Employee(employeeId, employeeName, projects);
            employees.add(employee);
        }

        // Close scanner after all input is taken
        scanner.close();

        // Example stream operations

        // 1. FlatMapping to get all projects across all employees
        List<Project> allProjects = employees.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .collect(Collectors.toList());
        System.out.println("All Projects:");
        allProjects.forEach(System.out::println);
        System.out.println();

        // 2. Chaining stream operations: Filter employees who worked on projects with budget over 10000 and calculate total budget
        double totalBudgetForHighBudgetProjects = employees.stream()
                .filter(employee -> employee.getProjects().stream()
                        .anyMatch(project -> project.getProjectBudget() > 10000.0))
                .flatMap(employee -> employee.getProjects().stream())
                .filter(project -> project.getProjectBudget() > 10000.0)
                .mapToDouble(Project::getProjectBudget)
                .sum();
        System.out.println("Total budget for projects with budget over 10000: " + totalBudgetForHighBudgetProjects);
        System.out.println();

        // 3. Filter projects with duration less than 6 months
        List<Project> projectsWithDurationLessThan6Months = employees.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .filter(project -> project.getDurationMonths() < 6)
                .peek(project -> System.out.println("Project with duration < 6 months: " + project))
                .collect(Collectors.toList());
        System.out.println("Projects with duration less than 6 months:");
        projectsWithDurationLessThan6Months.forEach(System.out::println);
    }
}
