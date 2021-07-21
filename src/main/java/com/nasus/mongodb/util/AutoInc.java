package com.nasus.mongodb.util;

import java.lang.annotation.*;

/**
 * @USER: Royal
 * @DATE: 2021/7/6
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface AutoInc {
}
