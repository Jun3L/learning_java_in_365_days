import java.util.Arrays;
public class day57 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        quickSort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
    }
    static void quickSort(int[] arr){
        Arrays.sort(arr);
    }
}
