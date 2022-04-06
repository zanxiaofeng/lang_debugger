import java.security.*;

public class ListProviders {

    public static void main(String[] args) {
        for (Provider provider : Security.getProviders()) {
            System.out.println(provider.getName());

            provider.stringPropertyNames().stream().forEach(key -> {
                System.out.println("\tP: " + key + "\t: " + provider.getProperty(key));
            });

            provider.getServices().stream().forEach(s -> {
                System.out.println("\tS: " + s.getType() + "\t: " + s.getAlgorithm());
            });
        }
    }
}
