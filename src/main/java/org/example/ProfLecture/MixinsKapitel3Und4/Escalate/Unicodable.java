package org.example.ProfLecture.MixinsKapitel3Und4.Escalate;

import java.nio.charset.Charset;

public interface Unicodable {
    String text();
    default byte[] utf8() {
        return text().getBytes(Charset.forName("UTF-8"));
    }

}
