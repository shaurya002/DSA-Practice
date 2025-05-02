class Solution {
    public String interpret(String command) {
        String str1 = command.replace("()","o");
        return str1.replace("(al)","al");
    }
}