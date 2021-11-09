package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s) {
        String resultString="";
        for (int i = 0 ; i < s.length(); i++) {
            if (i % 2 == 0) {
                resultString = resultString + s.substring(i,i+1);
            }
        }
        return resultString;
    }
}
