public class StringManipulator {
    public String trimAndConcat(String str, String str2) {
        str = str.trim();
        str2 = str2.trim();
        return str + str2;
    }
    public Integer getIndexOrNull(String str, char chr) {
        int num = str.indexOf(chr);
        if (num >= 0){
            return num;
        }
        else {
            return null;
        }
    }
    public Integer getIndexOrNull(String str, String str2){
        int num = str.indexOf(str2);
        if (num >= 0){
            return num;
        }
        else {
            return null;
        }
    }
    public String concatSubstring(String str, int num, int num2, String str2) {
        return str.substring(num, num2) + str2;
    }

}