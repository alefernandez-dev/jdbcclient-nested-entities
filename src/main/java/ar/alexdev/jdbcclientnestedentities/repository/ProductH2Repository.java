package ar.alexdev.jdbcclientnestedentities.repository;

import ar.alexdev.jdbcclientnestedentities.domain.Product;
import ar.alexdev.jdbcclientnestedentities.domain.ProductRepository;
import org.springframework.jdbc.core.simple.JdbcClient;
import java.util.List;

public class ProductH2Repository implements ProductRepository {

    private static final String SELECT_PRODUCT_WITH_CATEGORY = """
            SELECT
                p.id AS product_id,
                p.name AS product_name,
                p.price AS product_price,
                c.id AS category_id,
                c.name AS category_name
            FROM
                product p
            JOIN
                category c ON p.category_id = c.id;        
            """;
    private final JdbcClient jdbcClient;

    public ProductH2Repository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    @Override
    public List<Product> list() {
        return jdbcClient
                .sql(SELECT_PRODUCT_WITH_CATEGORY)
                .query(ProductRowMapper.getMapper())
                .list();
    }
}
