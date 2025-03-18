public class ArrayInitializationaActivity {
    public static void main(String[] args) {
        // Define the size of the array
        int size = 10;
        
        // Create an array of integers
        int[] numbers = new int[size];
        
        // Initialize the array using a for loop
        for (int i = 0; i < size; i++) {
            numbers[i] = i * 2; // Assigning each element a value (e.g., multiples of 2)
        }
        
        // Print the array elements using an enhanced for loop
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
