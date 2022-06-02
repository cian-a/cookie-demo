package top.hxiaobo.web.cookie;

import org.apache.taglibs.standard.tag.common.core.UrlSupport;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/aServlet")
public class AServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         //发送cookie



        String value="张三";
        value = URLEncoder.encode(value, "UTF-8");

        //创建cookie
        Cookie cookie = new Cookie("username", value);
        cookie.setMaxAge(60 * 60 * 24 * 7);

        //发送cookie

        response.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
