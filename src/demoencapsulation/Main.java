package demoencapsulation;

import content.Employee;
import content.Worker;

public class Main {

    public static void main(String[] args) {

        Worker one = new Worker();
        System.out.println("one's name is " + one.getName());
        one.setName("Barney");
        System.out.println("one's new name is " + one.getName());

        Worker two = new Worker(200);
        System.out.println("one's number is " + one.getNumber());
        System.out.println("two's number is " + two.getNumber());
        
        Employee three = new Employee();
        System.out.println("three's pay is "+three.getPay());

        Employee four = new Employee();
        four.setHours(30);
        four.setRate(15);
        System.out.println("four's pay is " + four.getPay());
    }

}
