package com.willpowered.ragnarrally;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreateTeamActivity extends AppCompatActivity {

    private FirebaseDatabase database;
    private DatabaseReference myRef;
    private Button button_create_team;
    private EditText team_name;
    private Team team1;
    //private List

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_team);

        database = FirebaseDatabase.getInstance();

        button_create_team = (Button) findViewById(R.id.button_check_team_name);
        button_create_team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_name = (EditText) findViewById(R.id.team_name);
                team1 = new Team(team_name.getText().toString());
                myRef = database.getReference(team1.getName());
                myRef.setValue(team1);
            }
        });
    }
}