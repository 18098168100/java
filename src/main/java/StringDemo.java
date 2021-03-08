import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println("java Test demo new");
        //指定字符串
        String str = "welcome to china";
        //查找字符  o  出现的所有位置
        int num = 0;
        Pattern pattern = Pattern.compile("n");
        Matcher findMatcher = pattern.matcher(str);

            while(findMatcher.find()) {
                num = findMatcher.start();
            }
        System.out.println(">>>>>"+num);


    }
}
