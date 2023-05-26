package employees;

public class Accountant implements Employee {

    private String position = "Accountant";

    @Override
    public String getEmployeePosition() {
        return position;
    }
}
