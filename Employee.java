package com.interview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// we class employee and three id, name, salary
// list of employee this list hash duplicate employee object which remove the duplicate from the list
public class Employee {
    private int id;
    private  String name;
    private double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    @Override
 public boolean equals(Object o){
        if (this== o) return true;
        if(o==null || getClass()!= o.getClass()) return false;
        Employee employee = (Employee)o;
        return id== employee.id;

 }
 @Override
  public int hashCode(){
        return Objects.hash(id);
  }
  @Override
  public String toString(){
       return "Employee{id="+id+",name="+name+",salary="+salary+"+}" ;

  }
    }
    class RemoveDuplicates{
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
           new Employee(1,"Baikuntha",1000),
                new Employee(2,"Rahul",2000),
                new Employee(1,"Baikuntha",1000),
                new Employee(3,"Amit",4000),
                new Employee(4,"Baikuntha",1000),
                new Employee(3,"Amit",4000)

        );
        List<Employee> uniqueEmployees = employees.stream().distinct()
                .collect(Collectors.toList());
        uniqueEmployees.forEach(System.out::println);
    }
}