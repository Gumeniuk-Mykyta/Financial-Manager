package com.vymirs.penionzy.penionzy.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.vymirs.penionzy.penionzy.Model.Spending;
import com.vymirs.penionzy.penionzy.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static public SpendingsListAdapter spendingsListAdapter;
    static public ListView spendingsListView;
    static public ArrayList<Spending> spendingsList = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListAdapter(spendingsList);
        fillList();
        fillSpendingListWithRandomSpendings();
    }

    private void fillSpendingListWithRandomSpendings() {
        for (int i = 0; i < 10; i++) {
            spendingsList.add(new Spending());
        }
    }


    public void setListAdapter(ArrayList<Spending> tasksList) {
        spendingsListView = (ListView) findViewById(R.id.listExpenses);
        spendingsListAdapter = new SpendingsListAdapter(spendingsList, this);
    }

    public static void fillList() {
        spendingsListView.setAdapter(spendingsListAdapter);
    }
}
