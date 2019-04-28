package com.chao.cloud.common.extra.access.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

/**
 * 接口访问限制-ip+port-controller层拦截
 * @功能：
 * @author： 薛超
 * @时间：2019年4月24日
 * @version 1.0.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(AccessLimitConfiguration.class)
@Documented
public @interface EnableAccessLimit {

}