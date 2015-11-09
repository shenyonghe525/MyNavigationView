package com.nav.syh.yongheshen.mynavigationview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews()
    {
        MyNavigationBar myNavigationBar = (MyNavigationBar) findViewById(R.id.uinavigationView);
        MyNavigationBar.NavigationBarListener navigationBarListener = new MyNavigationBar.NavigationBarListener()
        {
            @Override
            public void OnNavigationButtonClick(int which)
            {
                if (which == MyNavigationBar.LEFT_BTN)
                {
                    Toast.makeText(MainActivity.this, "left", Toast.LENGTH_SHORT).show();
                } else
                {
                    Toast.makeText(MainActivity.this, "right", Toast.LENGTH_SHORT).show();
                }
            }
        };
        myNavigationBar.setNavigationBarListener(navigationBarListener);
    }

}
