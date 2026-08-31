class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> a = new ArrayList<>();
        HashMap<String,ArrayList<String>> b = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(b.containsKey(sorted)){
                b.get(sorted).add(s);
            }
            else{
                ArrayList<String> array = new ArrayList<>();
                array.add(s);
                b.put(sorted,array);
            }
        }
        for (ArrayList<String> key : b.values()) {
            a.add(key);
        }
        return a;
    }
}
