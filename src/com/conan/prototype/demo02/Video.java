package com.conan.prototype.demo02;

import java.util.Date;

/**
 * 克隆的时间不同
 */
public class Video implements Cloneable {
    private String name;
    private Date creatTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        //实现深克隆
        Video v = (Video) obj;
        //属性也进行克隆
        v.creatTime=(Date)this.creatTime.clone();
        return obj;
    }

    public Video() {
    }

    public Video(String name, Date creatTime) {
        this.name = name;
        this.creatTime = creatTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", creatTime=" + creatTime +
                '}';
    }
}
