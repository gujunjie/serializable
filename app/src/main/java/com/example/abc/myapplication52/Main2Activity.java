package com.example.abc.myapplication52;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.tv_showMessage)
    TextView tvShowMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);


        StringBuilder stringBuilder = new StringBuilder();

        Intent intent = getIntent();
        Person person = (Person) intent.getSerializableExtra("person");
        stringBuilder.append("person:").append(person.getName()).append(person.getAge()).append(person.getWeight()).append(person.getSex());

        User user = (User) intent.getParcelableExtra("user");
        stringBuilder.append("\n").append("user:").append(user.getName()).append(user.getAge()).append(user.getWeight()).append(user.getSex());

        tvShowMessage.setText(stringBuilder);
    }
}
