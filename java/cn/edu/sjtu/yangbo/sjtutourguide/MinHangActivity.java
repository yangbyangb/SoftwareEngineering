package cn.edu.sjtu.yangbo.sjtutourguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MinHangActivity extends AppCompatActivity {
    private Button route1;
    private Button route2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_hang);

        route1 = (Button) findViewById(R.id.route1);
        route1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MinHangActivity.this;
                Class destinationActivity = MapsMinHangActivity.class;
                Intent startChildActivityIntent = new Intent(context, destinationActivity);
                startActivity(startChildActivityIntent);
            }
        });
        route2 = (Button) findViewById(R.id.route2);
        route2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MinHangActivity.this;
                Class destinationActivity = MapsMinHang2Activity.class;
                Intent startChildActivityIntent = new Intent(context, destinationActivity);
                startActivity(startChildActivityIntent);
            }
        });
    }
}
