public class TwoPointer{
    public static int [] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1}; // Return -1 if no solution is found
    }
}
class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoPointer.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
''what did i learn from this code?From this code, you can learn the following concepts:1. Two-Pointer Technique: The code demonstrates the two-pointer technique, which is a common algorithm
 used to solve problems involving sorted arrays or lists. It involves using two pointers to traverse the array from both ends, allowing for efficient searching and comparison.
2. Array Manipulation: The code shows how to manipulate arrays in Java, including accessing elements by index and returning an array as a result. It also illustrates how to handle cases where no solution is found by returning a specific value (in this case, -1).
3. Conditional Logic: The code uses conditional statements (if-else) to compare the sum of the elements at the two pointers with the target value, demonstrating how to implement decision-making in algorithms.   
4. Method Definition and Usage: The code defines a static method `twoSum` that takes an array and a target value as parameters, showcasing how to create reusable methods in Java. It also shows how to call this method from the `main` method and handle its return value.''