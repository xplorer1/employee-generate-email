import java.util.Scanner;
import java.util.UUID;

public class EmployeeActions {
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    private int mailBoxCapacity;
    private final String companyName = "Microsoft Inc.";

    private String generateEmail() {
        String [] compName = this.companyName.split(" ");
        return this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() + "." + compName[0].toLowerCase() + ".com";
    }

    private String generatePassword() {
        password = UUID.randomUUID().toString();

        return password.substring(0, 8);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }

    public void welcome() {
        System.out.println("=================================");
        System.out.println();
        System.out.println("Hello and Welcome to " + this.companyName);
        System.out.println();
        System.out.println("We are going to ask you for your firstname, lastname and department so we can generate and email address for you.");
        System.out.println();
        System.out.println("=================================");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your firstname");
        this.firstName = scanner.nextLine();

        System.out.println("Enter your lastname");
        this.lastName = scanner.nextLine();

        System.out.println("Enter your department");
        this.department = scanner.nextLine();

        System.out.println("Your email address is: " + generateEmail());
        System.out.println();
        System.out.println("Your password is: " + generatePassword());
        System.out.println();
        System.out.println("Your mail box capacity is: " + this.mailBoxCapacity);
    }
}
