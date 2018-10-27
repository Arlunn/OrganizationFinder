package com.example.singyboiz.organizationfinder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;


public class SwipeStackAdapter extends BaseAdapter {

    private List<String> mData;
    private Context context;

    public SwipeStackAdapter(List<String> data, Context contextInput) {
        this.mData = data;
        context = contextInput;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public String getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.card, parent, false);
        TextView textViewCard = (TextView) convertView.findViewById(R.id.clubName);
        textViewCard.setText(mData.get(position));

        return convertView;
    }

}