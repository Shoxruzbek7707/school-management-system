public class School {
    private Teacher[] teachers;
    private Student[] students;
    private int teacherCount = 0;
    private int studentCount = 0;

    public School(){
        this.teachers = new Teacher[100];
        this.students = new Student[100];
    }

    public Teacher[] getTeachers(){
        return teachers;
    }

    public Student[] getStudents(){
        return students;
    }

    public double getTotalMoneyEarned(){
        double total = 0;
        for (int i = 0;i < studentCount;i++){
            total += students[i].getFeesPaid();
        }
        return total;
    }

    public double getTotalMoneySpent(){
        double total = 0;
        for (int i = 0;i < teacherCount;i++){
            total += teachers[i].getSalaryEarned();
        }
        return total;
    }


    public void addTeacher(Teacher teacher){
        if (teacherCount >= teachers.length){
            Teacher[] temp  = new Teacher[teachers.length * 2];
            System.arraycopy(teachers,0,temp,0,teachers.length);
            teachers = temp;
        }
        teachers[teacherCount++] = teacher;
        teacher.setSchool(this);
    }

    public void addStudent(Student student){
        if (studentCount >= students.length){
            Student[] temp = new  Student[students.length * 2];
            System.arraycopy(students,0,temp,0,students.length);
            students = temp;
        }
        students[studentCount++] = student;
        student.setSchool(this);
    }
}
