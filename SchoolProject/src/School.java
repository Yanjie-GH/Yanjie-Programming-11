import java.util.ArrayList;

public class School {
    public School() {
    }
    //3 ArrayLists
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Courses> courses = new ArrayList<>();
    //3 fields
    private String name = "Lakewood Secondary School";
    private String address = "#37 Lakewood Avenue";
    private String contact = "lakewood@schools.ca";

    public void setName(String newName) {   //setters
        name = newName;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }
    public void setContact(String newContact) {
        contact = newContact;
    }
    public String getName() {       //getters
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getContact() {
        return contact;
    }

    //add a teacher to list
    public void addTea(Teacher tea) {
        teachers.add(tea);
    }
    //add a student to list
    public void addStu(Student stu) {
        students.add(stu);
    }
    //remove a teacher from list
    public void remTea(int i) {
        teachers.remove(i);
    }
    //remove a student from list
    public void remStu(int i) {
        students.remove(i);
    }
    //show all teachers
    public void showAllTeachers() {
        for(Teacher t : teachers) {
            System.out.println(t);
        }
    }
    //show all students
    public void showAllStudents() {
        for(Student s : students) {
            System.out.println(s);
        }
    }
    //constructor
    public School(String name, String address, String contact) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Courses> courses = new ArrayList<>();
        this.name = name;
        this.address = address;
        this.contact = contact;
    }
}
