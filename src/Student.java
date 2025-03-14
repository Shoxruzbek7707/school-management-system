public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int grade;
    private double feesPaid;
    private double feesTotal;
    private School school;

    public Student(int id,String firstName,String lastName,int grade,int feesTotal){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.feesPaid = 0.0;
        this.feesTotal = feesTotal;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public double getFeesTotal() {
        return feesTotal;
    }

    public double getRemainingFees(){
        return feesTotal - feesPaid;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public void pay(double fees){
        this.feesPaid += fees;
    }
    public void setSchool(School school){
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                ", school=" + school +
                '}';
    }
}
