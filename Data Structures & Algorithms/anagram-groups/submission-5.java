class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> a = new ArrayList<>();
        HashMap<String,ArrayList<String>> b = new HashMap<>();
        int i = 0;
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(b.containsKey(sorted)){
                b.get(sorted).add(strs[i]);
            }
            else{
                ArrayList<String> array = new ArrayList<>();
                array.add(strs[i]);
                b.put(sorted,array);
            }
            i++;
        }
        for (ArrayList<String> key : b.values()) {
            a.add(key);
        }
        return a;
    }
}
