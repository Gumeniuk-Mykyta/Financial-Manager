package com.vymirs.penionzy.penionzy.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vymirs.penionzy.penionzy.R;

/**
 * Created by lyakhov on 2/7/2017.
 */

public class HistoryActivity extends Activity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.buttonLogo:
                Intent intent = new Intent(this, HistoryActivity.class);
                this.startActivity(intent);
                break;
            case R.id.buttonHistory:
                intent = new Intent(this, HistoryActivity.class);
                this.startActivity(intent);
                break;
            case R.id.buttonStats:
                intent = new Intent(this, HistoryActivity.class);
                this.startActivity(intent);
                break;
            case R.id.buttonSettings:
                intent = new Intent(this, HistoryActivity.class);
                this.startActivity(intent);
                break;
            case R.id.buttonBalanceMinus:
                intent = new Intent(this, HistoryActivity.class);
                this.startActivity(intent);
                break;
            case R.id.buttonBalance:
                intent = new Intent(this, HistoryActivity.class);
                this.startActivity(intent);
                break;
            case R.id.buttonBalancePlus:
                intent = new Intent(this, HistoryActivity.class);
                this.startActivity(intent);
                break;
        }

    }
}
