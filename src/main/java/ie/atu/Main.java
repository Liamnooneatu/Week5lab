package ie.atu;

public class Main {
    public static void main(String[] args) {

        Person student1 = new Person("Liam","Noone",19);
        System.out.println("Here is you Details: " + student1.getFirstName());

        student1.displayInfo();

        student1.getUserInput();

    }


}