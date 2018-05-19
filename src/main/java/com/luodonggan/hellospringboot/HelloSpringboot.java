/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: HelloSpringboot
 * Author:   Administrator
 * Date:     2018/5/19 22:19
 * Description: yanshi
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.luodonggan.hellospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈yanshi〉
 *
 * @author Administrator
 * @create 2018/5/19
 * @since 1.0.0
 */
@RestController
public class HelloSpringboot {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){

        return "Hello Spring Boot!!";
    }
}
