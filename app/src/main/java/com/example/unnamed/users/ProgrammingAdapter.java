package com.example.unnamed.users;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



/**
 * Created by Unnamed on 1/16/2018.
 */

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {

    private String[] data;
   // private String[] age;
    //private String[] place;

    public ProgrammingAdapter(String[] data){

        this.data = data;
       // this.age = age;
        //this.place = place;
    }

    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, parent,false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProgrammingViewHolder holder, final int position) {
        final String txtTittle = data[position];
       // final String txtAge = age[position];
       // final  String txtPlace = place[position];
        holder.txtTittle.setText(txtTittle);
        //holder.txtAge.setText(txtAge);
        //holder.txtPlace.setText(txtPlace);


    }

    @Override
    public int getItemCount() {
        return data.length;


    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView txtTittle;
       // TextView txtAge;
       // TextView txtPlace;
        public ProgrammingViewHolder(View itemView){
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            txtTittle = (TextView) itemView.findViewById(R.id.txtTitle);
           // txtAge = (TextView) itemView.findViewById(R.id.txtAge);
            //txtPlace = (TextView) itemView.findViewById(R.id.txtPlace);

        }
    }
}
