package com.outerspace.daggermuffin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.outerspace.daggermuffin.component.DaggerMuffinComponent;
import com.outerspace.daggermuffin.component.MuffinComponent;
import com.outerspace.daggermuffin.model.MuffinPojo;
import com.outerspace.daggermuffin.module.MuffinModule;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    MuffinComponent component;

    @Inject
    MuffinPojo muffin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        component = DaggerMuffinComponent.builder().muffinModule(new MuffinModule()).build();
    }


    @Override
    protected void onStart() {
        super.onStart();

        component.inject(this);

        TextView text = (TextView) findViewById(R.id.txt_component);
        text.setText(muffin.muffinFlavor);
    }

    public void onClickMainActivity(View view) {
        super.onBackPressed();
    }

}
