package com.practice02.sreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TesctClass2 {
    public static void main(String[] args) {
//        List<Employee> data = Arrays.asList(
//                new Employee(1, "mike", 2500),// object address
//                new Employee(2, "stallin", 6000),// object address
//                new Employee(3, "adam", 6000)// object address
//        );
        //  give me dose object from the list how salary is above 5000
//        List<Employee> newData = data.stream().filter(e -> e.getSalary() > 5000).collect(Collectors.toList());
//          for (Employee emp :newData){
//              System.out.println(emp.getId());
//              System.out.println(emp.getName());
//              System.out.println(emp.getSalary());
//          }






        /// reduce every one salary by 500
//        List<Integer> newData = data.stream().map(e -> e.getSalary() - 500).collect(Collectors.toList());
//        System.out.println(newData);






        /// in this object convert all names  upper case and give me
//        List<String> newData = data.stream().map(e -> e.getName().toUpperCase()).collect(Collectors.toList());
//        System.out.println(newData);




        /// method reference in java
        ///what is method reference ( it is alternative way to calling the method insert of using lambdas expression

//        List<String> newData = data.stream().map(Employee::getName).collect(Collectors.toList());
//        System.out.println(newData);







        /// date - 20/02/2024


        List<Employee> data = Arrays.asList(
                new Employee(1,"mike",5000),
                new Employee(2,"stallin",7000),
                new Employee(3,"adam",5000),
                new Employee(4,"sam",7000),
                new Employee(5,"thyson",3000)

        );
//        Map<Integer, List<Employee>> newData = data.stream().collect(Collectors.groupingBy(e -> e.getSalary()));
//        for(Map.Entry<Integer,List<Employee>>entry:newData.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

//        Map<Integer, List<Employee>> newData = data.stream().collect(Collectors.groupingBy(e -> e.getSalary()));
//        for(Map.Entry<Integer,List<Employee>>entry:newData.entrySet()) {
//            System.out.println(entry.getKey());
//            List<Employee> emp = entry.getValue();
//            for (Employee e:emp){
//                System.out.println(e.getId());
//                System.out.println(e.getName());
//                System.out.println(e.getSalary());
//            }
//        }



//        Map<Integer, List<Employee>> newData = data.stream().collect(Collectors.groupingBy(e -> e.getSalary()));
//        for(Map.Entry<Integer,List<Employee>>entry:newData.entrySet()) {
//            System.out.println(entry.getKey());
//            List<Employee> emp = entry.getValue();
//            System.out.println(emp);
//    }



//        Map<Integer, List<Employee>> newData = data.stream().collect(Collectors.groupingBy(e -> e.getSalary()));
//        for(Map.Entry<Integer,List<Employee>>entry:newData.entrySet()) {
//            List<Employee> emp = entry.getValue();
//            for (Employee e:emp){
//                System.out.println(entry.getKey()+"----->");
//                System.out.println(e.getName());
//            }
//    }


        //// group by salary

//        Map<Integer, List<Employee>> newData = data.stream().collect(Collectors.groupingBy(e -> e.getSalary()));
//        System.out.println(newData);



        //// group by name

        Map<String, List<Employee>> newData = data.stream().collect(Collectors.groupingBy(e -> e.getName()));
        System.out.println(newData);
    }
}
