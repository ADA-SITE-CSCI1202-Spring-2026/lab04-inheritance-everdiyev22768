public class Person {
    private String firstName;
    private String lastName;
    private char gender;

    public Person(String firstName, String lastName, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Person p) {
        return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.gender == p.gender;
    }
}

class Teacher extends Person {
    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, char gender, String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String[] getCourses() {
        return courses;
    }

    public String toString() {
        return super.getFirstName() + " " + super.getLastName() + " " + department;
    }

    public boolean equals(Teacher t) {
        return super.getFirstName().equals(t.getFirstName()) && super.getLastName().equals(t.getLastName()) && this.department.equals(t.department);
    }
}

class Student extends Person {
    private int studentId;

    public Student(String firstName, String lastName, char gender, int studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String toString() {
        return super.getFirstName() + " " + super.getLastName() + " " + studentId;
    }

    public boolean equals(Student s) {
        return super.getFirstName().equals(s.getFirstName()) && super.getLastName().equals(s.getLastName()) && super.getGender() == s.getGender() && this.studentId == s.studentId;
    }
}
