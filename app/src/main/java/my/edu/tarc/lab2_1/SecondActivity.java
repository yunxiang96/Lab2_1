package my.edu.tarc.lab2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
  private TextView textViewMessage;
    private TextView textViewName;
    private TextView textViewAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //Link code to UI
        textViewMessage = (TextView) findViewById(R.id.textViewMessage);
        textViewAge=(TextView) findViewById(R.id.textViewAge);
        textViewName =(TextView) findViewById(R.id.textViewName);



            Bundle extras = getIntent().getExtras();
            if (!extras.isEmpty()) {
                String name= extras.getString(MainActivity.MSG_NAME);
                String message = extras.getString(MainActivity.MSG_EXTRA);
                Integer age= extras.getInt(MainActivity.MSG_AGE);
                textViewMessage.setText(message);
                textViewName.setText(name);
                textViewAge.setText("Age =" + age);
            }


    }
}
