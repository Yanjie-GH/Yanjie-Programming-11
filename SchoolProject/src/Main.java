public class Main {
    public static void main(String[] args) {
        School school = new School();

        //add 10 students and 3 teachers
        for(int i=0; i<10; i++) {
            Student stu = new Student("John","S",100);
            school.addStu(stu);
        }
        Teacher tea0 = new Teacher("Anthony","T","Computer Programming");
        Teacher tea1 = new Teacher("Brian","T","Computer Programming");
        Teacher tea2 = new Teacher("Charlie","T","Computer Programming");
        school.addTea(tea0);
        school.addTea(tea1);
        school.addTea(tea2);

        //display both lists
        school.showAllTeachers();
        school.showAllStudents();

        //remove 2 students and 1 teacher
        school.remStu(4);
        school.remStu(5);
        school.remTea(1);

        //display both lists
        System.out.println();
        school.showAllTeachers();
        school.showAllStudents();
    }
}
