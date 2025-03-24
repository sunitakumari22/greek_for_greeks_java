public class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
    
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
       
        int[] arr1 = {1, 2, 3, 5};
        System.out.println(findMissingNumber(arr1)); 
        
        int[] arr2 = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(findMissingNumber(arr2)); 
        int[] arr3 = {1};
        System.out.println(findMissingNumber(arr3)); 
    }
}
