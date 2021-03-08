import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hello {
    public static void main(String[] args) {
        String str = "u2345o78P";
        System.out.println("java Test demo  new");
        System.out.println("java Test demo  new>>>>>"+isPassportPh(str));

    }

    public static boolean isPassportPh(String passport) {
        //val check = "^[A-Za-z0-9]+\$"
        String check = "^[a-zA-Z][0-9]{7}[a-zA-Z]";
        Pattern regex= Pattern.compile(check);
        Matcher matcher = regex.matcher(passport);
        return matcher.matches();
    }
}
