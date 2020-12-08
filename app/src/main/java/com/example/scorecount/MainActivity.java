package com.example.scorecount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView teamAScore;
    private Button teamAPoint3Btn;
    private Button teamAPoint2Btn;
    private Button teamAPoint1Btn;

    private int scoreTeamA;

    private TextView teamBScore;
    private Button teamBPoint3Btn;
    private Button teamBPoint2Btn;
    private Button teamBPoint1Btn;

    private int scoreTeamB;

    private Button resetBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAScore = findViewById(R.id.Team_A_score);
        teamAPoint3Btn = findViewById(R.id.Team_A_pnt3);
        teamAPoint2Btn = findViewById(R.id.Team_A_pnt2);
        teamAPoint1Btn = findViewById(R.id.Team_A_pnt1);

        teamAPoint3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 3;
                teamAScore.setText(""+scoreTeamA);
            }
        });
        teamAPoint2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 2;
                teamAScore.setText(""+scoreTeamA);
            }
        });
        teamAPoint1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = scoreTeamA + 1;
                teamAScore.setText(""+scoreTeamA);
            }
        });

        teamBScore = findViewById(R.id.Team_B_score);
        teamBPoint3Btn = findViewById(R.id.Team_B_pnt3);
        teamBPoint2Btn = findViewById(R.id.Team_B_pnt2);
        teamBPoint1Btn = findViewById(R.id.Team_B_pnt1);

        teamBPoint3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamB = scoreTeamB + 3;
                teamBScore.setText(""+scoreTeamB);
            }
        });

        teamBPoint2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamB = scoreTeamB + 2;
                teamBScore.setText(""+scoreTeamB);
            }
        });

        teamBPoint1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamB = scoreTeamB + 1;
                teamBScore.setText(""+scoreTeamB);
            }
        });

        resetBtn = findViewById(R.id.reset_btn);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreTeamA = 0;
                scoreTeamB = 0;
                teamAScore.setText(""+scoreTeamA);
                teamBScore.setText(""+scoreTeamB);
                Toast.makeText(MainActivity.this, "Scores has been reset", Toast.LENGTH_SHORT).show();
            }
        });

    }
}