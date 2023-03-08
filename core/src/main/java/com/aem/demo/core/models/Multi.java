
package com.aem.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class Multi {
    @ValueMapValue
    @Default(values="")
    private String productname;

    @ValueMapValue
    @Default(values="")
    private String productdesc;

    @ValueMapValue
    @Default(values="")
    private String productprice;

    @ValueMapValue
    @Default(values="")
    private String productimage;

    @ValueMapValue
    @Default(values="")
    private String val;

    // price before discount 
    public int getVal() {
        int dis = Integer.parseInt(this.productprice) + Integer.parseInt(this.productprice) * 20 / 100;
        return dis;
    }

   


    // Product Image 
    public String getProductimage() {
        return productimage;
    }

    public void setProductimage(String productimage) {
        this.productimage = productimage;
    }

    // Product Name
    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }


    // Product description
    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }
    
    // Product Price 
    public String getProductprice() {
        return productprice;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }


    
    
}

