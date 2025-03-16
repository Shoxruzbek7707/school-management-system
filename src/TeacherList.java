public class TeacherList {
    private Teacher[] teachers;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public TeacherList() {
        teachers = new Teacher[DEFAULT_CAPACITY];
    }

    public TeacherList(int capacity) {
        teachers = new Teacher[capacity];
    }

    public Teacher add(Teacher teacher) {

        if (size >= teachers.length) {
            Teacher[] temp = new Teacher[size * 2];
            System.arraycopy(teachers, 0, temp, 0, teachers.length);
            teachers = temp;
        }

        teachers[size++] = teacher;
        return teacher;
    }

    public Teacher get(int index) {

        if (index < 0 || index >= size) {
            System.err.println("Index out of bounds");
            return null;
        }

        return teachers[index];
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return teachers.length;
    }
}
