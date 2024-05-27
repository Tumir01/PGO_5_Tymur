import java.util.Calendar;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String pesel;
    private int hireYear;

    public Employee(String firstName, String lastName, String address, String email, String pesel, int hireYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.hireYear = hireYear;
    }

    public int calculateBaseSalary() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsWorked = currentYear - hireYear;
        return 3000 + yearsWorked * 1000;
    }

    public abstract int calculateSalary();
}