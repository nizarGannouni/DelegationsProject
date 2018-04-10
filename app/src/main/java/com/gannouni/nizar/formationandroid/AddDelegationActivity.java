package com.gannouni.nizar.formationandroid;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class AddDelegationActivity extends AppCompatActivity {
private EditText intitule;
private EditText adresse;
private EditText phone;
private Button btnValide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_delegation);

        intitule = findViewById(R.id.delegationName);
        adresse = findViewById(R.id.delegationAdresse);
        phone = findViewById(R.id.delegationPhone);
        btnValide=findViewById(R.id.valideBtn);
        btnValide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Delegation delegation = new Delegation(intitule.getText().toString(),adresse.getText().toString(),Integer.valueOf(phone.getText().toString()));
               //System.out.println(delegation.toString());
               //Toast.makeText(AddDelegationActivity.this , delegation.toString() , Toast.LENGTH_LONG ).show();
                Intent intent = new Intent();
                intent.putExtra("delegation", delegation);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

}
