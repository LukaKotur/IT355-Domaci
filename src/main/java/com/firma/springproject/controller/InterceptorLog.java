/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firma.springproject.controller;

import java.lang.reflect.Method;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Luka
 */
@Aspect
public class InterceptorLog implements MethodBeforeAdvice {

    @Override
    public void before(Method arg0, Object[] arg1, Object arg2)
            throws Throwable {
        System.out.println("logBefore() is running!");
        System.out.println("hijacked : " + arg0.getName());
        System.out.println("******");
    }

}
