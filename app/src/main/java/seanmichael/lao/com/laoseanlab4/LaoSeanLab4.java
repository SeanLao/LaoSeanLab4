package seanmichael.lao.com.laoseanlab4;


import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class LaoSeanLab4 extends AppCompatActivity {
    Button txtbtn,tost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lao_sean_lab4);
        Log.d("LaoSeanLab4", "Inside OnCreate was called ");
        Log.i("LaoSeanLab4", "OnResume was called");
        Log.e("LaoSeanLab4", "OnRestart was called");
        Log.w("LaoSeanLab4", "OnPause was called");
        txtbtn = (Button) findViewById(R.id.button2);
        tost = (Button) findViewById(R.id.button);

        tost.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This is Toast", Toast.LENGTH_LONG).show();

            }
        });

        txtbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(txtbtn, "This is Snackbar", Snackbar.LENGTH_LONG);
                snackbar.show();

            }
        });




    };
}





