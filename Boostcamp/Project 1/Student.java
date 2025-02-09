public class Student extends User {
    private double allowance;
    private double gpa;
    private String groupName;

    public Student(int id, String username, String password, String email, int phoneNumber, int age, double allowance, double gpa, String groupName) {
        super(id, username, password, email, phoneNumber, age);
        this.allowance = allowance;
        this.gpa = gpa;
        this.groupName = groupName;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
