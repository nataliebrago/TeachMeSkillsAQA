package employees;

public class Worker implements Employee {
    private String position = "Worker";
    @Override
    public String getEmployeePosition() {
        return position;
    }
}
