package com.aem.demo.core.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;

@ExtendWith(AemContextExtension.class)
public class TabComponentTest {
    private final AemContext ctx = new AemContext();

    @BeforeEach
    public void setUp() throws Exception {
        ctx.addModelsForClasses(TabComponent.class);
        ctx.load().json("/com/aem/demo/core/models/TabComponent.json", "/content");
    }

    @Test
    public void testGetField1name() {
        final String expected = "Tanishq shah";
        ctx.currentResource("/content/tab");
        TabComponent fieldName = ctx.request().adaptTo(TabComponent.class);
        String actual = fieldName.getField1name();
        assertEquals(expected, actual);
        System.out.println("gsdf");
    }

    @Test
    public void testGetField1address() {
        final String expected = "GRAM MOHAMMADPURA BURHANPUR";
        ctx.currentResource("/content/tab");
        TabComponent fieldAddress = ctx.request().adaptTo(TabComponent.class);
        String actual = fieldAddress.getField1address();
        assertEquals(expected, actual);
        System.out.println("gsdf");
    }
}
