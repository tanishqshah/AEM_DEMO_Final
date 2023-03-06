package com.aem.demo.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Default;
import javax.inject.Inject;


@Model(adaptables = Resource.class)


public class CustomComponentModel {
    
    @Inject
    @Default(values="")
    private String title;
    public String getTitle(){
        return title;
    }
}
