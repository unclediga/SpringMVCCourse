package ru.unclediga.interceptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import ru.unclediga.HitCounter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class GlobalInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    HitCounter counter;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        counter.setHits(counter.getHits() + 1);
        System.out.println("HitCounter " + counter.getHits());
        request.setAttribute("currentDate", new Date());
        return super.preHandle(request, response, handler);

    }
}
