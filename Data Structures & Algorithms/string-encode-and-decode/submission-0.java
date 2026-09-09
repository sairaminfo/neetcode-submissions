class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";
        for(String str:strs){
            String lenDelimiter=str.length()+"#";
            lenDelimiter +=str;
            encodedString+=lenDelimiter;
        }
        return encodedString;

    }

    public List<String> decode(String str) {
        List<String> decodedStrings=new ArrayList<>();
        int index=0;
        while(index<str.length()){
            String length="";
            while(str.charAt(index)!='#'){
                length+=str.charAt(index);
                index++;
            }
            index++;
            int lengthofWord=Integer.valueOf(length);
            String actualWord="";
            while(lengthofWord>0){
                actualWord+=str.charAt(index);
                lengthofWord--;
                index++;
            }
            decodedStrings.add(actualWord);
        }
        return decodedStrings;
    }
}
