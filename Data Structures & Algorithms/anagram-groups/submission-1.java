class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            int[] freq = new int[26];

            // Count frequency of each character
            for (int i = 0; i < word.length(); i++) {
                freq[word.charAt(i) - 'a']++;
            }

            // Convert frequency array to a string key
            String key = Arrays.toString(freq);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}