package jfh.util.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Util.printNonNull(this, null);
        Util.printNullable(this, null);
        Util.printStringRes(R.string.app_name);
//        Util.printFloatRange((float) 2.0);
//        Util.printIntRange(20);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Util.printUIThread();
//            }
//        }).start();

        Util.setPayVia(PayManager.WECHATPAY);

    }
}
