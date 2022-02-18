package org.factoriaf5.gohome;

import org.factoriaf5.gohome.repositories.CategoryRepository;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CategoryRepositoryTest {

    @Test
    void providesTheValidCategory() {
        CategoryRepository categoryRepository = new CategoryRepository();


        assertThat(categoryRepository.findAll(), hasItems(
                hasProperty("name", is("1")),
                hasProperty("name", is("2")),
                hasProperty("name", is("3")),
                hasProperty("name", is("4")),
                hasProperty("name", is("5"))

        ));
    }

}