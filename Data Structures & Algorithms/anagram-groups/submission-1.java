class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        boolean visited[] = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (visited[i])
                continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {

                if (visited[j])
                    continue;

                if (strs[i].length() != strs[j].length())
                    continue;

                char[] a1 = strs[i].toCharArray();
                char[] a2 = strs[j].toCharArray();

                int anagram = 0;

                for (int x = 0; x < a1.length; x++) {

                    for (int y = 0; y < a2.length; y++) {

                        if (a1[x] == a2[y]) {

                            anagram++;

                            // Mark character as used
                            a2[y] = '#';

                            break;
                        }
                    }
                }

                if (anagram == a1.length) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            ans.add(group);
        }

        return ans;
    }
}
