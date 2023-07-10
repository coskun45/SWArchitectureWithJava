package org.example.Command;

import java.math.BigDecimal;

public class BölmeCommand implements Islem{
    @Override
    public BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2) {
        return sayi1.divide(sayi2);
    }
}
