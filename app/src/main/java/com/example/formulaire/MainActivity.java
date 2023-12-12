package com.example.formulaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText zone1, zone2;
    RadioGroup group;
    CheckBox cb1, cb2;
    Button btn;

    ListView myListView;

    List<Etudiant> lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* myListView = (ListView)findViewById(R.id.lv);
        lst = new ArrayList<>();

        lst.add(new Etudiant("Trabelsi", "Fedi", "Male", "Hackathon"));
        lst.add(new Etudiant("Faleh", "Rayen", "Male", "Hackathon"));
        lst.add(new Etudiant("Ben Mabrouk", "Malak", "Female", "Certification"));

        myListView.setAdapter(new MyAdapter(lst,  MainActivity.this));*/

        zone1 = (EditText)findViewById(R.id.n);
        zone2 = (EditText)findViewById(R.id.p);
        group = (RadioGroup)findViewById(R.id.rg);
        cb1 = (CheckBox)findViewById(R.id.cb1);
        cb2 = (CheckBox)findViewById(R.id.cb2);
        btn = (Button)findViewById(R.id.b);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom = zone1.getText().toString();
                String prenom = zone2.getText().toString();
                String type ="";
                if(cb1.isChecked() && cb2.isChecked()){
                    type = cb1.getText().toString() + " and " + cb2.getText().toString();
                }
                else if (cb1.isChecked()){
                    type = cb1.getText().toString();
                }
                else{
                    type = cb2.getText().toString();
                }

                int id = group.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(id);
                String rbValue = rb.getText().toString();

                String msg = rbValue +": " + nom +' '+ prenom +" selected "+ type;

                //Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

                Etudiant etudiant = new Etudiant(nom,prenom,rbValue, type);

                Intent i = new Intent(MainActivity.this,DisplayActivity.class );
                i.putExtra("et", (Serializable) etudiant);
                startActivity(i);
            }

        });
    }
}