package my.edu.tarc.lab2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextMessage;
    private EditText editTextName;
    private EditText editTextAge;



    public static String MSG_EXTRA = "MSG";
    public static String MSG_NAME="NAME";
    public static String MSG_AGE="AGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMessage=(EditText)findViewById(R.id.editTextMessage);
        editTextName=(EditText)findViewById(R.id.editTextName);
        editTextAge=(EditText)findViewById(R.id.editTextAge);


    }
    public void sendMessage(View view){
        String message;
        String name;
        int age;

        name=editTextName.getText().toString();
        message= editTextMessage.getText().toString();
        age=Integer.parseInt(editTextAge.getText().toString());

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra(MSG_NAME,name);
        intent.putExtra(MSG_EXTRA,message);
        intent.putExtra(MSG_AGE,age);
        startActivity(intent);
    }



}
