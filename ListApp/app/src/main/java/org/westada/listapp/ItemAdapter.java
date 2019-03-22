package org.westada.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] items;
    String[] prices;
    String[] description;

    public ItemAdapter(Context c, String[] i, String[] p, String[] d){
        items = i;
        prices = p;
        description = d;
        mInflater = (LayoutInflater) c.getSystemService (Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View v = mInflater.inflate(R.layout.listview_details, null);
        TextView ItemsTextView = v.findViewById(R.id.items);
        TextView PricesTextView = v.findViewById(R.id.prices);
        TextView DescTextView = v.findViewById(R.id.descriptions);

        String name = items[i];
        String desc = description[i];
        String cost = prices[i];

        ItemsTextView.setText(name);
        PricesTextView.setText(cost);
        DescTextView.setText(desc);

        return v;
    }

}