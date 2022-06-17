package android.example.binaryconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class binarytodecimal extends AppCompatActivity {
    Button convert;
    EditText d,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binarytodecimal);
        convert = findViewById(R.id.convert);
        d = findViewById(R.id.decimal);
        b = findViewById(R.id.binary);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = Integer.parseInt(b.getText().toString());
                int i=0;
                int ans=0;
                while(value>0)
                {
                    ans+=(value%10)*(1<<i);
                    i++;
                    value/=10;
                }
                d.setText(String.valueOf(ans));
            }
        });
    }
}