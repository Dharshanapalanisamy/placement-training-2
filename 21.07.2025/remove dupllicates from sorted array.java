class Solution {
    public int removeDuplicates(int[] a) {
        if (a.length == 0) return 0;

        int i = 1;

        for (int j = 1; j < a.length; j++) {
            if (a[j] != a[i - 1]) {
                a[i] = a[j];
                i++;
            }
        }
        return i;
    }
}
