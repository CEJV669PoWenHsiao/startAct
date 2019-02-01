package cejv669.concordia.com.startact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        String chosenName = intent.getStringExtra("MyName");
        int chosenAge = intent.getIntExtra("MyAge", 0);

        TextView tvName = findViewById(R.id.lblResutName);
        TextView tvAge = findViewById(R.id.lblResutAge);


        tvName.setText(chosenName);
        //tvAge.setText(chosenAge);

    }
}
