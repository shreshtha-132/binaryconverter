package android.example.binaryconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class deciamltobinary extends AppCompatActivity {
    EditText d,b;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deciamltobinary);
        convert = findViewById(R.id.convert);
        d = findViewById(R.id.decimal);
        b = findViewById(R.id.binary);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value;
                value = Integer.parseInt(d.getText().toString());
                String ans="";
                while(value>0)
                {
                    ans = String.valueOf(value%2)+ans;
                    value/=2;
                }
                b.setText(Integer.parseInt(ans));
            }
        });
    }
}