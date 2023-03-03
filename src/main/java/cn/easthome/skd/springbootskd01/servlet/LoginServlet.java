package cn.easthome.skd.springbootskd01.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    //来了个get请求执行doGet方法
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      获取客户端提交过来的数据中包含中文的乱码问题
//        解决客户端的中文乱码问题
        request.setCharacterEncoding("utf-8");
//        服务端的中文乱码问题(设置响应数据与请求端格式一致)
        response.setHeader("Content-Type","text/html;charset=UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
        System.out.println("来个一个get请求。。。。。");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+":"+password);
        if ("admin".equals(username) && "123456".equals(password)) {
            //成功
//          response.getWriter().println("Successful成功!");
            //跳转到成功的页面（重定向或者请求转发）
//          response.sendRedirect("successful.jsp");
            //请求转发
            //携带一个数据到请求端
//            request.setAttribute("data",username);
            //把响应数据存储到session中
            HttpSession session = request.getSession();
            session.setAttribute("data1",username);
            request.getRequestDispatcher("successful.jsp").forward(request,response);
        }else {
            //失败
//            response.getWriter().write("Fail!");
            // 跳转到失败的页面（重定向或者请求转发）
            response.sendRedirect("fail.jsp");
        }
    }
    //来了个post请求执行doPost方法
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
