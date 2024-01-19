public class removeElement {
        public static void main(String[] args){
            int[] nums = {3, 2, 2, 3, 7 ,5 ,11, 3};
            int val = 3;

            System.out.println("Val: " + val);

            System.out.print("Input Array: ");
            for(int i = 0; i < nums.length; i++){
                System.out.print(nums[i] + " ");
            }
            
            int k = removeElement(nums, val);

            System.out.println("");
            System.out.println("Output: " + k);
            System.out.print("Updated Array: ");
            for(int i = 0; i < nums.length; i++){
                System.out.print(nums[i] + " ");
            }
        }

    public static int removeElement(int[] nums, int val) {
        int[] updated = new int[nums.length];
        int removed = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                nums[i] = '_';
            }
            else{
                removed++;
            }
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 95){
                updated[count] = nums[i];
                count++;
            }
        }
        for(int i = 0; i < updated.length; i++){
            nums[i] = updated[i];
        }
        return removed;
    }
}
