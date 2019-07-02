package learn.xiaomi.yuyanweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Button mButtonZero;
    private Button mButtonOne;
    private Button mButtonTwo;
    private Button mButtonThree;
    private Button mButtonFour;
    private Button mButtonFive;
    private Button mButtonSix;
    private Button mButtonSeven;
    private Button mButtonEight;
    private Button mButtonNine;
    private Button mButtonDel;
    private Button mButtonPlus;
    private Button mButtonMinus;
    private Button mButtonMultiply;
    private Button mButtondivide;
    private Button mButtonPoint;
    private Button mButtonReset;
    private Button mButtonEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonZero = findViewById(R.id.button0);
        mButtonOne = findViewById(R.id.button1);
        mButtonTwo = findViewById(R.id.button2);
        mButtonThree = findViewById(R.id.button3);
        mButtonFour = findViewById(R.id.button4);
        mButtonFive = findViewById(R.id.button5);
        mButtonSix = findViewById(R.id.button6);
        mButtonSeven = findViewById(R.id.button7);
        mButtonEight = findViewById(R.id.button8);
        mButtonNine = findViewById(R.id.button9);
        mButtonDel = findViewById(R.id.button_del);
        mButtonPlus = findViewById(R.id.button_plus);
        mButtonMinus = findViewById(R.id.button_minus);
        mButtonMultiply = findViewById(R.id.button_multiply);
        mButtondivide = findViewById(R.id.button_divide);
        mButtonPoint = findViewById(R.id.button_point);
        mButtonReset = findViewById(R.id.button_reset);
        mButtonEqual = findViewById(R.id.button_equal);

    }
}
