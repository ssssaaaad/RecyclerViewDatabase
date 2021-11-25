package com.cookandroid.newrecyclerview2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //원본 데이터를 준비
        ArrayList<Memo> diaryList = new ArrayList<>();
        diaryList.add(new Memo("2021_11_15","이제부터 기말과제도 생각해야 겠다."));

        //어뎁터 생성
        MemoAdapter diaryAdapter = new MemoAdapter(diaryList);

        //리사이클러뷰를 찾음
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(diaryAdapter);
    }
}