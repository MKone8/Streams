import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.sound.sampled.SourceDataLine;
import javax.swing.SpinnerDateModel;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        List<Employee> empList = Arrays.asList(new Employee("Jan", 1200), new Employee("Marek", 3333), new Employee("Fran",  4321), new Employee("Fabio", 657));
        IntStream.of(1,13,24,55,1,12,3,77);
               
        System.out.println(listToString(empList));
        System.out.println(listtoMap(empList));
        System.out.println(sumOfEven());

    }

    public static Map<Character,List<String>> listtoMap(List<Employee>empList){
        Map<Character, List<String>> empMap = empList.stream().collect(Collectors.groupingBy(employee -> employee.getName().charAt(0),Collectors.mapping(Employee::getName,Collectors.toList())));
            return empMap;

    }

    public static String listToString(List<Employee>empList){
        String emploAndSalary = empList.stream().map(k ->"Name: "+k.getName()+", Salary: "+k.getSalary()).collect(Collectors.joining("; "));
            return emploAndSalary;
    }

    public static int sumOfEven(){
        int sumOfEven = IntStream.of(1,13,24,55,1,12,3,77).filter(n -> n%2==0).sum();
            return sumOfEven;
    }


    // pierwsze. Map<Character, List<String>> empMap = empList.stream().collect(Collectors.groupingBy(employee -> employee.getName().charAt(0),Collectors.mapping(Employee::getName,Collectors.toList())));
    // drugie. empList.stream().forEach(Employee -> System.out.println("name - "+Employee.getName()+", "+"salary - "+Employee.getSalary()));
    // trzecie. 
    };

