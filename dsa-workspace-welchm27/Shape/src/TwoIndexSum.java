public class TwoIndexSum {

    public static int [] twoSum(int [] nums, int target){

        int[] result = new int[2];  // create an array to hold the 2 results
        // for loop to access the first index
        for (int i = 0; i < nums.length; i++) {
            // for loop to access the remainder of the elements
            for (int j = i + 1; j < nums.length; j++) {
                // check if elements add up to target
                if (nums[i] + nums[j] == target){
                    // return indices of summed elements
                    result[0] = i;  // add i to index position 0
                    result[1] = j;  // add j to index position 1
                    return result;
                }
            }
        }
        // else --> no solution, return null
        return null;
    }

    public static void main(String[] args) {
        // establish the numbers to choose from, the target and the index
        int[] nums = {2, 7, 11, 15};
        int target = 17;
        int[] index = twoSum(nums, target);

        if (index.length == 2){
            System.out.println("[" + index[0] + "," + index[1] + "]");
        }else{
            System.out.println("No solution found.");
        }



    }
}   // END OF CLASS