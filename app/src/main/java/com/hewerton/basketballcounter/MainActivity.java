package com.hewerton.basketballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore = 0;
    private int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void updateScore() {
        TextView aScore = findViewById(R.id.team_a_score);
        TextView bScore = findViewById(R.id.team_b_score);

        aScore.setText(String.valueOf(this.teamAScore));
        bScore.setText(String.valueOf(this.teamBScore));
    }

    private void incrementTeamAScore(int value) {
        this.teamAScore += value;
        this.updateScore();

    }

    private void incrementTeamBScore(int value) {
        this.teamBScore += value;
        this.updateScore();
    }


    public void incrementAByOne(View view) {
      this.incrementTeamAScore(1);
    }

    public void incrementAByTwo(View view) {
        this.incrementTeamAScore(2);
    }

    public void incrementAByThree(View view) {
        this.incrementTeamAScore(3);
    }

    public void incrementBByOne(View view) {
        this.incrementTeamBScore(1);
    }

    public void incrementBByTwo(View view) {
        this.incrementTeamBScore(2);
    }

    public void incrementBByThree(View view) {
        this.incrementTeamBScore(3);
    }

    public void resetScores(View view) {
        this.teamAScore = 0;
        this.teamBScore = 0;
        this.updateScore();
    }


}
