package com.lifeistech.kimimojirorian.kanseiban;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by OWNER on 2017/05/13.
 */

public class Fragment1 extends Fragment {

    Button button;
    TextView text;

    /*public Fragment1() {
    }

    public static Fragment1 newInstance() {
        Fragment1 fragment = new Fragment1();
        return fragment;
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);

        button = (Button) view.findViewById(R.id.button);
        text = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button.setOnClickListener( new View.OnClickListener() {

            //ボタンがクリックされた時
            @Override
            public void onClick(View v) {
                omikuji();
            }
        });


    }

    public void omikuji(){
        int n = (int)(Math.random()*10);
        switch (n%5){
            case 0 : text.setText("全マシ-最高の一日-"); break;
            case 1 : text.setText("野菜マシマシ-栄養補給-"); break;
            case 2 : text.setText(" 野菜少なめ-ヘルシー志向-"); break;
            case 3 : text.setText("アブラかたまり-オイリーな今日この頃-"); break;
            case 4 : text.setText("帰る-今日はやめておこう-"); break;
        }
    }
}

