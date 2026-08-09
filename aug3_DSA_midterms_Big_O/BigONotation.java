package aug3_DSA_midterms_Big_O;

public class BigONotation {
    public static int getFirstElement(int[] arr)
    {
        return arr[0];
    }
    public static boolean isEven(int n){
        return (n & 1) ==0;
    }
    public static int binarySearch(int[] sortedArr,int target) {
        int low = 0;
        int high = sortedArr.length - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;
        
        if (sortedArr[mid] == target) {
            return mid;
        }
        else if (sortedArr[mid] < target){
            low = mid + 1;
        }
        else{
            high = mid - 1;
        }
    }
        return -1;
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static long sumArray(int[] arr) {
        long sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
public static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = left  + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
}
private static void merge(int[] arr, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] leftArr = new int [n1];
    int[] rightArr = new int[n2];

    System.arraycopy(arr, left, leftArr, 0 , n1);
    System.arraycopy(arr, mid + 1, rightArr, 0, n2);

    int i = 0,j = 0, k = left;
    while(i<n1 && j < n2){
        if (leftArr[i] <= rightArr[j]){
            arr[k++] = leftArr[i++];
            i++;
        } else {
            arr[k++] = rightArr[j++];
        }
    }
    while (i < n1 ) arr[k++] = leftArr[i++];
    while (j < n2) arr[k++] = rightArr[j++];
}
public static void bubbleSort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
            
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
public static void printDuplicatePairs(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate pair found: " + arr[i] + " at indices (" + i + ", " + j + ")");
                }
            }
        }
    }
    public static int[][] multiplyMatrices(int[][] A, int[][] B, int n) {
        int[][] C = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void generatePermutations(char[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(String.valueOf(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            generatePermutations(arr, index + 1); 
            swap(arr, index, i); 
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        System.out.println("=== Big O Notation Demonstrations ===\n");

      
        int[] numbers = {10, 25, 30, 42, 55, 68, 79, 90};
        System.out.println("O(1) First Element: " + getFirstElement(numbers));

       
        int searchResult = binarySearch(numbers, 42);
        System.out.println("O(log n) Binary Search index for 42: " + searchResult);

        
        System.out.println("O(n) Max Element: " + findMax(numbers));

        
        int[] unsorted = {42, 10, 55, 25, 79, 30, 68};
        mergeSort(unsorted, 0, unsorted.length - 1);
        System.out.println("O(n log n) Merge Sorted array: " + java.util.Arrays.toString(unsorted));

        int[] duplicates = {1, 2, 3, 2, 4, 1};
        System.out.println("O(n²) Duplicate Pairs:");
        printDuplicatePairs(duplicates);

        int[][] matA = {{1, 2}, {3, 4}};
        int[][] matB = {{5, 6}, {7, 8}};
        int[][] matC = multiplyMatrices(matA, matB, 2);
        System.out.println("O(n³) Matrix Result C[0][0]: " + matC[0][0]);

        
        int nFib = 7;
        System.out.println("O(2ⁿ) Fibonacci(" + nFib + "): " + fibonacci(nFib));

        
        System.out.println("O(n!) Permutations of 'ABC':");
        generatePermutations("ABC".toCharArray(), 0);
    }
}
