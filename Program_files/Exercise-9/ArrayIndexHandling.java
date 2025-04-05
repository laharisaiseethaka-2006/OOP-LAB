import java.util.Scanner;

public class ArrayIndexHandling {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an index (0-4) to access the array element: ");
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds. Valid index range is 0 to 4.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter an integer.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
