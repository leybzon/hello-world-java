import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class HelloWorld {
  private static final int numberOfIntegers = 5;
  //integer array to store the positive numbers
  int[] positiveNumbers = new int[numberOfIntegers];
  //double array to store the negative numbers
  double[] negativeNumbers = {-1.0, -2.0, -3.0, -4.0, -5.0};
  
  public class PositiveNumberSorter {
    private static final int NUMBER_OF_INTEGERS = 5;
    private static final int RANDOM_UPPER_BOUND = 100;
    //integer array to store the positive numbers
    int[] positiveNumbers = new int[numberOfIntegers];
    //double array to store the negative numbers
    double[] negativeNumbers = {-1.0, -2.0, -3.0, -4.0, -5.0};

    public PositiveNumberSorter() {
      Random random = new Random();
      for (int i = 0; i < positiveNumbers.length; i++) {
          positiveNumbers[i] = random.nextInt(RANDOM_UPPER_BOUND); // generates random numbers between 0 and 99
      }
    }

    //function to sort the positive numbers
    public void sortPositiveNumbers() {
      Arrays.sort(positiveNumbers);
    }

    //function to sort the positive numbers in reverse order
    public void sortPositiveNumbersInReverse() {
      List<Integer> list = Arrays.stream(positiveNumbers).boxed().collect(Collectors.toList());
      Collections.sort(list);
      Collections.reverse(list);
      positiveNumbers = list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    //function to print the positive numbers
    public void printPositiveNumbers() {
      for (int number : positiveNumbers) {
          System.out.println(number);
      }
    }

    public static void main(String[] args) {
      HelloWorld helloWorld = new HelloWorld();
      PositiveNumberSorter positiveNumberSorter = helloWorld.new PositiveNumberSorter();
      positiveNumberSorter.sortPositiveNumbers();
      positiveNumberSorter.printPositiveNumbers();
      System.out.println("Hello developers!");
      positiveNumberSorter.sortPositiveNumbersInReverse();
      positiveNumberSorter.printPositiveNumbers();
    }
  }

  //function to sort the positive numbers
  public void sortPositiveNumbers() {
    Arrays.sort(positiveNumbers);
  }

  //function to sort the positive numbers in reverse order
  public void sortPositiveNumbersInReverse() {
    List<Integer> list = Arrays.stream(positiveNumbers).boxed().collect(Collectors.toList());
    Collections.sort(list);
    Collections.reverse(list);
    positiveNumbers = list.stream().mapToInt(Integer::intValue).toArray();
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