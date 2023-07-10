package org.example.mixin.ilk;

import java.nio.charset.Charset;

public class UnicodeMessage extends Message{
    public UnicodeMessage(String t) {
        super(t);
    }
    public byte[] utf8() {
        return text().getBytes(Charset.forName("UTF-8"));
    }
}
