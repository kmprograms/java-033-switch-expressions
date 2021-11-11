import java.math.BigDecimal;

public class App1 {

    // Zadanie
    // Napisz metodę, która w zależności od typu sprawdzanego obiektu, zwróci odpowiedni komunikat.
    static String getMessage(Object o) {
        if (o instanceof Double) {
            return "DOUBLE";
        } else if (o instanceof Integer) {
            return "INTEGER";
        } else if (o instanceof String) {
            return "STRING";
        }
        return o.toString();
    }

    // SWITCH EXPRESSIONS + PATTERN MATCHING
    static String getMessage2(Object o) {
        return switch (o) {
            case Double d -> "DOUBLE: " + d;
            case Integer i -> "INTEGER: " + i;
            case String s -> "STRING: " + s;
            default -> o.toString();
        };
    }


    public static void main(String[] args) {
//        System.out.println(getMessage(10));
//        System.out.println(getMessage(10.5));
//        System.out.println(getMessage("ALA"));
        System.out.println(getMessage2(10));
        System.out.println(getMessage2(10.5));
        System.out.println(getMessage2("ALA"));
        System.out.println(getMessage2(BigDecimal.TEN));

    }
}
