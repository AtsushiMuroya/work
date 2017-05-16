package com.lifeistech.kimimojirorian.kanseiban;

//import android.app.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by OWNER on 2017/05/13.
 */

public class Fragment3 extends Fragment implements View.OnClickListener {
    ListView listView;
    EditText editText;
    ArrayAdapter adapter;
    Button button;

    /*public Fragment3() {
    }

    public static Fragment3 newInstance() {
        Fragment3 fragment = new Fragment3();
        return fragment;
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, container, false);
        listView = (ListView) view.findViewById(R.id.listView);
        editText = (EditText) view.findViewById(R.id.editText);
        button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(this);
        return view;

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_expandable_list_item_1);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArrayAdapter adapter = (ArrayAdapter) listView.getAdapter();

                String item = (String) adapter.getItem(position);
                adapter.remove(item);
                adapter.add(item);
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                ArrayAdapter adapter = (ArrayAdapter) listView.getAdapter();

                String item = (String) adapter.getItem(position);
                adapter.remove(item);

                return false;
            }
        });
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button:

                String text;
                text = editText.getText().toString();
                Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
                adapter.add(text);
                break;
        }

    }
}
