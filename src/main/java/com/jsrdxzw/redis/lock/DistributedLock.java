package com.jsrdxzw.redis.lock;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * @author xuzhiwei
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DistributedLock {
    String lockKey();

    int expireTime() default 60;

    TimeUnit expireTimeUnit() default TimeUnit.SECONDS;
}
