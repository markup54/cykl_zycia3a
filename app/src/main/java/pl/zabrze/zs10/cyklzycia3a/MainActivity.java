package pl.zabrze.zs10.cyklzycia3a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button;
TextView textView;
int liczba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("CYKL ŻYCIA","uruchomiona metoda onCreate");
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textViewLiczba);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        liczba = (int)(Math.random()*100+1);
                        textView.setText(String.valueOf(liczba));
                    }
                }
        );
    }

    @Override
    protected void onStart() {
        super.onStart();
        //metody cyklu życia nie powinny być wywoływane przez programistę
        Log.i("CYKL ŻYCIA","wykonana metoda onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CYKL ŻYCIA","wykonana metoda onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CYKL ŻYCIA","wykonana metoda onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CYKL ŻYCIA","wykonana metoda onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CYKL ŻYCIA","wykonana metoda onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CYKL ŻYCIA","wykonana metoda onPause");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("CYKL ŻYCIA","wykonana metoda onSaveInstanceState");
    }
}