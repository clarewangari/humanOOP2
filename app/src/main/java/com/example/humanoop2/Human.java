package com.example.humanoop2;

import android.util.Log;

public class Human {
    private String name;
    private int age;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void  eat (){
        Log.d("Human", "I am eating food");
    }
    public void sleep (){
        Log.d("Human", "zzzzzzzz");
    }
    public int sleep (int sleep) {
        Log.d("Human", "i am sleeping for x hours");
        return sleep;
    }
    public String speak (String speech){
        Log.d("Human", "I am speaking");
        return speech;

    }
    public int birthday (int birthday){
        age= birthday + 1;
        return age;

    }
}
