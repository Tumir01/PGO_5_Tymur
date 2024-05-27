import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {
    private List<Technology> technologies = new ArrayList<>();

    public Developer(String firstName, String lastName, String address, String email, String pesel, int hireYear) {
        super(firstName, lastName, address, email, pesel, hireYear);
    }

    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }

    @Override
    public int calculateSalary() {
        int salary = calculateBaseSalary();
        for (Technology tech : technologies) {
            salary += tech.getBonus();
        }
        return salary;
    }
}