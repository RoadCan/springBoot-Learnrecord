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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private ball ballpropertis;

//    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    //简化写法
    @GetMapping(value={"hello","hi"})
public String say(@RequestParam(value = "id" ,required = false,defaultValue = "0" ) Integer myId){
//            return "球的大小:"+ballpropertis.getSize()+"\n"+"颜色："+ballpropertis.getColor();
        return  "id="+myId;
//          return cupSize;
//        return "Hello Spring Boot!!";
    }
}
