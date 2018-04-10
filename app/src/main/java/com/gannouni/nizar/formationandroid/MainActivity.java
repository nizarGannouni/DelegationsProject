package com.gannouni.nizar.formationandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Gouvernorat myGouvernorat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myGouvernorat = new Gouvernorat("Zaghouan");
        myGouvernorat.setDescription(getResources().getString(R.string.description));
        TextView txt1 = (TextView)findViewById(R.id.txt1);
        txt1.setText(myGouvernorat.getDescription());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.add){
            Intent intent = new Intent(MainActivity.this, AddDelegationActivity.class);

            startActivityForResult(intent,100);
        }
        else if(item.getItemId()==R.id.all){
            Intent intent = new Intent(MainActivity.this,ListeDelegationsActivity.class);
            intent.putExtra("liste", myGouvernorat.getListeDelegetaions());
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if( resultCode==AddDelegationActivity.RESULT_OK && requestCode == 100){

            Delegation delegation = (Delegation) data.getSerializableExtra("delegation");
            myGouvernorat.getListeDelegetaions().add(delegation);


        }
    }
}

