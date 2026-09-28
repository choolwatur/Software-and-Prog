public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[100]; //Creates an array of from 1-100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] +" is even"); //Checks if the number is even
            } else {
                System.out.println(numbers[i] + " is odd"); //Checks if the number is odd
            }
            sum = sum + numbers[i]; //Adds all numbers in the array
        }
        System.out.println("Sum of all numbers: " + sum); //Prints the sum of all numbers in the array
    }

}
