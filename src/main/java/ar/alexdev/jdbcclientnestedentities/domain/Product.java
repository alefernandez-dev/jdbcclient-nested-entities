package ar.alexdev.jdbcclientnestedentities.domain;

import java.math.BigDecimal;

public record Product(Integer id, String name, BigDecimal price, Category category) {
}
