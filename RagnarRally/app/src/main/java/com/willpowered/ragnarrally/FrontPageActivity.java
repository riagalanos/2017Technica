package com.willpowered.ragnarrally;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.willpowered.ragnarrally.R;

public class FrontPageActivity extends AppCompatActivity {

    private Button startTeam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        startTeam = (Button)findViewById(R.id.button_start_team);
        startTeam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FrontPageActivity.this, CreateTeamActivity.class);
                startActivity(i);
            }
        });


    }
}
