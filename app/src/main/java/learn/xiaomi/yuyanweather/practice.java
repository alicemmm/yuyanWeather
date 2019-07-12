package learn.xiaomi.yuyanweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class practice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice);

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();

    }
}
