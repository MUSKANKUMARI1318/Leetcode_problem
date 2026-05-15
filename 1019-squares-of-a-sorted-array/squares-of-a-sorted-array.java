class Solution {

    public int[] sortedSquares(int[] nums) {

        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

       
        for (int num : nums) {

            int square = num * num;

            if (num < 0) {
                neg.add(square);
            } else {
                pos.add(square);
            }
        }

       
        Collections.reverse(neg);

        
        int[] result = new int[nums.length];

        int i = 0;
        int j = 0;
        int k = 0;

        
        while (i < neg.size() && j < pos.size()) {

            if (neg.get(i) < pos.get(j)) {
                result[k] = neg.get(i);
                i++;
            } else {
                result[k] = pos.get(j);
                j++;
            }

            k++;
        }

       
        while (i < neg.size()) {
            result[k] = neg.get(i);
            i++;
            k++;
        }

        while (j < pos.size()) {
            result[k] = pos.get(j);
            j++;
            k++;
        }

        return result;
    }
}