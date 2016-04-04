package yunjingl.cmu.edu.drwaker.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import yunjingl.cmu.edu.drwaker.R;

public class MathActivity extends AppCompatActivity {
    private final String question="3+9=";
    private EditText answer;
    private String mathAnswer;
    private TextView topLine, mathQuestion;
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        topLine=(TextView)findViewById(R.id.textView);
        mathQuestion=(TextView)findViewById(R.id.textView);
        mathQuestion.setText(question);
        mathAnswer=answer.getText().toString();

    }

    public void finishEnter(){
        result=Integer.parseInt(mathAnswer);
        if(result==12){
            //pass;
        }
        else{
            AlertDialog.Builder builder=new AlertDialog.Builder(MathActivity.this);
            builder.setTitle("Attention");
            builder.setMessage("Your answer didn't pass the detection, Please try again! ");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialog, int which) {

                }
            }).create();//创建Dialog
            builder.show();
        }
    }

}
