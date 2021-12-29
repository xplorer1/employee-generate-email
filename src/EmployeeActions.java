import java.util.UUID;

public class EmployeeActions {
    String firstName;
    String lastName;
    String department;
    String password;
    int mailBoxCapacity;
    final String companyName = "Microsoft Inc.";

    public EmployeeActions(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    String generateEmail() {
        return this.firstName + "." + this.lastName + "@" + this.department + "." + this.companyName + ".com";
    }

    String generatePassword() {
        password = UUID.randomUUID().toString();

        return password.substring(0, 8);
    }

    void welcome() {
        System.out.println("=================================");
        System.out.println("Welcome to " + this.companyName);
        System.out.println();
        System.out.println("We are going to ask you for your firstname, lastname and department.");

    }
}
