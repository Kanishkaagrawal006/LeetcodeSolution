public class Question171 {
    public int titleToNumber(String columnTitle) {
        char [] str = columnTitle.toCharArray();
        int sum=0;
        for(int i =0;i<str.length;i++) {
            sum= sum + 26*str[i]+(str[i]-'A' + 1 );


        }
        return sum;
    }
}

