class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        int pointer=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}