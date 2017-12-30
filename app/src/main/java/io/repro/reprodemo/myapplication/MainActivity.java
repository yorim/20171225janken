package io.repro.reprodemo.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //起動時にデータをクリアする
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        editor.commit();
    }
    public void onJankenButtonTapped(View view){
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("MY_HAND",view.getId());
        startActivity(intent);
    }
}
