class Solution {
    public int longestConsecutive(int[] nums) {
        SortedSet<Integer> ss = new TreeSet<Integer>();
        if (nums.length < 2)
            return nums.length;
        for (Integer i : nums) {
            ss.add(i);
        }
        int max = 1;
        int len = 1;

        Iterator<Integer> it = ss.iterator();
        int prevElement = it.next().intValue();
        for (int i = 0; it.hasNext(); i++) {
            int element = it.next().intValue();
            // System.out.printf("element: %d, prevElement: %d\n", element, prevElement);

            if (prevElement == element - 1) {
                len++;
            } else if (prevElement == element) {
                continue;
            } else {
                max = Math.max(len, max);
                len = 1;
            }

            prevElement = element;
            // Use i and element
        }

        return Math.max(len, max);
    }
}
