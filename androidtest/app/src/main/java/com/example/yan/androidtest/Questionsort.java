package com.example.yan.androidtest;

import cn.bmob.v3.BmobObject;

/**
 * Created by Yan on 2017/10/22.
 */

public class Questionsort extends BmobObject {
    private String title;
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }




}
