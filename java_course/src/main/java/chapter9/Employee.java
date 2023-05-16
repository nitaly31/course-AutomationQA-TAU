package chapter9;

public class Employee extends Person {
    public Employee(){
        super("gera");
        System.out.println("En el constructor predeterminado del empleado");
    }
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String employeeId;
    private String title;
}
