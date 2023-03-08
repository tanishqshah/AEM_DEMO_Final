// package com.aem.demo.core.models;

package com.aem.demo.core.models;



import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
// import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


// import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;


import java.util.*;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TaskFooter {
    
    @ChildResource
    private List<MultiFooter> multifooter;

    public List<MultiFooter> getMultifooter() {
        return new ArrayList<MultiFooter>(multifooter);
    }



   
}
