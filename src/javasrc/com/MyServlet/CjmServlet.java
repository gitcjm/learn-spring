package com.MyServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by cjm on 7/26/16.
 */

public class CjmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        //基本知识测试
        /*resp.setContentType("text/html");
        pw.write(req.getRequestURI());
        pw.write("<hr/>");
        pw.write(req.getRequestURL().toString());
        pw.write(req.getParameter("id"));*/

        // 开始真正的MVC之旅,即,像spring一样,我也要来个拦截分发
        req.setAttribute("name", "cjm");
        req.setAttribute("age", "18");
        req.getRequestDispatcher("/aa.jsp").forward(req, resp);
    }
}
