package zxf;

import static java.nio.charset.StandardCharsets.*;

public class UnicodeCases {
    public static void main(String[] args) {
        String chineseInJava = "ceshi";
        byte[] chineseInUTF8Byte = chineseInJava.getBytes(UTF_8);
        byte[] chineseInUTF16LEByte = chineseInJava.getBytes(UTF_16LE);
        String chineseInUTF8Java = new String(chineseInUTF8Byte, UTF_8);
        String chineseInUTF16LEJava = new String(chineseInUTF16LEByte, UTF_16LE);

        String englishInJava = "Ts";
        byte[] englishInUTF8Byte = englishInJava.getBytes(UTF_8);
        byte[] englishInUTF16LEByte = englishInJava.getBytes(UTF_16LE);
        String englishInUTF8Java = new String(englishInUTF8Byte, UTF_8);
        String englishInUTF16LEJava = new String(englishInUTF16LEByte, UTF_16LE);
    }
}
