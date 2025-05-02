class Solution {
    public String restoreString(String str, int[] arr) {
        int i = 0;
        char [] ch = new char[str.length()];
        while(i<arr.length){
            ch[arr[i]] = str.charAt(i);
            i++;
        }
        String res = "";
        for(char c: ch){
            res+=c;
        }
        return res;
    }
}