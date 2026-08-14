public class day56 {
    public static void main(String[] args) {
        int[] numbers = {5,9,45,8,21,53,6,7};
        int target = 8;

        int left = 0;
        int right = numbers.length - 1;
        while(left <= right){
            int mid = (left + right) / 2; // Calculate the middle index
            if(numbers[mid] == target){//if the middle element is the target, we found it
                System.out.println("target found at index: " + mid);         
                break;
                
            }else if(numbers[mid] < target){ //if the middle element is less than the target, we need to search in the right half of the array
                left = mid + 1;
            }else{ //if the middle element is greater than the target, we need to search in the left half of the array
                right = mid - 1;
            }
        }
        
    }
}
