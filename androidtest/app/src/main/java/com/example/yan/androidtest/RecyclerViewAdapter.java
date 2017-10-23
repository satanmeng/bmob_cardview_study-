package com.example.yan.androidtest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Yan on 2017/10/22.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.QuestionsortViewHolder>{

    private List<Questionsort> sort;
    private Context context;

    public RecyclerViewAdapter(List<Questionsort> sort,Context context){
        this.sort=sort;
        this.context=context;

    }

    @Override
    public RecyclerViewAdapter.QuestionsortViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.questions_sort,parent,false);
        QuestionsortViewHolder nvh=new QuestionsortViewHolder(v);
        return nvh;
    }

    @Override
    public void onBindViewHolder(QuestionsortViewHolder holder, int position) {
        final int j=position;

        holder.sort_title.setText(sort.get(position).getTitle());

        //为cardView设置点击事件
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,QuesionActivity.class);
                intent.putExtra("Sort",sort.get(j));
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return sort.size();
    }

    static class QuestionsortViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        TextView sort_title;

        public QuestionsortViewHolder(View itemView) {
            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.cardView);
            sort_title=(TextView)itemView.findViewById(R.id.sort_title);
        }
    }


}
