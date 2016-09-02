package com.MyServlet;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

/**
 * Created by cjm on 8/1/16.
 */
public class MyTag extends TagSupport {

    @Override
    public int doEndTag() throws JspException {
        JspWriter jw = pageContext.getOut();

        try {
            jw.write("this is my tag ");
            jw.write(pageContext.getRequest().getAttribute("name").toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return EVAL_PAGE;
    }
}
