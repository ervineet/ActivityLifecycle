package mobileapp.vineet.com.parcelablelearning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bike bike = (Bike) getIntent().getParcelableExtra("bike");
        Log.d("DEMO", bike.getName() + ", " + bike.getCompany());
    }
}
