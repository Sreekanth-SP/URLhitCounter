package com.example.urlhitCounter.model;

public class hitModel {
    private String username;
    private Integer count;

    hitModel(){
    }
    public hitModel(Integer count)
    {
        this.count=count;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    public hitModel(String username, Integer count) {
        this.username = username;
        this.count = count;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Visitor{" + "username='" + username + '\'' + ", count='" + count + '\'' + '}';
    }
}