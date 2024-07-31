import java.util.*;

public class List {

    public static void main(String[] args) {
        //1. Defining a List of integers with duplicates
        java.util.List<Integer> integerList = Arrays.asList(5, 3, 8, 5, 7, 3, 8, 10);

        try {
            //2. Using a Set to remove duplicates
            Set<Integer> integerSet = new HashSet<>(integerList);

            //Converting the set back to a list for further operations
            java.util.List<Integer> uniqueList = new ArrayList<>(integerSet);

            //3. Calculating the sum and average of the integers
            int sum = 0;
            double average = 0.0;

            //Calculating the sum
            for (Integer number : uniqueList) {
                sum += number;
            }

            //Calculating the average
            if (uniqueList.isEmpty()) {
                throw new ArithmeticException("Cannot calculate average of an empty list.");
            } else {
                average = (double) sum / uniqueList.size();
            }

            //4. Printing the results
            System.out.println("List of integers without duplicates: " + uniqueList);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        //5. Handling exceptions
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index out of bounds error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal argument error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic error: " + e.getMessage());
        } catch (Exception e) {
            //Catching any other unexpected exceptions
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            //Code in this block will always be executed
            System.out.println("Program execution finished.");
        }

        //6. Used try-catch-finally
    }
}

