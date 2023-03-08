package com.aem.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TabComponent {

    @ValueMapValue
    @Default(values="")
    private String field1name;

    public String getField1name() {
        return field1name;
    }

    public void setField1name(String field1name) {
        this.field1name = field1name;
    }





    @ValueMapValue
    @Default(values="")
    private String field1address;

    public String getField1address() {
        return field1address;
    }

    public void setField1address(String field1address) {
        this.field1address = field1address;
    }






    @ValueMapValue
    @Default(values="")
    private String field1email;

    public String getField1email() {
        return field1email;
    }

    public void setField1email(String field1email) {
        this.field1email = field1email;
    }






    @ValueMapValue
    @Default(values="")
    private String field1age;


    public String getField1age() {
        return field1age;
    }

    public void setField1age(String field1age) {
        this.field1age = field1age;
    }





    @ValueMapValue
    @Default(values="")
    private String fieldgender;

    public String getFieldgender() {
        return fieldgender;
    }

    public void setFieldgender(String fieldgender) {
        this.fieldgender = fieldgender;
    }







    @ValueMapValue
    @Default(values="")
    private String empname;

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }






    @ValueMapValue
    @Default(values="")
    private String empid;

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }






    @ValueMapValue
    @Default(values="")
    private String empage;

    public String getEmpage() {
        return empage;
    }

    public void setEmpage(String empage) {
        this.empage = empage;
    }







    @ValueMapValue
    @Default(values="")
    private String emibusiness;

    public String getEmibusiness() {
        return emibusiness;
    }

    public void setEmibusiness(String emibusiness) {
        this.emibusiness = emibusiness;
    }






    @ValueMapValue
    @Default(values="")
    private String emisalary;

    public String getEmisalary() {
        return emisalary;
    }

    public void setEmisalary(String emisalary) {
        this.emisalary = emisalary;
    }







    @ValueMapValue
    @Default(values="")
    private String emiamount;

    public String getEmiamount() {
        return emiamount;
    }

    public void setEmiamount(String emiamount) {
        this.emiamount = emiamount;
    }







    @ValueMapValue
    @Default(values="")
    private String creditAdhar;

    public String getCreditAdhar() {
        return creditAdhar;
    }

    public void setCreditAdhar(String creditAdhar) {
        this.creditAdhar = creditAdhar;
    }







    @ValueMapValue
    @Default(values="")
    private String creditpan;

    public String getCreditpan() {
        return creditpan;
    }

    public void setCreditpan(String creditpan) {
        this.creditpan = creditpan;
    }







    @ValueMapValue
    @Default(values="")
    private String creditbank;

    public String getCreditbank() {
        return creditbank;
    }
    public void setCreditbank(String creditbank) {
        this.creditbank = creditbank;
    }
    
    
}
