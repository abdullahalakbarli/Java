public class  Personal extends User {
    private String position;
    private double salary;
    private boolean intern;
    private String department;

    public Personal(int id, String username, String password, String email, int phoneNumber, int age, double salary, String department) {
        super(id, username, password, email, phoneNumber, age);
        this.position = position;
        this.salary = salary;
        this.intern = intern;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public boolean getIntern(){
        return intern;
    }

    public void setIntern(boolean intern){
        this.intern = intern;
    }
    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }
}
