public class removeElement {
    public static void main(String[] args){

    }
    public int removeElement(int[] nums, int val) {
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
