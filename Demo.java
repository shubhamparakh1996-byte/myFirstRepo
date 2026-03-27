import java.util.ArrayList;
import java.util.List;


public class Demo {
    
    // Student class to demonstrate object-oriented programming
    static class Student {
        String name;
        int age;
        double gpa;
        String name2 = "Sijsbckasjbcksbc";
        
        Student(String name, int age, double gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }
        
        void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age + ", GPA: " + gpa);
        }
        
        boolean isTopStudent() {
            return gpa >= 3.5;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Welcome to Java Demo ===\n");
        
        // Demo 1: Working with Arrays
        System.out.println("--- Array Demo ---");
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array: " + sum);

        System.out.println("Average: " + (sum / numbers.length) + "\n");
        
        // Demo 2: Working with ArrayList
        System.out.println("--- ArrayList Demo ---");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println("  - " + fruit);
        }
        System.out.println();
        
        // Demo 3: Working with Objects
        System.out.println("--- Student Objects Demo ---");
        Student student1 = new Student("Alice", 20, 3.8);
        Student student2 = new Student("Bob", 21, 3.2);
        Student student3 = new Student("Charlie", 19, 3.9);
        
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        
        System.out.println("All Students:");
        for (Student student : students) {
            student.displayInfo();
        }
        System.out.println();
        
        // Demo 4: Filtering Top Students
        System.out.println("--- Top Students (GPA >= 3.5) ---");
        for (Student student : students) {
            if (student.isTopStudent()) {
                System.out.println(student.name + " is a top student!");
            }
        }
    }
}

//hjbawvuigfuehfjeofihqehfoihjefiquehfqoeifhqe/ip
//ygciuDFOIUFOWDFUW bnjsckanc