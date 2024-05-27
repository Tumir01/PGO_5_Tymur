import java.util.ArrayList;
import java.util.List;

public class Tester extends Employee {
    private List<String> testTypes = new ArrayList<>();

    public Tester(String firstName, String lastName, String address, String email, String pesel, int hireYear) {
        super(firstName, lastName, address, email, pesel, hireYear);
    }

    public void addTestType(String testType) {
        testTypes.add(testType);
    }

    @Override
    public int calculateSalary() {
        int salary = calculateBaseSalary();
        salary += testTypes.size() * 300;
        return salary;
    }
}