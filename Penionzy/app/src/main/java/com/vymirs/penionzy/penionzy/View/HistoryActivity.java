package com.vymirs.penionzy.penionzy.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vymirs.penionzy.penionzy.Model.Test;
import com.vymirs.penionzy.penionzy.R;

/**
 * Created by lyakhov on 2/7/2017.
 */

public class HistoryActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }

    public void onClick(View view) {

        Test.test(view,this);
    }
}
