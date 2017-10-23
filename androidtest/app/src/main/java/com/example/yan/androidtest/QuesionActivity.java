package com.example.yan.androidtest;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Yan on 2017/10/22.
 */

public class QuesionActivity extends AppCompatActivity{

    private TextView sortTitle;
    private TextView answer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        sortTitle= (TextView) findViewById(R.id.test);
        answer=(TextView) findViewById(R.id.answer);

        Intent intent=getIntent();

        Questionsort item= (Questionsort) intent.getSerializableExtra("Sort");
        sortTitle.setText(item.getTitle());
        answer.setText(item.getAnswer());

    }
}
