class Solution {
    public String encode(List<String> strs) {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<strs.size();i++)
        {
            result.append(strs.get(i).length());
            result.append("#");
            result.append(strs.get(i));
        }
        return result.toString();
    }
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        StringBuilder trash = new StringBuilder();
        while(i<str.length())
        {
            int len=0;
            while(str.charAt(i)!='#')
            {
                len = len * 10 + (str.charAt(i)-'0');
                i++;
            }
            i++;//skip #
            String word = str.substring(i,i+len);
            i=i+len;
            result.add(word);
        }
        return result;
    }
}
