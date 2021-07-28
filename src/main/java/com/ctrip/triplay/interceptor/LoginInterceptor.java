package com.ctrip.triplay.interceptor;

import com.ctrip.triplay.common.exception.UserIdentityExpiredException;
import com.ctrip.triplay.entity.po.UserEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    public static ThreadLocal<UserEntity> threadLocal = new ThreadLocal<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response
            , Object handler) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            throw new UserIdentityExpiredException();
        } else {
            UserEntity student = (UserEntity) session.getAttribute("loginUser");
            if (student == null) {
                throw new UserIdentityExpiredException();
            } else {
                threadLocal.set(student);
                session.setMaxInactiveInterval(60 * 30);
                return true;
            }
        }
    }
}
