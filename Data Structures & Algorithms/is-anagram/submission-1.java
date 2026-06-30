class Solution {
    public boolean isAnagram(String s, String t) {
        int anagram=0;
        char arr[]= t.toCharArray();
        if(s.length()!=t.length())
            return false;
        for(int i = 0; i < s.length(); i++)
        {
            for(int j=0;j<t.length();j++)
            {
                if(s.charAt(i)==arr[j])
                {
                    anagram++;
                    arr[j]= '#';
                    break;
                }
            }
        }
        if(anagram==s.length())
        {
            return true;
        }
        else
            return false;
    }
}
