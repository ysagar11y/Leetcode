class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Map<Integer, Pair<Boolean, Boolean>> M = new HashMap<>();
        int[] ANS = new int[A.length];
        int c = 0;

        for (int i = 0; i < A.length; i++) {
            // Process element from array A
            if (!M.containsKey(A[i])) {
                M.put(A[i], new Pair<>(true, false));
            } else {
                Pair<Boolean, Boolean> current = M.get(A[i]);
                if (!current.getKey() && current.getValue()) {
                    c++;
                    M.put(A[i], new Pair<>(true, current.getValue()));
                }
            }

            // Process element from array B
            if (!M.containsKey(B[i])) {
                M.put(B[i], new Pair<>(false, true));
            } else {
                Pair<Boolean, Boolean> current = M.get(B[i]);
                if (!current.getValue() && current.getKey()) {
                    c++;
                    M.put(B[i], new Pair<>(current.getKey(), true));
                }
            }

            ANS[i] = c;
        }

        return ANS;
    }

    // Helper class to represent a pair of booleans
    private static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}