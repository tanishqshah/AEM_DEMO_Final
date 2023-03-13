package com.aem.demo.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class, property = { // Required property array for sling servlet
        "sling.servlet.methods=" + "GET",
        // "sling.servlet.paths=" + "/bin/traindemo/testservlet", // in this the path
        // get exposed
        "sling.servlet.resourceTypes=" + "demo/components/page", // in this path does not get exposed to the end-user and so it is more secure
        "sling.servlet.extensions=" + "json",
        "sling.servlet.extensions=" + "sample"
}) // this is an osgi component not an AEM component
public class DemoFile extends SlingSafeMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().print("<h1>servlet called</h1>");
    }
}
// SlingSafeMethodsServlet is used for the the get method only while
// SlingAllMethodsServlet is used to get all the methods