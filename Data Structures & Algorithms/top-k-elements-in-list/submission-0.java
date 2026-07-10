class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n :nums)
        {
            if(map.containsKey(n))
            {
                map.put(n , map.get(n)+1);
            }
            else
            {
                map.put(n,1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<> ((a,b) -> map.get(b)-map.get(a));
        for(int keys : map.keySet())
        {
            pq.offer(keys);
        }
        int ans[] = new int[k];
        for(int i =0;i<k;i++)
        {
            ans[i] = pq.poll();
        }
        return ans;
    }
}
