package com.practice02.sreamAPI;

public class TestClass {
    public static void main(String[] args) {

        // example no1
//        Predicate<Integer> result = n->n%2==0;
//        boolean val = result.test(100);
//        System.out.println(val);            // (return true)


        // example no2
//        Predicate<Integer> result = n->n%2==0;
//        boolean val = result.test(101);
//        System.out.println(val);       // (return false)


        // example no3
//        Predicate<Integer> result = n->n%2!=0;
//        boolean val = result.test(101);
//        System.out.println(val);            // (return true)




        // example no3
//        Predicate<String> result = star->star.startsWith("M");
//        boolean val = result.test("Mike");
//        System.out.println(val);             // (return true)


        // example no4
//        Predicate<String> result = star->star.endsWith("M");
//        boolean val = result.test("Mike");
//        System.out.println(val);             // (return false)


        // example no5
//        Predicate<String> result = star->star.equalsIgnoreCase("mike");
//        boolean val = result.test("Mike");
//        System.out.println(val);           // (return ture)


//        List<Integer> data = Arrays.asList(10, 21, 24, 20);
//        List<Integer> newData = data.stream().filter(n ->n % 2 == 0).collect(Collectors.toList());
//        System.out.println(newData);











        ///  this is 16/02/2024

        
//        List<String> data =Arrays.asList("adam", "mike","smith", "sam");
//        List<String> newData = data.stream().filter(star -> star.startsWith("s")).collect(Collectors.toList());
//        System.out.println(newData);      // output(smith , sam)

//        List<String> data =Arrays.asList("adam", "mike","smith", "adam");
//        List<String> newData = data.stream().filter(star -> star.equalsIgnoreCase("adam")).collect(Collectors.toList());
//        System.out.println(newData.size());      // output(2)



//        List<String> data =Arrays.asList("adam", "mike","smith", "adam");
//        List<String> newData = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newData);      // output(adam , mike, smith)



        // distinct remove diplicate elements
//        List<Integer> data =Arrays.asList(10,20,10,5,25,35,10);
//        List<Integer> newData = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newData);      // output(10,20,5,25,35)



        //function
//        Function<Integer, Integer> val = n->n+10;
//        Integer result = val.apply(10);
//        System.out.println(result);        // output(20)





        //function
//        Function<Integer, Integer> val = n->n*10;
//        Integer result = val.apply(10);
//        System.out.println(result);        // output(100)


        //function
//        Function<Integer, String> val = n->"the output is:"+n;
//        String result = val.apply(10);
//        System.out.println(result);        // output(10)




//         map used to do this method
//        List<Integer> data =Arrays.asList(10,20,30,40);
//        List<Integer> newData = data.stream().map(n->n*n).collect(Collectors.toList());
//        System.out.println(newData);      // output(100,400,900,1600)




       /// map used to do this method
//        List<String> data =Arrays.asList("mike","stallin","adam");
//        List<String> newData = data.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newData);      // output([MIKE, STALLIN, ADAM])



//        // Define a list of integers
//        List<Integer> data = Arrays.asList(1,2,3,4,5);
//
//        // Use stream to calculate the sum of all numbers
//        Integer newData = data.stream().reduce(0,Integer::sum);
//
//        System.out.println(newData);  // Output: Sum: 15




//        // Define a list of strings
//        List<String> data = Arrays.asList("banana", "apple", "orange", "grape", "pineapple");
//
//        // Use stream to sort the words alphabetically
//        List<String> newData = data.stream().sorted().collect(Collectors.toList());
//
//        System.out.println(newData);  // Output: [apple, banana, grape, orange, pineapple]





        // Define a list of integers
//        List<Integer> data = Arrays.asList(4, 7, 2, 9, 5, 8,10);
//
//        // Use stream to find the maximum element
//        Optional<Integer> newData = data.stream().max(Integer::compareTo);
//
//        if (newData.isPresent()) {
//            System.out.println("Maximum number: " + newData.get());  // Output: Maximum number: 9
//        } else {
//            System.out.println("List is empty");
//        }




//        // Define a Function to convert String to Integer
//        Function<String, Integer> data = Integer::parseInt;
//
//        // Apply the function to a String
//        int result = data.apply("123");
//        System.out.println("Converted Integer: " +result );





//
//        // Define a Function to convert Celsius to Fahrenheit
//        Function<Double, Double> data = c -> c * 9/5 + 32;
//
//        // Apply the function to a temperature in Celsius
//        double newData = data.apply(30.0);
//        System.out.println("Equivalent Fahrenheit temperature: " + newData);
//
















        //       19/2/204 class  ( Consumer  )

//      Consumer<Integer> val= n-> System.out.println(n);
//        val.accept(10);


//        Consumer<String> val = n-> System.out.println(n);
//        val.accept("mike");





//        Consumer<Integer> result = n-> System.out.println(n);
//        // create a list of integers
//        List<Integer> x = new ArrayList<>();
//        x.add(1);
//        x.add(2);
//        x.add(3);
//        x.add(4);
//        x.add(5);
//        // use the consumer to print each element of the list
//        x.forEach(result);




// supplier


//        Supplier<Double> val = ()->Math.random();
//        Double result = val.get();
//        System.out.println(result);







    }
}
