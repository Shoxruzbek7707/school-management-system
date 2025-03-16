public class School {
    private TeacherList teachers;
    private StudentList students;

    public School() {
        this.teachers = new TeacherList();
        this.students = new StudentList();
    }

    public StudentList getStudents() {
        return students;
    }

    public TeacherList getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        teacher.setSchool(this);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double getTotalMoneyEarned() {
        double totalMoneyEarned = 0;
        for (int i = 0; i < students.size(); i++) {
            totalMoneyEarned += students.get(i).getFeesPaid();
        }
        return totalMoneyEarned;
    }

    public double getTotalMoneySpent() {
        double totalMoneySpent = 0;
        for (int i = 0; i < students.size(); i++) {
            totalMoneySpent += students.get(i).getFeesPaid();
        }
        return totalMoneySpent;
    }
}