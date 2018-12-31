package com.example.lzw.jisuanqi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.et_input)
    EditText et_input;
    @BindView(R.id.bt_clr)
    Button bt_clr;
    @BindView(R.id.bt_del)
    Button bt_del;
    @BindView(R.id.bt_div)
    Button bt_div;
    @BindView(R.id.bt_mul)
    Button bt_mul;
    @BindView(R.id.bt_7)
    Button bt_7;
    @BindView(R.id.bt_8)
    Button bt_8;
    @BindView(R.id.bt_9)
    Button bt_9;
    @BindView(R.id.bt_sub)
    Button bt_sub;
    @BindView(R.id.bt_4)
    Button bt_4;
    @BindView(R.id.bt_5)
    Button bt_5;
    @BindView(R.id.bt_6)
    Button bt_6;
    @BindView(R.id.bt_add)
    Button bt_add;
    @BindView(R.id.bt_1)
    Button bt_1;
    @BindView(R.id.bt_2)
    Button bt_2;
    @BindView(R.id.bt_3)
    Button bt_3;
    @BindView(R.id.bt_0)
    Button bt_0;
    @BindView(R.id.bt_pt)
    Button bt_pt;
    @BindView(R.id.bt_eq)
    Button bt_eq;

    private String ss = "";
    private boolean fu = false;
    private boolean num = false;
    private boolean point = false;
    boolean clr_flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
    @OnClick({R.id.bt_clr, R.id.bt_del, R.id.bt_div, R.id.bt_mul,
            R.id.bt_7, R.id.bt_8, R.id.bt_9, R.id.bt_sub,
            R.id.bt_4, R.id.bt_5, R.id.bt_6, R.id.bt_add,
            R.id.bt_1, R.id.bt_2, R.id.bt_3, R.id.bt_0, R.id.bt_pt, R.id.bt_eq})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_clr: {
                ss = "";
                et_input.setText(ss);
            }
            break;
            case R.id.bt_del: {
                if(ss.indexOf(" ") == ss.length() - 3) {
                    ss = ss.substring(0,ss.length() - 2);
                }
                if(ss.length() > 0) {
                    ss = ss.substring(0,ss.length() - 1);
                }
                et_input.setText(ss);
            }
            break;
            case R.id.bt_mul: {
                if(ss.length() == 0) {
                    break;
                }
                if(ss.contains(" ")) {
                    if(ss.indexOf(" ") == ss.length() - 3 || ss.indexOf(" ") == ss.length() - 2 || ss.indexOf(" ") == ss.length() - 1)
                        break;
                    getResult();
                }
                fu = true;
                ss += " × ";
                et_input.setText(ss);
            }
            break;
            case R.id.bt_div:{
                if(ss.length() == 0) {
                    break;
                }
                if(ss.contains(" ")) {
                    if(ss.indexOf(" ") == ss.length() - 3 || ss.indexOf(" ") == ss.length() - 2 || ss.indexOf(" ") == ss.length() - 1)
                        break;
                    getResult();
                }
                fu = true;
                ss += " ÷ ";
                et_input.setText(ss);
            }
            break;
            case R.id.bt_7: {
                if(clr_flag){
                    clr_flag=false;
                    ss ="";
                    et_input.setText("");
                }
                ss += "7";
                et_input.setText(ss);
            }
            break;
            case R.id.bt_8: {
                if(clr_flag){
                    clr_flag=false;
                    ss ="";
                    et_input.setText("");
                }
                ss += "8";
                et_input.setText(ss);
            }
            break;
            case R.id.bt_9: {
                if(clr_flag){
                    clr_flag=false;
                    ss ="";
                    et_input.setText("");
                }
                ss += "9";
                et_input.setText(ss);
            }
            break;
            case R.id.bt_sub: {
                if(ss.length() == 0) {
                    break;
                }
                if(ss.contains(" ")) {
                    if(ss.indexOf(" ") == ss.length() - 3 || ss.indexOf(" ") == ss.length() - 2 || ss.indexOf(" ") == ss.length() - 1)
                        break;
                    getResult();
                }
                fu=true;
                ss += " － ";
                et_input.setText(ss);
            }
            break;
            case R.id.bt_4: {
                if(clr_flag){
                    clr_flag=false;
                    ss ="";
                    et_input.setText("");
                }
                ss += "4";
                et_input.setText(ss);
            }
            break;
            case R.id.bt_5: {
                if(clr_flag){
                    clr_flag=false;
                    ss ="";
                    et_input.setText("");
                }
                ss += "5";
                et_input.setText(ss);
            }
            break;
            case R.id.bt_6: {
                if(clr_flag){
                    clr_flag=false;
                    ss ="";
                    et_input.setText("");
                }
                ss += "6";
                et_input.setText(ss);
            }
            break;
            case R.id.bt_add: {
                if(ss.length() == 0) {
                    break;
                }
                if(ss.contains(" ")) {
                    if(ss.indexOf(" ") == ss.length() - 3 || ss.indexOf(" ") == ss.length() - 2 || ss.indexOf(" ") == ss.length() - 1)
                        break;
                    getResult();
                }
                fu=true;
                ss += " ＋ ";
                et_input.setText(ss);
            }
            break;
            case R.id.bt_1: {
                if(clr_flag){
                    clr_flag=false;
                    ss ="";
                    et_input.setText("");
                }
                ss += "1";
                et_input.setText(ss);
            }
            break;
            case R.id.bt_2: {
                if(clr_flag){
                    clr_flag=false;
                    ss ="";
                    et_input.setText("");
                }
                ss += "2";
                et_input.setText(ss);
            }
            break;
            case R.id.bt_3: {
                if(clr_flag){
                    clr_flag=false;
                    ss ="";
                    et_input.setText("");
                }
                ss += "3";
                et_input.setText(ss);
            }
            break;
            case R.id.bt_0: {
                if(clr_flag){
                    clr_flag=false;
                    ss ="";
                    et_input.setText("");
                }
                ss += "0";
                et_input.setText(ss);
            }
            break;
            case R.id.bt_pt: {
                if(clr_flag){
                    clr_flag=false;
                    ss ="";
                    et_input.setText("");
                }
                if(ss.length() == 0 || ss.indexOf(" ") == ss.length() - 3 || ss.lastIndexOf(".") > ss.indexOf(" ")) {
                    break;
                }
                else {
                    ss += ".";
                    et_input.setText(ss);
                }
            }
            break;
            case R.id.bt_eq:
                getResult();
                break;
        }
    }
    private void getResult() {
        double result = 0;
        if(clr_flag){
            clr_flag=false;
            return;
        }
        clr_flag=true;
        if(ss == null || ss.equals(""))
            return ;
        if(!ss.contains(" "))
            return ;
        String s1 = ss.substring(0,ss.indexOf(" "));
        String op = ss.substring(ss.indexOf(" ") + 1,ss.indexOf(" ") + 2);
        String s2 = ss.substring(ss.indexOf(" ") + 3);
        if(!s1.equals("") && !s2.equals("")) {
            double d1 = Double.parseDouble(s1);
            double d2 = Double.parseDouble(s2 );
            switch (op) {
                case "＋": result = d1 + d2;
                break;
                case "－": result = d1 - d2;
                break;
                case "×": result = d1 * d2;
                break;
                case "÷": {
                    if(d2 == 0) {
                        Toast.makeText(this, "ERROR!!!!!!!!!!!!!!!", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    result = d1 / d2 * 1.0;
                }
                break;
            }
            int r = (int)result;
            if(r == result) {
                et_input.setText("" + r);
                ss = "" + r;
            }
            else {
                et_input.setText(result + "");
                ss = "" + result;
            }
        }

    }
}