package com.outerspace.daggermuffin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.outerspace.daggermuffin.component.DaggerMuffingWithToppingComponent;
import com.outerspace.daggermuffin.component.MuffingWithToppingComponent;
import com.outerspace.daggermuffin.model.Muffin;
import com.outerspace.daggermuffin.model.MuffinWithTopping;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    MuffingWithToppingComponent component;

    @Inject
    MuffinWithTopping muffin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        component = DaggerMuffingWithToppingComponent.builder().build();
    }


    @Override
    protected void onStart() {
        super.onStart();

        component.inject(this);

        muffin.muffinFlavor = "fresa";
        muffin.muffinTopping = "vainilla";

        TextView text;
        text = (TextView) findViewById(R.id.txt_component);
        text.setText(muffin.muffinFlavor);
        text = (TextView) findViewById(R.id.txt_subcomponent_main);
        text.setText(muffin.muffinTopping);
    }

    public void onClickMainActivity(View view) {
        super.onBackPressed();
    }

}
