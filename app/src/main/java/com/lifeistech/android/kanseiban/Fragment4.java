package com.lifeistech.android.kanseiban;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by OWNER on 2017/05/15.
 */

public class Fragment4 extends Fragment {
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment4, container, false);
        listView = (ListView) view.findViewById(R.id.listView);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1);
        // アイテムを追加します
        adapter.add("ラーメン二郎 三田本店");
        adapter.add("ラーメン二郎 目黒店");
        adapter.add("ラーメン二郎 新宿小滝橋通り店");
        adapter.add("ラーメン二郎 新宿歌舞伎町店");
        adapter.add("ラーメン二郎 仙川店");
        adapter.add("ラーメン二郎 八王子野猿街道店２");
        adapter.add("ラーメン二郎 池袋東口店");
        adapter.add("ラーメン二郎 新小金井街道店");
        adapter.add("ラーメン二郎 亀戸店");
        adapter.add("ラーメン二郎 府中店");
        adapter.add("ラーメン二郎 荻窪店");
        adapter.add("ラーメン二郎 神田神保町店");
        adapter.add("ラーメン二郎 小岩店");
        adapter.add("ラーメン二郎 ひばりヶ丘駅前店");
        adapter.add("ラーメン二郎 桜台駅前店");
        adapter.add("ラーメン二郎 千住大橋駅前店");
        adapter.add("ラーメン二郎 新橋店");
        adapter.add("ラーメン二郎 JR西口蒲田店");
        adapter.add("ラーメン二郎 品川店");
        adapter.add("ラーメン二郎 環七新新代田店");
        listView.setAdapter(adapter);

    }

}
