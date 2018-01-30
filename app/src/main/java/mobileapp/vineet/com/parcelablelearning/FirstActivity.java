package mobileapp.vineet.com.parcelablelearning;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void onClickCallSecondActivity(View view) {

        Bike bike = new Bike();
        bike.setName("FZ 25");
        bike.setCompany("Yamaha");
        bike.setColor("Black");

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("bike", bike);
        startActivity(intent);

    }
}
