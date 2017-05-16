package com.lifeistech.kimimojirorian.kanseiban;

//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;

/**
 * Created by OWNER on 2017/05/13.
 */

public class Fragment2 extends Fragment {

    Button st_b;
    Button sp_b;
    Button rt_b;
    Chronometer c;
    boolean chk = false;

   /* public Fragment2() {
    }

    public static Fragment2 newInstance() {
        Fragment2 fragment = new Fragment2();
        return fragment;
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        /*final Chronometer*/ c = (Chronometer)view.findViewById(R.id.chronometer_id);
        st_b = (Button)view.findViewById(R.id.start_button_id);
        sp_b = (Button)view.findViewById(R.id.stop_button_id);
        rt_b = (Button)view.findViewById(R.id.reset_button_id);
        return view;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        /** Start Button **/
        st_b.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        if (chk) {
                            c.start();
                        }
                        else {
                            c.setBase(SystemClock.elapsedRealtime());
                            c.start();
                        }
                    }
                }
        );

        /** Stop Button **/
        sp_b.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        c.stop();
                        chk = true;
                    }
                }
        );

        /** Reset Button **/
        rt_b.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        c.stop();
                        c.setBase(SystemClock.elapsedRealtime());
                        chk = false;
                    }
                }
        );
    }
}

