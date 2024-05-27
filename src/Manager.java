import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Goal> goals = new ArrayList<>();

    public Manager(String firstName, String lastName, String address, String email, String pesel, int hireYear) {
        super(firstName, lastName, address, email, pesel, hireYear);
    }

    public void addGoals(Goal goal) {
        goals.add(goal);
    }

    @Override
    public int calculateSalary() {
        int salary = calculateBaseSalary();
        for (Goal goal : goals) {
            if (goal.isAchievedThisMonth()) {
                salary += goal.getBonus();
            }
        }
        return salary;
    }
}