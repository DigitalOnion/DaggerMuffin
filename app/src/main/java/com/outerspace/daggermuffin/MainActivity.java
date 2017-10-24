package com.outerspace.daggermuffin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


import com.outerspace.daggermuffin.component.DaggerMuffinComponent;
import com.outerspace.daggermuffin.component.MuffinComponent;
import com.outerspace.daggermuffin.model.Muffin;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    MuffinComponent component;

    @Inject
    Muffin muffin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerMuffinComponent.builder().build();
    }



    @Override
    protected void onStart() {
        super.onStart();

        component.inject(this);

        muffin.muffinFlavor = "Chocolate";

        TextView text = (TextView) findViewById(R.id.txt_component);
        text.setText(muffin.muffinFlavor);
    }

    public void onClickSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        startActivity(intent);
    }

}
