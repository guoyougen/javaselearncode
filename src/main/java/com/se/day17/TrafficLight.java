package com.se.day17;

public enum TrafficLight {
    RED("红灯"){
        @Override
        public TrafficLight next(){
            return GREEN;
        }
    },
    GREEN("绿灯"){
        @Override
        public TrafficLight next(){
            return YELLOW;
        }
    },
    YELLOW("黄灯"){
        @Override
        public TrafficLight next(){
            return RED;
        }
    };
    private String text;
    private int duration;
    private TrafficLight(String text) {
        this.text = text;
    }
    public abstract TrafficLight next();
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getDuration() {
        return this.duration;
    }
}
