package com.example.killthesangmin3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Adapter1 extends BaseAdapter {

    /* 아이템을 세트로 담기 위한 어레이 */
    private ArrayList<listviewformat> mItems = new ArrayList<>();

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public listviewformat getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Context context = parent.getContext();

        /* 'listview_custom' Layout을 inflate하여 convertView 참조 획득 */
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listformat, parent, false);
        }

        /* 'listview_custom'에 정의된 위젯에 대한 참조 획득 */
        TextView when = (TextView) convertView.findViewById(R.id.when) ;
        TextView what = (TextView) convertView.findViewById(R.id.what) ;
        TextView explain = (TextView) convertView.findViewById(R.id.explain) ;

        /* 각 리스트에 뿌려줄 아이템을 받아오는데 mlistviewformat 재활용 */
        listviewformat myItem = getItem(position);

        /* 각 위젯에 세팅된 아이템을 뿌려준다 */
        when.setText(myItem.getWhen());
        what.setText(myItem.getWhat());
        explain.setText(myItem.getExplain());

        /* (위젯에 대한 이벤트리스너를 지정하고 싶다면 여기에 작성하면된다..)  */


        return convertView;
    }

    /* 아이템 데이터 추가를 위한 함수. 자신이 원하는대로 작성 */
    public void addItem(String when, String what, String explain) {

        listviewformat mItem = new listviewformat();

        /* listviewformat에 아이템을 setting한다. */
        mItem.setWhen(when);
        mItem.setWhat(what);
        mItem.setExplain(explain);

        /* mItems에 listviewformat을 추가한다. */
        mItems.add(mItem);

    }
}


