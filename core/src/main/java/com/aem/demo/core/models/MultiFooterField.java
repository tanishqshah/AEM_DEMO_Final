package com.aem.demo.core.models;

// import java.util.ArrayList;
// import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class MultiFooterField {
    @ValueMapValue
    @Default(values="")
    private String multiFieldsDesc;

    public String getMultiFieldsDesc() {
        return multiFieldsDesc;
    }

   
}
