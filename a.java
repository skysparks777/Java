import java.util.*;


class LargestAndSmallestInArray{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Size of array u want : ");
     int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
         System.out.print("Enter number : ");
            int a = sc.nextInt();
            arr[i]=a;
        }
        System.out.println("Largest Number is : "+largest(arr));
        System.out.println("Smallest Number is : "+smallest(arr));
    }

public static int largest(int arr[]){
   int largest = arr[0];
   for(int i:arr){
      if(i>largest){
        largest =i;
      }
   }
   return largest;
}

public static int smallest(int arr[]){
   int smallest = arr[0];
   for(int i:arr){
      if(i<smallest){
        smallest =i;
      }
   }
   return smallest;
}

}


import java.util.Arrays;

public class Reverse2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Reverse each row
        for (int i = 0; i < arr.length; i++) {
            reverseArray(arr[i]); // Reverse each row
        }

        // Print the reversed array
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Method to reverse a 1D array
    public static void reverseArray(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            // Swap left and right elements
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}

import java.util.*;
public class Reverse2DArray{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Size of array rows u want : ");
     int n = sc.nextInt();
     System.out.print("Enter Size of array Column u want : ");
     int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print("Enter number : ");
            int a = sc.nextInt();
            arr[i][j]=a;
        }
        }
       int arr1[][]=new int[n][m];
       for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        arr1[i][j]=arr[i][(m-1)-j];
       } 
       }

        System.out.print("{");
      for(int i=0;i<n;i++){
        System.out.print("{");
    for(int j=0;j<n;j++){
        System.out.print(arr1[i][j]+" ");
      }    
        System.out.print("}");
      }
        System.out.print("}");
    }
}




import java.util.Arrays;

public class fourth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}



//4
// th
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotateRight(arr, k);

        System.out.println(Arrays.toString(arr));
    }

    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        int[] temp = new int[n];

        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        for (int i = k; i < n; i++) {
            temp[i] = arr[i - k];
        }

        System.arraycopy(temp, 0, arr, 0, n);
    }
}









// Superclass
class Animal {
    void speak() {
        System.out.println("Some animal sound");
    }
}

// Subclass Lion
class Lion extends Animal {
    @Override
    void speak() {
        System.out.println("Roar! I'm a Lion.");
    }
}

// Subclass Elephant
class Elephant extends Animal {
    @Override
    void speak() {
        System.out.println("Trumpet! I'm an Elephant.");
    }
}

// Subclass Parrot
class Parrot extends Animal {
    @Override
    void speak() {
        System.out.println("Squawk! I'm a Parrot.");
    }
}

// Polymorphic method
public class PolymorphicZoo {
    static void makeAnimalSpeak(Animal a) {
        a.speak();  // This will call the appropriate overridden method
    }

    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal parrot = new Parrot();

        makeAnimalSpeak(lion);
        makeAnimalSpeak(elephant);
        makeAnimalSpeak(parrot);
    }
}






import java.util.ArrayList;

// Abstract class
abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void displaySalary() {
        System.out.println(name + "'s Salary: $" + calculateSalary());
    }
}

// Full-time employee subclass
class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

// Part-time employee subclass
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class
public class EmployeeSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("Alice", 5000));
        employees.add(new PartTimeEmployee("Bob", 20, 100));
        employees.add(new FullTimeEmployee("Charlie", 6000));
        employees.add(new PartTimeEmployee("Daisy", 25, 80));

        for (Employee emp : employees) {
            emp.displaySalary();
        }
    }
}









// Base class
class Shape {
    String name = "Shape";

    public void displayDetails() {
        System.out.println("Shape: " + name);
        System.out.println("This is a geometric figure.");
    }
}

// Intermediate class
class Polygon extends Shape {
    int sides;

    public Polygon(String name, int sides) {
        this.name = name;
        this.sides = sides;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Polygon with " + sides + " sides.");
    }
}

// Rectangle class
class Rectangle extends Polygon {
    double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle", 4);
        this.length = length;
        this.width = width;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        double area = length * width;
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.println("Area Formula: length × width = " + area);
    }
}

// Triangle class
class Triangle extends Polygon {
    double base, height;

    public Triangle(double base, double height) {
        super("Triangle", 3);
        this.base = base;
        this.height = height;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        double area = 0.5 * base * height;
        System.out.println("Base: " + base + ", Height: " + height);
        System.out.println("Area Formula: ½ × base × height = " + area);
    }
}

// Main class to test
public class ShapeHierarchyDemo {
    public static void main(String[] args) {
        System.out.println("== Rectangle Details ==");
        Rectangle rect = new Rectangle(5, 3);
        rect.displayDetails();

        System.out.println("\n== Triangle Details =
