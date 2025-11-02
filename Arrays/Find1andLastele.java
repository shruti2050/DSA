class Find1andLastele {
   
    private int findFirst(int[] nums, int target){
        int left = 0; int right = nums.length-1 ; int index = -1;
         while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }
     private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1, index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }

     public static void main(String args[]) {
        int nums []= {5,7,7,8,8,10};
        int target = 8;
        Find1andLastele obj = new Find1andLastele();
        int result[] = obj.searchRange (nums, target);
        System.out.println("First and Last Position of Element is: [" + result[0] + ", " + result[1] + "]");
    }
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums,target);
        int last = findLast(nums,target);
        return new int[]{first, last};
    }
}