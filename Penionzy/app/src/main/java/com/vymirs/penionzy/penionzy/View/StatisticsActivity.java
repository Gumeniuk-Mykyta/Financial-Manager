package com.vymirs.penionzy.penionzy.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.vymirs.penionzy.penionzy.Model.Test;
import com.vymirs.penionzy.penionzy.R;

/**
 * Created by lyakhov on 2/7/2017.
 */

public class StatisticsActivity extends Activity {

    GraphView graph;
    LineGraphSeries<DataPoint> series;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        //GRAPH CALL
        graphInit();
        graph.addSeries(series);
    }

    private void graphInit() {
        graph = (GraphView) findViewById(R.id.graphHistory);
        series = new LineGraphSeries<>(new DataPoint[]{
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
    }

    public void onClick(View view) {

        Test.test(view,this);

    }
}
