package com.example.abc.myapplication52;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_tiaozhuan)
    public void onViewClicked() {

        Person person=new Person("join",23,45,"boy");
        User user=new User("marry",24,56,"girl");
        Intent intent=new Intent(this,Main2Activity.class);
        intent.putExtra("person",person);
        intent.putExtra("user",user);
        startActivity(intent);

    }
}
