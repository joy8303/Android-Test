package com.ehappy.exbutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;



public class MainActivity extends Activity {
    private Button btnDo ,btn;
    private TextView txtCount,  editTextToclear;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDo = (Button)findViewById(R.id.button1);
        btn = (Button)findViewById(R.id.button2);
        txtCount = (TextView)findViewById(R.id.textView1);
        editTextToclear = (TextView)findViewById(R.id.textView1);
        btnDo.setOnClickListener(btnDoListener);
        btn.setOnClickListener( btnListener );

    }
    private Button.OnClickListener btnListener = new Button.OnClickListener() {
        public void onClick(View v) {
            count=0;
            editTextToclear.setText(String.valueOf(count));


        }
    };
    private Button.OnClickListener btnDoListener = new Button.OnClickListener() {
        @Override
        public void onClick(View arg0) {
            count++;
            txtCount.setText(String.valueOf(count));

        }


    };     //自訂方法結尾要加分號

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
