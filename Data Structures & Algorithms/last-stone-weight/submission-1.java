class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>(stones.length);
        for(int num : stones){
            list.add(num);
        }
        //list = [2, 2, 3, 4, 6]
        //        0  1  2  3  4
        //              i     j

        //res = [2, 3, 4, 4, 1, 2, 2, 1, 1]

        while(list.size() > 1){
            Collections.sort(list);
            int cur = list.remove(list.size() - 1) - 
            list.remove(list.size() - 1);

            if(cur != 0) list.add(cur);
        }

        return list.isEmpty() ? 0 : list.get(0);
    }
}
