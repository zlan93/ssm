package com.eport.gnss.web.aoplog;

import java.lang.annotation.*;

@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemLog {
        /**
         * 日志动作名称
         * @return
         */
        String logName() default "";

        /**
         * 是否记录日志参数
         * @return
         */
        boolean isLogArguments() default true;
}