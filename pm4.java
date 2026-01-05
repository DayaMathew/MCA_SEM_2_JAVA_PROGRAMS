import java.util.Scanner;

class Employee {
    int eno;
    String ename;
    double esal;

    // Function to read employee details
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Number: ");
        eno = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        esal = sc.nextDouble();
    }

    // Function to display employee details
    void display() {
        System.out.println("Employee Number: " + eno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Salary: " + esal);
        System.out.println("---------------------------");
    }

    // Function to compare employee by eno
    boolean compareByEno(int id) {
        return this.eno == id;
    }
}

public class pm4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        // Reading employee details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));
            emp[i] = new Employee();
            emp[i].read();
        }

        // Display all employees
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }

        // Search for employee by eno
        System.out.print("Enter Employee Number to search: ");
        int searchId = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (emp[i].compareByEno(searchId)) {
                System.out.println("\nEmployee Found:");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with eno " + searchId + " not found.");
        }
    }
}
