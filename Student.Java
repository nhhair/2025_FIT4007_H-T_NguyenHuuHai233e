package lab02;

import java.time.Year;

public class Student {
    // Thuộc tính
    private String studentId;
    private String name;
    private int birthYear;
    private String address;

    // Constructor 1: với mã sinh viên và tên sinh viên
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.birthYear = 0;
        this.address = "";
    }

    // Constructor 2: với đầy đủ 4 thông tin
    public Student(String studentId, String name, int birthYear, String address) {
        this.studentId = studentId;
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Phương thức tính tuổi
    public int calculateAge() {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }
}