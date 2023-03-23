package com.aem.demo.core.models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;

@ExtendWith(AemContextExtension.class)
public class TaskFooterTest {
    private final AemContext ctx = new AemContext();

    @BeforeEach
    public void setUp() throws Exception {
        ctx.addModelsForPackage("com.aem.demo.core.models");
        ctx.load().json("/com/aem/demo/core/models/TaskFooter.json", "/content");
    }



    @Test
    public void footerInfo() {
        final String expected[][] = { {"xIOMI", "Samsung", "Oppo","Vivo"},{"Mattress","Smartwatches","Bicycles","Camera"} };
        final String multifooterTitle[] = { "Mobiles", "Lifestyle & Fitness", "Loans" , "Calculators","InvestMent" };
        ctx.currentResource("/content/footerinfo");
        TaskFooter footerinfo = ctx.request().adaptTo(TaskFooter.class);
        List<MultiFooter> footerMulti = footerinfo.getMultifooter();
        for (int i = 0; i < multifooterTitle.length; i++) {
            assertEquals(multifooterTitle[i], footerMulti.get(i).getMultiFooterTitle());
        }
        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals(expected[i][j], footerMulti.get(i).getMultiFields().get(j).getMultiFieldsDesc());
            }
        }
    }

    
}
