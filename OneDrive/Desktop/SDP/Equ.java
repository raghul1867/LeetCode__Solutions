public class Equ{
    public static int findEquilibrium(int arr[], int n) {
        int s
        int leftsum = 0; // Initialize leftsum

        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i)
            sum += arr[i];

        for (int i = 0; i < n; ++i) {
            sum -= arr[i]; // sum is now right sum for index i

            if (leftsum == sum)
                return i;

            leftsum += arr[i];
        }

        /* If no equilibrium index found, return -1 */
        return -1;
    
}
public static void main(String[] args){
    int[] arr = {-7,1,5,2,-4,3,0};
    int res = findEquilibrium(arr);
    System.err.println("Equilibrium Index: "+res);
}
}