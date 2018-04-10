package com.gannouni.nizar.formationandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListeDelegationsActivity extends AppCompatActivity {
    private ArrayList<Delegation> listeDelegations;
    private RecyclerView myListe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_delegations);
        Intent intent = getIntent();
        listeDelegations = (ArrayList<Delegation>) intent.getSerializableExtra("liste");
        if(listeDelegations.size()>0){
           /*
            for(Delegation delegation : listeDelegations){
                System.out.println(delegation.toString());
            }
            */
            DelegationAdaptateur delegationAdaptateur = new DelegationAdaptateur(listeDelegations);
            RecyclerView.LayoutManager layout = new LinearLayoutManager(this);
            myListe = findViewById(R.id.liste);
            myListe.setLayoutManager(layout);
            myListe.setAdapter(delegationAdaptateur);

        }
    }
}
