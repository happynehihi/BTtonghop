package com.example.btth2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PhoneAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Phone> phoneList;

    public PhoneAdapter(Context context, int layout, List<Phone> phoneList) {
        this.context = context;
        this.layout = layout;
        this.phoneList = phoneList;
    }

    @Override

    public int getCount() {
        return phoneList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView txtten = (TextView) view.findViewById(R.id.textviewten);
        TextView txtmota = (TextView) view.findViewById(R.id.textviewmota);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);

        Phone phone = phoneList.get(i);
        txtten.setText(phone.getPhone());
        imgHinh.setImageResource(phone.getHinh());

        return view;
    }
}
