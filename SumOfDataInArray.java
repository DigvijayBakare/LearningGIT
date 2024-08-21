// program to find the sum of all the elements in an array

public class SumOfDataInArray {
    public static void main(String[] args) {
        // declare an array
        double[] arr = {10,50,64,32,68,6,2,28,65};

        // for finding the sum we need for loop
        double sum = 0;                             // declared sum variable and initialised it with 0
        for (int i=0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of all data values in array is "+sum);
    }
}
