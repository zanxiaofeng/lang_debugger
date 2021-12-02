import java.security.*;

public class ListCiphers {
    public static void main(String[] args) {
        for (Provider provider : Security.getProviders()) {
            provider.getServices().stream()
                    .filter(s -> "Cipher".equals(s.getType()))
                    .map(s -> s.getAlgorithm())
                    .forEach(System.out::println);
        }
    }
}

