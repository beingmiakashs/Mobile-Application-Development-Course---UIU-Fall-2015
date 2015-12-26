package com.omeletlab.sa.classpreferences;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences preference;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preference = PreferenceManager.getDefaultSharedPreferences(this);
        editor = preference.edit();

        editor.putString("username", "omelet");
        editor.putBoolean("isLogin", true);
        editor.commit();


        Boolean isLogin = preference.getBoolean("isLogin", false);
        String username = preference.getString("Username", "not login");


        Log.d("test debug", username + " " + isLogin);

    }
}
