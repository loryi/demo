package com.example.demo.annotation;

import com.example.demo.common.CacheType;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author loryi
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Cache {

    /**
     * 缓存Key
     *
     * @return
     */
    String name() default "";

    /**
     * 缓存类型
     *
     * @return
     */
    CacheType type() default CacheType.DEFAULT;


    /**
     * 缓存Key前缀
     *
     * @return
     */
    String prefix() default "";

    /**
     * 缓存Key后缀（方法入参位置）
     *
     * @return
     */
    int suffixIndex() default -999;


    /**
     * 缓存key后缀多参数参与
     */
    int[] suffixIndexs() default {-999};

    /**
     * 有效时长，为0则永不过时,默认为5分钟
     *
     * @return
     */
    int expireTime() default 300;

}
