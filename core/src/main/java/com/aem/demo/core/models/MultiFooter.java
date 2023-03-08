package com.aem.demo.core.models;

import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

@Model(adaptables = Resource.class ,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MultiFooter {

    @ValueMapValue
    @Default(values = "")
    private String multiFooterTitle;

    public String getMultiFooterTitle() {
        return multiFooterTitle;
    }

    public void setMultiFooterTitle(String multiFooterTitle) {
        this.multiFooterTitle = multiFooterTitle;
    }
    
    @ChildResource
    private List<MultiFooterField> multiFields;

    public List<MultiFooterField> getMultiFields() {
        return new ArrayList<MultiFooterField>(multiFields);
    }

}
