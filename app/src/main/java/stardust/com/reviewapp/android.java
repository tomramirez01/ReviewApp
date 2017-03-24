package stardust.com.reviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class android extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
    }


    public void exploreClicked(View v)
    {
        Button button = (Button) v;
        ((Button) v) .setText("clicked");

    }

}

