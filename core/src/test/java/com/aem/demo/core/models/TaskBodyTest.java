package com.aem.demo.core.models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;

@ExtendWith(AemContextExtension.class)
public class TaskBodyTest {
    private final AemContext ctx = new AemContext();

    @BeforeEach
    public void setUp() throws Exception {
        ctx.addModelsForPackage("com.aem.demo.core.models");
        ctx.load().json("/com/aem/demo/core/models/MultiProduct.json", "/content");
    }


    @Test
    public void testGetCategoryname() {
        final String expected = "Electronics";
        ctx.currentResource("/content/tab");
        TaskBody multiProductJson = ctx.request().adaptTo(TaskBody.class);
        String actual = multiProductJson.getCategory();
        assertEquals(expected, actual);
        System.out.println("gsdf");
    }

    @Test
    public void testGetField1name() {
        final String expected[] = { "Samsung", "Samsung", "Oppo" };
        ctx.currentResource("/content/tab");
        TaskBody multiProductJson = ctx.request().adaptTo(TaskBody.class);
        List<Multi> multi = multiProductJson.getMulti();
        for (int i = 0; i <= 2; i++) {
            assertEquals(expected[i], multi.get(i).getProductname());
        }
    }

    
}
