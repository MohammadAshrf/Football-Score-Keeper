package com.example.footballscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalScoreTeamA = 0;
    int yellowScoreTeamA = 0;
    int redScoreTeamA = 0;
    int penaltyTeamA = 0;

    int goalScoreTeamB = 0;
    int yellowScoreTeamB = 0;
    int redScoreTeamB = 0;
    int penaltyTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater ().inflate (R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId ();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected (item);
    }

    /**
     * Increment score for Team A.
     */


    public void addGoalForTeamA(View v) {
        goalScoreTeamA++;
        displayGoalForTeamA (goalScoreTeamA);
    }

    public void addYellowForTeamA(View v) {
        yellowScoreTeamA++;
        displayYellowForTeamA (yellowScoreTeamA);
    }

    public void addRedForTeamA(View v) {
        redScoreTeamA++;
        displayRedForTeamA (redScoreTeamA);
    }

    public void addPenaltyForTeamA(View v) {
        penaltyTeamA++;
        displayPenaltyForTeamA (penaltyTeamA);
    }

    /**
     * Increment score for Team B.
     */


    public void addGoalForTeamB(View v) {
        goalScoreTeamB++;
        displayGoalForTeamB (goalScoreTeamB);
    }

    public void addRedForTeamB(View v) {
        redScoreTeamB++;
        displayRedForTeamB (redScoreTeamB);
    }

    public void addYellowForTeamB(View v) {
        yellowScoreTeamB++;
        displayYellowForTeamB (yellowScoreTeamB);
    }

    public void addPenaltyForTeamB(View v) {
        penaltyTeamB++;
        displayPenaltyForTeamB (penaltyTeamB);
    }


    /**
     * Display the given score for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById (R.id.team_a_goal_score);
        scoreView.setText (String.valueOf (score));
    }


    public void displayYellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById (R.id.team_a_yellow_card);
        scoreView.setText (String.valueOf (score));

    }

    public void displayRedForTeamA(int score) {
        TextView scoreView = (TextView) findViewById (R.id.team_a_red_card);
        scoreView.setText (String.valueOf (score));
    }


    public void displayPenaltyForTeamA(int score) {
        TextView scoreView = (TextView) findViewById (R.id.team_a_penalty);
        scoreView.setText (String.valueOf (score));
    }


    /**
     * Display the given score for Team B.
     */
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById (R.id.team_b_goal_score);
        scoreView.setText (String.valueOf (score));
    }

    public void displayYellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById (R.id.team_b_yellow_card);
        scoreView.setText (String.valueOf (score));
    }

    public void displayRedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById (R.id.team_b_red_card);
        scoreView.setText (String.valueOf (score));
    }


    public void displayPenaltyForTeamB(int score) {
        TextView scoreView = (TextView) findViewById (R.id.team_b_penalty);
        scoreView.setText (String.valueOf (score));

    }

    /**
     * Reset all Scores
     */

    public void resetScore(View v) {
        goalScoreTeamA = 0;
        yellowScoreTeamA = 0;
        redScoreTeamA = 0;
        penaltyTeamA = 0;

        goalScoreTeamB = 0;
        yellowScoreTeamB = 0;
        redScoreTeamB = 0;
        penaltyTeamB = 0;


        displayGoalForTeamA (goalScoreTeamA);
        displayYellowForTeamA (yellowScoreTeamA);
        displayRedForTeamA (redScoreTeamA);
        displayPenaltyForTeamA (penaltyTeamA);

        displayGoalForTeamB (goalScoreTeamB);
        displayYellowForTeamB (yellowScoreTeamB);
        displayRedForTeamB (redScoreTeamB);
        displayPenaltyForTeamB (penaltyTeamB);
    }


}
