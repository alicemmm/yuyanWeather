package learn.xiaomi.yuyanweather;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Stack;

public class MainActivity extends Activity {

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
    private Button mButtonLeftBranket;
    private Button mButtonRightBranket;
    private Button getmButtonDelList;
    private View.OnClickListener mButtonClickListener;
    private TextView textView = null;
    boolean clear_flag;
    private Button mButtonRecycler;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.input_message);

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
        mButtonLeftBranket = findViewById(R.id.left_bracket );
        mButtonRightBranket = findViewById(R.id.right_bracket);
        getmButtonDelList = findViewById(R.id.delete_list);

        mButtonRecycler = findViewById(R.id.recycler);



        mButtonClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = textView.getText().toString();
                switch (view.getId()){
                    case R.id.button0:
                    case R.id.button1:
                    case R.id.button2:
                    case R.id.button3:
                    case R.id.button4:
                    case R.id.button5:
                    case R.id.button6:
                    case R.id.button7:
                    case R.id.button8:
                    case R.id.button9:

                        if (clear_flag){
                            clear_flag = false;
                            textView.setText("");
                        }
                        textView.setText(input + ((Button)view).getText());
                        break;

                    case R.id.button_minus:
                    case R.id.button_multiply:
                    case R.id.button_plus:
                    case R.id.button_divide:

                        if (clear_flag){
                            clear_flag = false;
                            input = "";
                            textView.setText("");
                        }
                        textView.setText(input + "" + ((Button)view).getText() + "");
                        break;


                    case R.id.button_del:
                        if(clear_flag){
                            clear_flag = false;
                            input = "";
                            textView.setText("");
                        }else if(input != null || !input.equals("")) {
                            if(input.length()<2){
                                textView.setText(null);
                            }else{
                                textView.setText(input.substring(0, input.length() - 1));
                            }
                        }
                        break;

                    case R.id.button_equal:
                        textView.setText(getResult() + "");
                        break;

                    case R.id.button_point:
                        if(clear_flag){
                            clear_flag = false;
                            textView.setText("");
                        }
                        textView.setText(input + ((Button)view).getText());
                        break;

                    case R.id.button_reset:
                        clear_flag = false;
                        input = "";
                        textView.setText("");
                        break;

                    case R.id.left_bracket:
                        textView.setText(input + ((Button)view).getText() );
                        break;

                    case R.id.right_bracket:
                        if (clear_flag){
                            clear_flag = false;
                            textView.setText("");
                        }
                        textView.setText(input + ((Button)view).getText());
                        break;

                    case R.id.delete_list:
                        Intent intent = new Intent(MainActivity.this, DelListActivity.class);
                        startActivity(intent);

                    case R.id.recycler:
                        double[] arr = {89.2,32.3,54.5,65.7,76.3,45.0};
                        Student student = new Student("zhangsan",18, arr);
                        Intent intent1 = new Intent(MainActivity.this,DelListActivity.class);
//                        intent1.putExtra("name","xiaomi");
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("student",student);
                        intent1.putExtras(bundle);
                        startActivity(intent1);
//                        Teacher teacher = new Teacher("zhang",30);
//                        Teacher teacher1 = new Teacher("wang",40);
//                        Teacher teacher2 = new Teacher("li",35);
//                        Intent intent1 = new Intent(MainActivity.this,DelListActivity.class);
//                        Bundle bundle = new Bundle();
//                        bundle.putSerializable("teacher",teacher);
//                        bundle.putSerializable("teacher1",teacher1);
//                        bundle.putSerializable("teacher2",teacher2);
//                        intent1.putExtras(bundle);
//                        startActivity(intent1);


                }
            }
        };


        mButtonZero.setOnClickListener(mButtonClickListener);
        mButtonOne.setOnClickListener(mButtonClickListener);
        mButtonTwo.setOnClickListener(mButtonClickListener);
        mButtonThree.setOnClickListener(mButtonClickListener);
        mButtonFour.setOnClickListener(mButtonClickListener);
        mButtonFive.setOnClickListener(mButtonClickListener);
        mButtonSix.setOnClickListener(mButtonClickListener);
        mButtonSeven.setOnClickListener(mButtonClickListener);
        mButtonEight.setOnClickListener(mButtonClickListener);
        mButtonNine.setOnClickListener(mButtonClickListener);
        mButtonDel.setOnClickListener(mButtonClickListener);
        mButtonPlus.setOnClickListener(mButtonClickListener);
        mButtonMinus.setOnClickListener(mButtonClickListener);
        mButtonMultiply.setOnClickListener(mButtonClickListener);
        mButtondivide.setOnClickListener(mButtonClickListener);
        mButtonPoint.setOnClickListener(mButtonClickListener);
        mButtonReset.setOnClickListener(mButtonClickListener);
        mButtonEqual.setOnClickListener(mButtonClickListener);
        mButtonLeftBranket.setOnClickListener(mButtonClickListener);
        mButtonRightBranket.setOnClickListener(mButtonClickListener);
        getmButtonDelList.setOnClickListener(mButtonClickListener);
        mButtonRecycler.setOnClickListener(mButtonClickListener);

    }

    private Double getResult() {
        String cal = textView.getText().toString();
        int length = cal.length();
        //存放需要处理的字符串
        StringBuffer newcal = new StringBuffer();

        //处理字符串

            for (int i = 0; i < length; i++) {

                    char ch = cal.charAt(i);
                    if (ch == '+') {
                        newcal.append(' ');
                        newcal.append('+');
                        newcal.append(' ');
                    } else if (ch == '-') {
                        newcal.append(' ');
                        newcal.append('-');
                        newcal.append(' ');
                    } else if (ch == '*') {
                        newcal.append(' ');
                        newcal.append('*');
                        newcal.append(' ');
                    } else if (ch == '/') {
                        newcal.append(' ');
                        newcal.append('/');
                        newcal.append(' ');
                    }
                    else if (ch =='('){
                        newcal.append(' ');
                        newcal.append('(');
                        newcal.append(' ');
                    }else if (ch ==')'){
                        newcal.append(' ');
                        newcal.append(')');
                        newcal.append(' ');
                    }
                    else {
                        newcal.append(ch);
                    }

                }


        String[] arr = newcal.toString().split("\\s+");  // 这里使用空格分割字符串
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]);}

        ArrayList arraylist = InfixToPostfix(arr);

        return ValueOfPostfix(arraylist);

    }

    //    中缀转后缀
    public ArrayList InfixToPostfix(String[] arr){
        int len = arr.length;

        Stack<String> m = new Stack<String>();

        ArrayList<String> arrayList = new ArrayList<String>();

        int k = 0;

        for ( ; k < len ; k++){
            if (arr[k].equals("(")){
                m.push(arr[k]);
                continue;
            }else if (arr[k].equals(")")){
                while (!m.empty() && !m.peek().equals("(") ){
                    arrayList.add(m.pop());
                }
                m.pop();
            }else if (!arr[k].equals("+") && !arr[k].equals("-") && !arr[k].equals("*") && !arr[k].equals("/") && !arr[k].equals("(")&&!arr[k].equals(")")){
                arrayList.add(arr[k]);
            }else {
                switch (arr[k]){
                    case "*":
                    case "/":
                        while (m.size() != 0) {
                            String tr = m.pop();
                            if (tr.equals("*") || tr.equals("/")) {
                                arrayList.add(tr);
                            } else {
                                m.push(tr);
                                break;
                            }
                        }
                        m.push(arr[k]);
                        break;
                    case "+":
                    case "-":
                        while (m.size() != 0) {
                            String tr = m.pop();
                            if (tr.equals("+") || tr.equals("-")) {
                                arrayList.add(tr);
                            } else {
                                m.push(tr);
                                break;
                            }
                        }
                        m.push(arr[k]);
                        break;
                }
            }
        }
        while (m.size() != 0) {
            arrayList.add(m.pop());
        }
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        return arrayList;

    }

    public double ValueOfPostfix(ArrayList arrayList){
        // 根据后缀表达式，计算结果

        Stack<String> stack = new Stack<>();

        for (int i = 0;i < arrayList.size();i++) {
            String ch = (String) arrayList.get(i);

            if (ch.equals("+") ) {
                if (stack.size() >= 2) {
                    double t1 = Double.valueOf(stack.pop());
                    double t2 = Double.valueOf(stack.pop());
                    double t3 = t1 + t2;
                    stack.push(String.valueOf(t3));
                }
            } else if (ch.equals("*")) {
                if (stack.size() >= 2) {
                    double t1 = Double.valueOf(stack.pop());
                    double t2 = Double.valueOf(stack.pop());
                    double t3 = t1 * t2;
                    stack.push(String.valueOf(t3));
                }
            } else if (ch.equals( "-")){
                if (stack.size() >= 2){
                    double t1 = Double.valueOf(stack.pop());
                    double t2 = Double.valueOf(stack.pop());
                    double t3 = t2 - t1;
                    stack.push(String.valueOf(t3));
                }
            }else if (ch.equals("/")){
                if (stack.size() >= 2){
                    double t1 = Double.valueOf(stack.pop());
                    double t2 = Double.valueOf(stack.pop());
                    if ( t1 == 0){
                        return 0.0;
                    }else {
                        double t3 = t2 / t1;
                        stack.push(String.valueOf(t3));
                    }
                }
            }else {
                stack.add(ch);
            }
        }

        return Double.valueOf(stack.pop());
    }

}

