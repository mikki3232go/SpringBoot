package shop.mtcoding.basiccontroller.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller//컴포턴트 스캔(디스패쳐 서블릿이 찾아줌)
public class HttpMethodController {
    public HttpMethodController() {
        System.out.println("컴포넌트 스캔됨");
    }

    @GetMapping("/req/get")
    public void methodGet() {
        System.out.println("methodGet 호출됨");
    }

    @GetMapping("/req/get/v2")
    public void methodGetV2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("methodGetV2 호출됨");
        PrintWriter pw = response.getWriter();
        pw.println("<h1>Get</h1>");
    }

    //콘트롤러의 모든 메서드는 메서드가 응답하는 문자열을 view네임이다.
    @GetMapping("/req/get/v3")
    public String methodGetV3() {

        return "hello"; //viewResolver가 발동(홈디렉토리 : 확장자 mustach 파일 검색)
    }

    @ResponseBody //MessageConvert 발동-> 그대로 html생성
    @GetMapping("/req/get/v4")
    public String methodGetV4() {

        return "<h1>Get</h1>"; //MessageConvert 발동 -문자열->html
    }
    @GetMapping("/req/get/v5")
    public String methodGetV5() {

        return "redirect:/req/get/v4";
    }
    @ResponseBody
    @PostMapping("/req/post")
    public String methodPost() {

        return "<h1>Get</h1>"; //MessageConvert 발동 -문자열->text/plain
    }
    @ResponseBody
  @PutMapping("/req/put")
    public String methodPut() {

        return "<h1>put</h1>"; //MessageConvert 발동 -문자열->text/plain
    }
    @ResponseBody
    @DeleteMapping("/req/delete")
    public String methodDelete() {

        return "<h1>delete</h1>"; //MessageConvert 발동 -문자열->text/plain
    }

}