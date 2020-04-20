package br.com.mariojp.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickCumprimentar(View v){
        EditText name = findViewById(R.id.editNome);
        TextView lab = findViewById(R.id.labelMensagem);

        if (name.getText().equals("")){
            return;
        }
        lab.setText("Alô, "+name.getText()+"!");
    }

}
