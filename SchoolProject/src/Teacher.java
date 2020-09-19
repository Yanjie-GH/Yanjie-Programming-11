public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    //constructor
    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    //when printed
    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + " Subject: " + this.subject;
    }

    public void setFirstName(String newFirstName) {
        String firstName = newFirstName;
    }
    public void setLastName(String newLastName) {
        String lastName = newLastName;
    }
    public void setSubject(String newSubject) {
        String subject = newSubject;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSubject() {
        return subject;
    }


}
