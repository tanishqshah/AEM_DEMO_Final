package com.aem.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

// import javax.inject.Inject;
import java.util.*;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TaskBody {
    
    @ValueMapValue
    @Default(values = "")
    private String category;

    public String getCategory() {
        return category;
    }

    @ChildResource
    private List<Multi> multi;

    public List<Multi> getMulti() {
        return new ArrayList<Multi>(multi);
    }
}
