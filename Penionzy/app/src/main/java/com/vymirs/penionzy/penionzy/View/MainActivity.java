package com.vymirs.penionzy.penionzy.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import com.vymirs.penionzy.penionzy.Model.Spending;
import com.vymirs.penionzy.penionzy.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static public SpendingsListAdapter spendingsListAdapter;
    static public ListView spendingsListView;
    static public ArrayList<Spending> spendingsList = new ArrayList();
    GraphView graph;
    LineGraphSeries<DataPoint> series;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListAdapter(spendingsList);
        fillList();
        fillSpendingListWithRandomSpendings();
        //graphInit();

        //GRAPH CALL
       // graph.addSeries(series);


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

    //GRAPH SETUP
//    private void graphInit() {
//        graph = (GraphView) findViewById(R.id.graph);
//        series = new LineGraphSeries<>(new DataPoint[]{
//                new DataPoint(0, 1),
//                new DataPoint(1, 5),
//                new DataPoint(2, 3),
//                new DataPoint(3, 2),
//                new DataPoint(4, 6)
//        });
//    }




    public static void fillList() {
        spendingsListView.setAdapter(spendingsListAdapter);
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.burger:
                //show menu
                break;
            case R.id.Logo:
                //show company info
                break;
            case R.id.minusFunds:
                //show modal expense form
                break;
            case R.id.plusFunds:
                Intent intent = new Intent(this, AddFunds.class);
                this.startActivity(intent);
                break;
        }

    }
}
