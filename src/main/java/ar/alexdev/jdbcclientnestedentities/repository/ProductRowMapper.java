package ar.alexdev.jdbcclientnestedentities.repository;

import ar.alexdev.jdbcclientnestedentities.domain.Category;
import ar.alexdev.jdbcclientnestedentities.domain.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    public static ProductRowMapper getMapper() {
        return new ProductRowMapper();
    }
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Product(
                rs.getInt("product_id"),
                rs.getString("product_name"),
                rs.getBigDecimal("price"),
                new Category(
                        rs.getInt("category_id"),
                        rs.getString("category_name")
                )
        );
    }
}
