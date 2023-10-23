package ie.atu;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter first Name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Please enter Last Name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Please enter age: ");
        this.age= scanner.nextInt();
    }




    //Constructor
    public Person(){
        this.firstName = "Liam";
        this.lastName = "Noone";
        this.age = 19;
    }

    //Method for user Input



    public int getAge() {
        return age;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }





    public void displayInfo() {
        System.out.println("Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age);
    }
}
