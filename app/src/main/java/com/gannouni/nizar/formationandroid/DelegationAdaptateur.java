package com.gannouni.nizar.formationandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nizar on 01/04/2018.
 */

public class DelegationAdaptateur extends RecyclerView.Adapter<DelegationAdaptateur.HolderDelegation>{
    private ArrayList<Delegation> myDelegations;
    public DelegationAdaptateur(ArrayList<Delegation> delegations) {
        myDelegations = delegations;
    }

    @Override
    public HolderDelegation onCreateViewHolder(ViewGroup parent, int viewType) {
        Context  context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.afficher_une_delegation,parent,false);
        HolderDelegation holderDelegation = new HolderDelegation(view);
        return holderDelegation;
    }
    @Override
    public void onBindViewHolder(HolderDelegation holder, int position) {
        holder.delegationName.setText(myDelegations.get(position).getNom());
        holder.delegationAdr.setText(myDelegations.get(position).getAdresse());
        holder.delegationPhone.setText(""+myDelegations.get(position).getPhone());

    }
    @Override
    public int getItemCount() {
        return myDelegations.size();
    }
    class  HolderDelegation extends RecyclerView.ViewHolder{
        private TextView delegationName;
        private TextView delegationAdr;
        private TextView delegationPhone;
        public HolderDelegation(View view) {
            super(view);
            delegationName = view.findViewById(R.id.delegationName);
            delegationAdr = view.findViewById(R.id.delegationAdr);
            delegationPhone = view.findViewById(R.id.delegationPhone);
        }
    }
}



