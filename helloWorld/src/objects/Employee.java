package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public class Employee extends Person {

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(int payGrade) {
        this.payGrade = payGrade;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String introduceYourself(){
        return "Hi I'm "+getFirstName()+" "+getLastName()+" "+"and I work in"+" "+department;
    }




    private String department;
    private int payGrade;
    private int employeeId;
}
