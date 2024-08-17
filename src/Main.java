import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

class Student {
    String name;
    String family;
    String nationalCode;
    int age;

    // Constructor
    public Student(String name, String family, String nationalCode, int age) {
        this.name = name;
        this.family = family;
        this.nationalCode = nationalCode;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Family: " + family + ", National Code: " + nationalCode + ", Age: " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Get the number of students from the user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.close();

        // Create an ArrayList of students
        ArrayList<Student> students = new ArrayList<>();

        // Generate random Student objects
        for (int i = 0; i < numberOfStudents; i++) {
            String name = "Name" + i;
            String family = "Family" + i;
            String nationalCode = "NC" + random.nextInt(10000);  //
            int age = 18 + random.nextInt(10);  // Generate a random age between 18 and 27
            students.add(new Student(name, family, nationalCode, age));
        }

        // HashSet
        HashSet<Integer> ages = new HashSet<>();
        for (Student student : students) {
            ages.add(student.age);
        }

        // Display unique ages
        System.out.println("Unique ages:");
        for (int age : ages) {
            System.out.println(age);
        }

        // HashMap with the national code as the key and other details as the value
        HashMap<String, String> studentMap = new HashMap<>();
        for (Student student : students) {
            studentMap.put(student.nationalCode, student.toString());
        }

        // Display the HashMap
        System.out.println("\nStudent details:");
        for (String key : studentMap.keySet()) {
            System.out.println("National Code: " + key + ", Details: " + studentMap.get(key));
        }


    }
}
