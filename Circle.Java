package lab02;

import java.util.Scanner;

public class Circle {
    // Thuộc tính
    private double radius;
    private final double PI = 3.14;

    // Constructor 1: có tham số
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor 2: mặc định
    public Circle() {
        this.radius = 1.0;
    }

    // Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Phương thức nhập thông tin
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh cua hinh tron: ");
        this.radius = scanner.nextDouble();
    }

    // Phương thức xuất thông tin
    public void output() {
        System.out.println("Thong tin hinh tron:");
        System.out.println("- Ban kinh: " + radius);
    }

    // Phương thức tính diện tích
    public double calculateArea() {
        return PI * radius * radius;
    }

    // Phương thức tính chu vi
    public double calculateCircumference() {
        return 2 * PI * radius;
    }
}