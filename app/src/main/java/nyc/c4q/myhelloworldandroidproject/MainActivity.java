package nyc.c4q.myhelloworldandroidproject;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Running code in onCreate method!");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "Running code in onStart method!");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "Running code in onResume method!");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "Running code in onPause method!");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "Running code in onDestroy method!");
    }
}
