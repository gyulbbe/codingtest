class Solution {
    public String restoreString(String s, int[] indices) {
        List<StringObj> list = new ArrayList<>();
        int len = indices.length;
        for (int i = 0; i < len; i++) {
            list.add(new StringObj(indices[i], s.charAt(i)));
        }

        // 정렬
        Collections.sort(list, (a, b) -> {
            return a.indice - b.indice;
        });

        String result = "";
        for (StringObj so : list) {
            result += so.c;
        }
        return result;
    }
    class StringObj {
        int indice;
        char c;
        public StringObj(int indice, char c) {
            this.indice = indice;
            this.c = c;
        }
    }
}