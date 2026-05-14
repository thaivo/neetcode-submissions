class Solution {

    public String encode(List<String> strs) {
        String result = new String();
        for(String s: strs){
            result += "" + s.length() + "#" + s;
        }
        System.out.println("encode: result:"+result);
        return result;
    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        String temp = new String();
        String strLen = new String();
        for(int i = 0; i < str.length();){
            if(str.charAt(i) == '#'){
                int length = Integer.parseInt(strLen);
                result.add(str.substring(i+1, i + 1 + length));
                i += 1 + length;
                temp = "";
                strLen = "";
            } else {
                strLen += str.charAt(i);
                i++;
            }
        }
        return result;
    }
}
