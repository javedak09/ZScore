package com.javedak09.zscore;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void CalcZScore(View view) {
        DownloadData();
    }

    private void DownloadData() {
        String str = "";
        String str1 = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
    }
}