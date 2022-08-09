package openclosed;

public class Manager  extends Employee{
    public String employeeDesignation;

    public String getEmployeeDesignation() {
        return this.employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeId, float employeeSalary,String employeeDesignation) {
        super
        this.employeeDesignation = employeeDesignation;
    }

    public Manager(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    @Override
    public String toString() {
        return "{" +
            " employeeDesignation='" + getEmployeeDesignation() + "'" +
            "}";
    }



    
}
