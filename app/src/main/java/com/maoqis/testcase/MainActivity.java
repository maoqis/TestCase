package com.maoqis.testcase;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceActivity;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public void onBuildHeaders(List<Header> target) {
        //加载选项列表布局
        loadHeadersFromResource(R.xml.main, target);
    }

    /**
     * 验证Preference是否有效
     *
     * @param fragmentName
     * @return
     */
    protected boolean isValidFragment(String fragmentName) {
        return true;
    }

}