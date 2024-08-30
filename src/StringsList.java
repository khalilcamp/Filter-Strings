import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsList {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Maçã", "Abacaxi", "Art", "ana");
        List<String> resultado = filterStrings(palavras, 'a', 3);
        System.out.println(resultado);
    }

    public static String charToLowerCase(char ch) {
        return Character.toString(Character.toLowerCase(ch));
    }

    public static List<String> filterStrings(List<String> strings, char inicial, int comprimento) {
        String inicialLower = charToLowerCase(inicial);
        return strings.stream()
                .filter(s -> s.toLowerCase().startsWith(inicialLower) && s.length() == comprimento)
                .collect(Collectors.toList());
    }
}
