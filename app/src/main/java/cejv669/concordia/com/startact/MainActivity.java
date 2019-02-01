package cejv669.concordia.com.startact;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.btnGoToScreen2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Main2Activity.class);

                startActivity(i);
            }
        });

        Button b2 = findViewById(R.id.btnGoogle);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));

                startActivity(i);
            }
        });

        Button b3 = findViewById(R.id.btnShow);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText t1 = findViewById(R.id.txtName);
                EditText t2 = findViewById(R.id.txtAge);

                Intent i = new Intent(getApplicationContext(), Main2Activity.class);

                i.putExtra("MyName", t1.getText().toString());

                int Age = Integer.parseInt(t2.getText().toString());

                i.putExtra("MyAge", Age);

                startActivity(i);
            }
        });

    }
}
