package com.demo.user.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Table实体
 *
 * @author Faker
 * @version 1.0
 * @since 2019-12-05 17:35:04
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
    /**
     * 表名
     * @return 表名
     */
    String value();

    /**
     * 是否使用数据库自增ID
     * @return 是否使用
     */
    boolean autoIncrease() default false;
}
