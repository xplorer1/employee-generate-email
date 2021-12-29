public class Main {
    public static void main(String [] args) {
        EmployeeActions employeeActions = new EmployeeActions();
        String pass = employeeActions.generatePassword();

        System.out.println("password: " + pass);
    }
}
