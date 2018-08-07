package com.imooc.demo.entity;

import java.util.Date;

public class Activity {
    private int id;
    private String activityTitle;
    private String imageUrl;
    private String activityContent;
    private Date activityCreateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getActivityContent() {
        return activityContent;
    }

    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent;
    }

    public Date getActivityCreateTime() {
        return activityCreateTime;
    }

    public void setActivityCreateTime(Date activityCreateTime) {
        this.activityCreateTime = activityCreateTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    private Date startTime;
    private Date endTime;
}
