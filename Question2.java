package exe3.q2;
/*
 *  Given the following class  
Employee class{ Double Age; Double Salary; String Name}
Design the class in such a way that the default sorting should work on firstname and lastname.

Also, Write a program to sort Employee objects based on salary using Comparator.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>();
        list.add(new Employee(21.0,45000.00,"Ramesh Sharma"));
        list.add(new Employee(25.0,75000.00,"Ramesh Chandra"));
        list.add(new Employee(23.0,45500.00,"Jatin Roy"));
        list.add(new Employee(29.0,85000.00,"Rakesh Mishra"));
        list.add(new Employee(35.0,25000.00,"Suresh Khanna"));

        Collections.sort(list,
                new Comparator<Employee>() {
                    @Override
                    public int compare(Employee employee, Employee t1) {
                        return employee.name.compareTo(t1.name);
                    }
                });
        System.out.println("Sorting on the basis of first name and last name:");
        System.out.println(list);// on the basis of first and last name

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                return employee.salary.compareTo(t1.salary);
            }
        });

        System.out.println("Sorting on the basis of salary:");
        System.out.println(list);

    }
}
