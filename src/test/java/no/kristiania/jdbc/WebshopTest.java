package no.kristiania.jdbc;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebshopTest {
    @Test
    void shouldRetrieveStoresProduct() {
        ProductDao dao = new ProductDao();
        dao.insertProduct("Apples");
        assertThat(dao.listAll().contains("Apples123");

    }
}
