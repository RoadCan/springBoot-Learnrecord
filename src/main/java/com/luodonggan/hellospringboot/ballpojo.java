/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: ballpojo
 * Author:   Administrator
 * Date:     2018/5/20 16:20
 * Description: pojo
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.luodonggan.hellospringboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 〈一句话功能简述〉<br> 
 * 〈pojo〉
 *
 * @author Administrator
 * @create 2018/5/20
 * @since 1.0.0
 */
@Entity
public class ballpojo {

    @Id
    @GeneratedValue
    private Integer ID;
    private String size;
    private String color;

    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
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
