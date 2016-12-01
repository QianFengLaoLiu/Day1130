package com.qianfeng.day1130;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MineActivity extends AppCompatActivity {

    private ImageView ivHead;

    private TextView tvName;

    public static final int REQUEST_CODE = 3;

    public static final String TAG_HEAD = "login_head";

    public static final String TAG_NAME = "login_name";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);

        ivHead = (ImageView) findViewById(R.id.mine_login_head_iv);
        tvName = (TextView) findViewById(R.id.mine_login_name_tv);

        ivHead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MineActivity.this, LoginActivity.class);
                startActivity(intent);

                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK)
        {
            String name = data.getStringExtra(TAG_NAME);
            String headUrl = data.getStringExtra(TAG_HEAD);


        }

    }
}
