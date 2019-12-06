package com.demo.user.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Colume实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-12-05 17:35:56
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Colume {

    /**
     * 数据库字段名
     * @return  数据库字段名
     */
    String value();
}
