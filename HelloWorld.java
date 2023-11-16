import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HelloWorld {
  //integer array to store the positive numbers
  int[] positiveNumbers = {1, 2, 3, 4, 5};
  //double array to store the negative numbers
  double[] negativeNumbers = {-1.0, -2.0, -3.0, -4.0, -5.0};
  
  //function to sort the positive numbers in reverse order
  public void sortPositiveNumbersInReverse() {
    List<Integer> list = Arrays.stream(positiveNumbers).boxed().collect(Collectors.toList());
    Collections.sort(list);
    Collections.reverse(list);
    positiveNumbers = list.stream().mapToInt(Integer::intValue).toArray();
  }

  public void sortPositiveNumbers() {
    Arrays.sort(positiveNumbers);
  }
  
  //function to print the positive numbers
  public void printPositiveNumbers() {
    for (int number : positiveNumbers) {
        System.out.println(number);
    }
  }

  public static void main(String[] args) {
    HelloWorld helloWorld = new HelloWorld();
    helloWorld.sortPositiveNumbers();
    helloWorld.printPositiveNumbers();
    System.out.println("Hello developers!");
    helloWorld.sortPositiveNumbersInReverse();
    helloWorld.printPositiveNumbers();
  }
}