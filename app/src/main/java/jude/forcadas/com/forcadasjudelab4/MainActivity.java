package jude.forcadas.com.forcadasjudelab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.design.widget.Snackbar;

public class MainActivity extends AppCompatActivity {

    protected Button BackButton;
    protected Button NextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BackButton = findViewById(R.id.BackButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You can't go back now!", Toast.LENGTH_SHORT).show();
            }
        });

        NextButton = findViewById(R.id.NextButton);
        NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Oops! Excited for more?", Snackbar.LENGTH_LONG).show();
            }
        });
    }


    public void onStart(){
        super.onStart();
        Log.d("EVENT:", "onStart() WAS USED");
    }

    public void onResume(){
        super.onResume();
        Log.d("EVENT:", "onResume() WAS USED");
    }

    public void onPause(){
        super.onPause();
        Log.d("EVENT:", "onPause() WAS USED");
    }

    public void onRestart(){
        super.onRestart();
        Log.d("EVENT:", "onRestart WAS USED");
    }

    public void onStop(){
        super.onStop();
        Log.d("EVENT:", "onStop HAS WAS USED");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.d("EVENT:", "onDestroy WAS USED");
    }
}
