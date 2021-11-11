public class App3 {
    static String getMessage(Object o) {
        return switch(o) {
            case null -> "NULL";
            case String s -> "S";
            case CharSequence cs -> "CS";
            default -> "UNKNOWN TYPE";
        };
    }
    public static void main(String[] args) {
        System.out.println(getMessage("ALA"));

    }
}
