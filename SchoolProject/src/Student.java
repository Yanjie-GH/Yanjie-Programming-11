public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNumber;
    private static int nextStudentNumber = 0;  //creates unique student number

    //constructor
    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        studentNumber = nextStudentNumber;
        nextStudentNumber++;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }
    public void setGrade(int newGrade) {
        grade = newGrade;
    }
    public void setStudentNumber(int newStudentNumber) {
        studentNumber = newStudentNumber;
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
    public int getStudentNumber() {
        return studentNumber;
    }

    //when printed
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + " Grade: " + this.grade + " ST#:" + this.studentNumber;
    }
}