class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> a = new ArrayList<>();
        HashMap<String,ArrayList<Integer>> b = new HashMap<>();
        int i = 0;
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(b.containsKey(sorted)){
                b.get(sorted).add(i);
            }
            else{
                ArrayList<Integer> array = new ArrayList<>();
                array.add(i);
                b.put(sorted,array);
            }
            i++;
        }
        for (String key : b.keySet()) {
            ArrayList<String> finalArr = new ArrayList<>();
            for(Integer in: b.get(key)){
                finalArr.add(strs[in]);
            }
            a.add(finalArr);
        }
        return a;
    }
}
