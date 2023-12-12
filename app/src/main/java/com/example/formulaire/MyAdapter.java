package com.example.formulaire;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private List<Etudiant> lst;
    private LayoutInflater layInf;
    private Context c;

    public MyAdapter(List<Etudiant> lst, Context c) {
        this.lst = lst;
        this.layInf = LayoutInflater.from(c);
        this.c = c;
    }

    @Override
    public int getCount() {
        return lst.size();
    }

    @Override
    public Object getItem(int position) {
        return lst.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       convertView = layInf.inflate(R.layout.row_display, null);
        TextView genre = convertView.findViewById(R.id.textView1);
        TextView nom = convertView.findViewById(R.id.textView2);
        TextView prenom = convertView.findViewById(R.id.textView3);
        TextView choix = convertView.findViewById(R.id.textView6);
        Etudiant e = lst.get(position);
        genre.setText(e.getGenre());
        nom.setText(e.getNom());
        prenom.setText(e.getPrenom());
        choix.setText(e.getChoix());
        return convertView;
    }
}
