import java.util.Scanner;
public class LinearSearch {
    static int countOccurance(int[] A, int B){
        int count = 0;
        for (int i = 0; i < A.length; i++){
            if(A[i] == B){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array size: ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        System.out.println("Array elements: ");
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter search element: ");
        int b = scanner.nextInt();
        System.out.println(countOccurance(array, b));
    }
}
