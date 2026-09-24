public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] +" is even");
            } else {
                System.out.println(numbers[i] + " is odd");
            }
            sum = sum + numbers[i];
        }
        System.out.println("Sum of all numbers: " + sum);
    }

}
