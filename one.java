import java.util.Arrays;

public class one{
    public static void main(String[] args) {
        int[] arr = {2, 8, 1, 4, 7, 3};
        
        Arrays.sort(arr); 
        
        System.out.println("Smallest number is  " + arr[0]);
        System.out.println("Largest number is " + arr[arr.length - 1]);
    }
}
