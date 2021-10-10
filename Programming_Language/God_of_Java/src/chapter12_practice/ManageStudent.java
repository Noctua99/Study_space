package chapter12_practice;

public class ManageStudent {
    public static void main(String[] args) {
        ManageStudent manage = new ManageStudent();
        Student[] student = null;
//        student = manage.addStudent();
//        manage.printStudents(student);
        manage.checkEquals();
    }

    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        return student;
    }

    public void printStudents(Student[] student) {
        for (Student stud : student) {
            System.out.println(stud);
        }
    }

    public void checkEquals() {
        Student a = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        Student b = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        if (a.equals(b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
