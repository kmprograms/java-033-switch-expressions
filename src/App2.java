public class App2 {

    // Zadanie
    // Sprawdź, czy podany jako argument obiekt jest typu String, a następnie
    // zwróć odpowiedni komunikat, jeżeli napis będzie mieć długość większą od 1

    static String checkString(Object o) {
        if (o == null) {
            return "ARGUMENT IS NULL";
        }

        switch (o) {
            case String s:
                if (s.length() > 1) {
                    return "MESSAGE";
                }
                return "STRING IS TOO SHORT";
            default:
                return o.toString();
        }
    }

    // GUARDED PATTERNS
    // Zapis w formacie PATTERN && EXPRESSION1 && EXPRESSION2 && ...

    static String checkString2(Object o) {
        return switch (o) {
            case null -> "NULL";
            case String s && s.length() > 1 -> "MESSAGE 1";
            case String s && s.length() >= 1 && (s.contains("A") || s.contains("B")) -> "MESSAGE 2";
            case String s -> "MESSAGE 3";
            default -> o.toString();
        };
    }

    public static void main(String[] args) {
        System.out.println(checkString2(null));
        System.out.println(checkString2("AA"));
        System.out.println(checkString2("A"));
        System.out.println(checkString2("X"));
    }
}
