/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: ballController
 * Author:   Administrator
 * Date:     2018/5/20 19:52
 * Description: controller
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.luodonggan.hellospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈controller〉
 *
 * @author Administrator
 * @create 2018/5/20
 * @since 1.0.0
 */
@RestController
public class ballController {
    @Autowired
    private ballRepostory ballrep;

    @GetMapping(value = "/balls")
    public List<ballpojo>  balllist(){
        return ballrep.findAll();
    }



}
