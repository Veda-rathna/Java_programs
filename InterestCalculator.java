import java.util.Scanner;

abstract class Account {
    double interestRate;
    double amount;

    abstract double calculateInterest();
}

class FDAccount extends Account {
    int noOfDays;
    int ageOfACHolder;

    @Override
    double calculateInterest() {
        double interest = 0;
        if (amount < 10000000) {
            if (noOfDays >= 7 && noOfDays <= 14) {
                interestRate = ageOfACHolder >= 60 ? 5.00 : 4.50;
            } else if (noOfDays >= 15 && noOfDays <= 29) {
                interestRate = ageOfACHolder >= 60 ? 5.25 : 4.75;
            } else if (noOfDays >= 30 && noOfDays <= 45) {
                interestRate = ageOfACHolder >= 60 ? 6.00 : 5.50;
            } else if (noOfDays >= 45 && noOfDays <= 60) {
                interestRate = ageOfACHolder >= 60 ? 7.50 : 7.00;
            } else if (noOfDays >= 61 && noOfDays <= 184) {
                interestRate = ageOfACHolder >= 60 ? 8.00 : 7.50;
            } else if (noOfDays >= 185 && noOfDays <= 365) {
                interestRate = ageOfACHolder >= 60 ? 8.50 : 8.00;
            } else {
                throw new IllegalArgumentException("Invalid number of days.");
            }
        } else {
            if (noOfDays >= 7 && noOfDays <= 14) {
                interestRate = 6.50;
            } else if (noOfDays >= 15 && noOfDays <= 29) {
                interestRate = 6.75;
            } else if (noOfDays >= 30 && noOfDays <= 45) {
                interestRate = 6.75;
            } else if (noOfDays >= 45 && noOfDays <= 60) {
                interestRate = 8.00;
            } else if (noOfDays >= 61 && noOfDays <= 184) {
                interestRate = 8.50;
            } else if (noOfDays >= 185 && noOfDays <= 365) {
                interestRate = 10.00;
            } else {
                throw new IllegalArgumentException("Invalid number of days.");
            }
        }
        interest = (amount * interestRate * noOfDays) / (365 * 100);
        return interest;
    }
}

class SBAccount extends Account {
    @Override
    double calculateInterest() {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount.");
        }
        return (amount * interestRate) / 100;
    }
}

class RDAccount extends Account {
    int noOfMonths;
    double monthlyAmount;
    public int ageOfACHolder;

    @Override
    double calculateInterest() {
        double interest = 0;
        if (noOfMonths == 6) {
            interestRate = ageOfACHolder >= 60 ? 8.00 : 7.50;
        } else if (noOfMonths == 9) {
            interestRate = ageOfACHolder >= 60 ? 8.25 : 7.75;
        } else if (noOfMonths == 12) {
            interestRate = ageOfACHolder >= 60 ? 8.50 : 8.00;
        } else if (noOfMonths == 15) {
            interestRate = ageOfACHolder >= 60 ? 8.75 : 8.25;
        } else if (noOfMonths == 18) {
            interestRate = ageOfACHolder >= 60 ? 9.00 : 8.50;
        } else if (noOfMonths == 21) {
            interestRate = ageOfACHolder >= 60 ? 9.25 : 8.75;
        } else {
            throw new IllegalArgumentException("Invalid number of months.");
        }
        interest = (monthlyAmount * noOfMonths * interestRate) / (12 * 100);
        return interest;
    }
}

public class InterestCalculator {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select the option:");
            System.out.println("1. Interest Calculator -SB");
            System.out.println("2. Interest Calculator -FD");
            System.out.println("3. Interest Calculator -RD");
            System.out.println("4. Exit");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    SBAccount sbAccount = new SBAccount();
                    sbAccount.interestRate = 4.0;
                    System.out.println("Enter the Average amount in your account:");
                    sbAccount.amount = scanner.nextDouble();
                    System.out.println("Interest gained: Rs. " + sbAccount.calculateInterest());
                    break;
                case 2:
                    FDAccount fdAccount = new FDAccount();
                    System.out.println("Enter the FD amount:");
                    fdAccount.amount = scanner.nextDouble();
                    System.out.println("Enter the number of days:");
                    fdAccount.noOfDays = scanner.nextInt();
                    System.out.println("Enter your age:");
                    fdAccount.ageOfACHolder = scanner.nextInt();
                    try {
                        System.out.println("Interest gained is: " + fdAccount.calculateInterest());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    RDAccount rdAccount = new RDAccount();
                    System.out.println("Enter the number of months:");
                    rdAccount.noOfMonths = scanner.nextInt();
                    System.out.println("Enter the monthly deposit amount:");
                    rdAccount.monthlyAmount = scanner.nextDouble();
                    System.out.println("Enter your age:");
                    rdAccount.ageOfACHolder = scanner.nextInt();
                    try {
                        System.out.println("Interest gained is: " + rdAccount.calculateInterest());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }
        }
    }
}
