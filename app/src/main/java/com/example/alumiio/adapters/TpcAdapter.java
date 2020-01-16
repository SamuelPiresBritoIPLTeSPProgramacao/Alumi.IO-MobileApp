package com.example.alumiio.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.alumiio.models.Tpc;

import java.util.ArrayList;

public class TpcAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;

    private ArrayList<Tpc> tpcs;


    @Override
    public int getCount() {
        return tpcs.size();
    }

    @Override
    public Object getItem(int position) {
        return tpcs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}