package com.vymirs.penionzy.penionzy.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.vymirs.penionzy.penionzy.Model.Spending;
import com.vymirs.penionzy.penionzy.R;

import java.util.ArrayList;

/**
 * Created by Nikita on 10/4/2016.
 */
public class SpendingsListAdapter extends BaseAdapter {
    private ArrayList<Spending> spendingsList;
    private Context context;
    boolean isNoDate = false;

    public SpendingsListAdapter(ArrayList<Spending> spendingsList, Context context) {
        this.spendingsList = spendingsList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return spendingsList.size();
    }

    @Override
    public Object getItem(int position) {
        return spendingsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View taskView = convertView;
        if (taskView == null) {
            taskView = LayoutInflater.from(context).inflate(R.layout.items_layout, null);
        }
//        TextView textView = (TextView) taskView.findViewById(R.id.itemText);
//        textView.setText();
//     
        return taskView;
    }
}

