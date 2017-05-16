package sora.jiro.jirorian;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

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
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                TextView view = (TextView)super.getView(position, convertView, parent);
                view.setTextSize( 20 );
                view.setHeight( 400 ) ;
                view.setMinimumHeight( 400 ) ;
                return view;
            }
        };
        // アイテムを追加します
        adapter.add("ラーメン二郎 三田本店"+"【営業時間】8:30頃～15:00頃 17:00頃～20:00頃"+" 麺切れにて終了。"+"【定休日】日曜・祝日");
        adapter.add("ラーメン二郎 目黒店"+"【営業時間】12:00～16:00 18:00～24:00"+"定休日】水曜");
        adapter.add("ラーメン二郎 新宿小滝橋通り店"+"【営業時間】[下記以外の日] 11:00～25:00"+"[日・祝] 11:00～22:00"+"【定休日】なし");
        adapter.add("ラーメン二郎 新宿歌舞伎町店"+"【営業時間】11:30～27:00【定休日】水曜(祝日の場合は営業し、木曜が休み)");
        adapter.add("ラーメン二郎 仙川店"+"【営業時間】17:30～23:30"+"【定休日】日曜");
        adapter.add("ラーメン二郎 八王子野猿街道店２"+"【営業時間】[平日]　11:00～14:30 17:00～22:30[土]　11:00～15:00 16:30～22:30[日・祝]　11:00～17:00"+"【定休日】月曜（祝日含む）");
        adapter.add("ラーメン二郎 池袋東口店"+"【営業時間】11:30～23:00"+"【定休日】月曜（月曜が祝日の場合は翌日が休み）");
        adapter.add("ラーメン二郎 新小金井街道店"+"【営業時間】[平日] 17:00～24:00[土] 12:00～23:00[日] 12:00～18:30"+"【定休日】月曜");
        adapter.add("ラーメン二郎 亀戸店"+"【営業時間】11:00～14:30 17:30～21:30"+"【定休日】火曜");
        adapter.add("ラーメン二郎 府中店"+"【営業時間】16:00～22:00"+"【定休日】日曜");
        adapter.add("ラーメン二郎 荻窪店"+"【営業時間】［平日］11:30～14:30 17:30～22:00［土］11:30〜17:30"+"【定休日】木曜・日曜・祝日");
        adapter.add("ラーメン二郎 神田神保町店"+"【営業時間】11:00～17:00"+"【定休日】日曜・祝日");
        adapter.add("ラーメン二郎 小岩店"+"【営業時間】10:30～15:00"+"【定休日】土曜・日曜・祝日");
        adapter.add("ラーメン二郎 ひばりヶ丘駅前店"+"【営業時間】[平日] 11:30～14:30 17:45～20:45[土] 10:30～16:00"+"【定休日】日曜・祝日(不定休)");
        adapter.add("ラーメン二郎 桜台駅前店"+"営業時間】[平日] 17:30～23:30[土] 10:00～16:00頃"+"【定休日】日曜・祝日");
        adapter.add("ラーメン二郎 千住大橋駅前店"+"【営業時間】[平日] 11:00～14:00 18:00～21:00[土] 11:00～15:00"+"【定休日】日曜・木曜・祝日");
        adapter.add("ラーメン二郎 新橋店"+"【営業時間】[平日] 11:00～21:30[土・祝] 11:00～21:00"+"【定休日】日曜");
        adapter.add("ラーメン二郎 JR西口蒲田店"+"【営業時間】 11:00～14:30 18:00～22:30"+"【定休日】水曜");
        adapter.add("ラーメン二郎 品川店"+"【営業時間】[平日] 11:00～14:30 17:00～21:00[土] 11:00～14:00"+"【定休日】日曜・祝日");
        adapter.add("ラーメン二郎 環七新新代田店"+"【営業時間】[平日] 11:00～14:00 17:00～20:30[土・日・祝] 11:00～16:00"+"【定休日】月曜 ");
        listView.setAdapter(adapter);

    }

}
