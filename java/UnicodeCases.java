package zxf;

import static java.nio.charset.StandardCharsets.*;

/*
 UTF-8 has the property that all existing 7-bit ASCII strings are still valid. UTF-8 only affects the meaning of bytes greater than 127, which it uses to represent higher Unicode characters. A character might require 1, 2, 3, or 4 bytes of storage depending on its value; more bytes are needed as values get larger. To store the full range of possible 32-bit characters, UTF-8 would require a whopping 6 bytes. But again, Unicode only defines characters up to 0x10FFFF, so this should never happen in practice.

UTF-8 is a specific scheme for mapping a sequence of 1-4 bytes to a number from 0x000000 to 0x10FFFF:

00000000 -- 0000007F:   0xxxxxxx
00000080 -- 000007FF:   110xxxxx 10xxxxxx
00000800 -- 0000FFFF:   1110xxxx 10xxxxxx 10xxxxxx
00010000 -- 001FFFFF:   11110xxx 10xxxxxx 10xxxxxx 10xxxxxx

The x's are bits to be extracted from the sequence and glued together to form the final number.

It is fair to say that UTF-8 is taking over the world. It is already used for filenames in Linux and is supported by all mainstream web browsers. This is not surprising considering its many nice properties:

    It can represent all 1,114,112 Unicode characters.
    Most C code that deals with strings on a byte-by-byte basis still works, since UTF-8 is fully compatible with 7-bit ASCII.
    Characters usually require fewer than four bytes.
    String sort order is preserved. In other words, sorting UTF-8 strings per-byte yields the same order as sorting them per-character by logical Unicode value.
    A missing or corrupt byte in transmission can only affect a single character—you can always find the start of the sequence for the next character just by scanning a couple bytes.
    There are no byte-order/endianness issues, since UTF-8 data is a byte stream.

*/

public class UnicodeCases {
    public static void main(String[] args) {
        //For Java String coder=UTF16(1)
        String chineseInJava = "\u0091测试\u0092";
        byte[] chineseInUTF8Byte = chineseInJava.getBytes(UTF_8);
        byte[] chineseInUTF16LEByte = chineseInJava.getBytes(UTF_16LE);
        String chineseInJavaFromUTF8Bytes = new String(chineseInUTF8Byte, UTF_8);
        String chineseInJavaFromUTF16LEBytes = new String(chineseInUTF16LEByte, UTF_16LE);


        //For Java String coder=LATIN1(0)
        String englishInJava = "\u0091Ts\u0092";
        byte[] englishInUTF8Byte = englishInJava.getBytes(UTF_8);
        byte[] englishInUTF16LEByte = englishInJava.getBytes(UTF_16LE);
        String englishInJavaFromUTF8Bytes = new String(englishInUTF8Byte, UTF_8);
        String englishInJavaFromUTF16LEBytes = new String(englishInUTF16LEByte, UTF_16LE);
    }
}
