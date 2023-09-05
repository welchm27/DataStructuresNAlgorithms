import java.util.HashMap;

class TwoSumHashmap {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 22;

        merge(nums, target);


    }

    public static int[] merge(int[] nums, int target) {
        HashMap<Integer, Integer> mapNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (mapNums.containsKey(diff)) {
                System.out.println("Contains valid match");
                System.out.println("Index position: " + i +
                        ", and index position: " + mapNums.get(diff));
                return new int[]{mapNums.get(diff), i};
            }
            mapNums.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match found");
    }

}   // END OF CLASS