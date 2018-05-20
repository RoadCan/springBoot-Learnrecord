/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: ball
 * Author:   Administrator
 * Date:     2018/5/20 10:24
 * Description: 球的实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.luodonggan.hellospringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import sun.misc.Contended;

/**
 * 〈一句话功能简述〉<br> 
 * 〈球的实体类〉
 *
 * @author Administrator
 * @create 2018/5/20
 * @since 1.0.0
 */
@Component
@ConfigurationProperties(prefix = "ball")
public class ball {
    private String size;
    private String color;
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
