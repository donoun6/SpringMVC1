package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV2 {

    //반환을 MyView로 반환하도록 설계
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
