package org.zerock.w1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    private String message;
    private int count;

    public void init() {
        message = "Hello World!";
        count = 0;
        System.out.println("HelloServlet init...."); //로그
    }  //init 서블릿 객체가 만들자마자 호출.
    //한번씩만 호출

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        ++count; //객체가 하나라서 카운트값이 1씩 증가.

        String str = count % 2 == 0? "짝수":"홀수";  //짝수:홀수

        response.setContentType("text/html;charset=UTF-8");  //out.write 의 기능. 메소드로 빠져있어서 상황에 맞게끔 사용하면 됨.

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>"); //스레드가 지나가는 메서드
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>" + count + "</h1>");
        out.println("<h1>" + str + "</h1>");
        out.println("</body></html>");

        out.close();
    } // 스레드 마다 호출 (여러번 호출)
    // 객체하나 갖고 스레드를 호출

    public void destroy() {
    }  // 한번씩만 호출
}

//