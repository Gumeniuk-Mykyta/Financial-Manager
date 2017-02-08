package com.vymirs.penionzy.penionzy.Model;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.vymirs.penionzy.penionzy.R;
import com.vymirs.penionzy.penionzy.View.HistoryActivity;

/**
 * Created by Nikita on 2/8/2017.
 */

public class Test {
    public static void test(View view, Context context){
    switch (view.getId()) {

        case R.id.buttonLogo:
            Intent intent = new Intent(context, HistoryActivity.class);
            context.startActivity(intent);
            break;
        case R.id.buttonHistory:
            intent = new Intent(context, HistoryActivity.class);
            context.startActivity(intent);
            break;
        case R.id.buttonStats:
            intent = new Intent(context, HistoryActivity.class);
            context.startActivity(intent);
            break;
        case R.id.buttonSettings:
            intent = new Intent(context, HistoryActivity.class);
            context.startActivity(intent);
            break;
        case R.id.buttonBalanceMinus:
            intent = new Intent(context, HistoryActivity.class);
            context.startActivity(intent);
            break;
        case R.id.buttonBalance:
            intent = new Intent(context, HistoryActivity.class);
            context.startActivity(intent);
            break;
        case R.id.buttonBalancePlus:
            intent = new Intent(context, HistoryActivity.class);
            context.startActivity(intent);
            break;
    }}

}
