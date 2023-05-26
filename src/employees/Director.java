package employees;

public class Director implements Employee{

    private String position = "Director";

    @Override
    public String getEmployeePosition() {
        return position;
    }
}
