
package com.example.android.udacityprojectromequizz3;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.widget.Button;
import android.widget.RadioButton;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.android.udacityprojectromequizz3.R;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view) {
        int quizResult = 0;


        /* The first question
         * Checking if the question choosen from radio buttons is correct
         * After clicking CheckAnswers the color will change to red(incorrect) or green(correct)
         */

        RadioButton checkFirst_answer_first_input = (RadioButton) findViewById(R.id.first_question_first_answer_checked);
        RadioButton checkFirst_answer_second_input = (RadioButton) findViewById(R.id.first_question_second_answer_checked);


        boolean choosen_firstAnswer_first_input = checkFirst_answer_first_input.isChecked();

        if (choosen_firstAnswer_first_input) {
            quizResult += 1;
            checkFirst_answer_first_input.setTextColor(Color.GREEN);
        } else {
            checkFirst_answer_second_input.setTextColor(Color.RED);
        }

 /* The Second question
         * Checking if the question choosen from radio buttons is correct
         * After clicking CheckAnswers the color will change to red(incorrect) or green(correct)
         */

        RadioButton checkSecond_answer_first_input = (RadioButton) findViewById(R.id.second_question_first_answer_checked);
        RadioButton checkSecond_answer_second_input = (RadioButton) findViewById(R.id.second_question_second_answer_checked);

        boolean choosen_SecondAnswer_first_input = checkFirst_answer_first_input.isChecked();

        if (choosen_SecondAnswer_first_input) {
            quizResult += 1;
            checkSecond_answer_first_input.setTextColor(Color.GREEN);
        } else {
            checkSecond_answer_second_input.setTextColor(Color.RED);
        }
        /* Third question
         * Checking if the question choosen from radio buttons is correct
         * After clicking CheckAnswers the color will change to red(incorrect) or green(correct)
         */
        CheckBox checkThirdAnswerFirstInput = (CheckBox) findViewById(R.id.third_answer_first_checkbox);
        CheckBox checkThirdAnswerSecondInput = (CheckBox) findViewById(R.id.third_answer_second_checkbox);
        CheckBox checkThirdAnswerThirdInput = (CheckBox) findViewById(R.id.third_answer_third_checkbox);
        CheckBox checkThirdAnswerFourthinput = (CheckBox) findViewById(R.id.third_answer_fourth_checkbox);

        boolean FirstCheckboxInput = checkThirdAnswerFirstInput.isChecked();
        boolean ThirdCheckboxInput = checkThirdAnswerThirdInput.isChecked();


        if (FirstCheckboxInput && ThirdCheckboxInput ) {
            quizResult += 1;
            checkThirdAnswerFirstInput.setTextColor(Color.GREEN);
            checkThirdAnswerThirdInput.setTextColor(Color.GREEN);

        }

        else {
            checkThirdAnswerSecondInput.setTextColor(Color.RED);
            checkThirdAnswerFourthinput.setTextColor(Color.RED);
        }
         /* Fourth question
         * Checking if the question written to EditBox is correct
         * After clicking CheckAnswers the color will change to red(incorrect) or green(correct)
         */
        EditText checkingAnswerFour = (EditText) findViewById(R.id.FourthAnswer);
        String EditTextFourthQuestion = checkingAnswerFour.getEditableText().toString();

        if (EditTextFourthQuestion.equals("Hadrian")) {
            quizResult += 1;
        }

        /* Fifth question
         * Checking if the question written to EditBox is correct
         * After clicking CheckAnswers the color will change to red(incorrect) or green(correct)
         */
        EditText checkingAnswerFive = (EditText) findViewById(R.id.FifthAnswer);
        String EditTextFifthQuestion = checkingAnswerFive.getEditableText().toString();

        if (EditTextFifthQuestion.equals("Gladius")) {
            quizResult += 1;
        }
     /* The Sixth question
         * Checking if the question choosen from radio buttons is correct
         * After clicking CheckAnswers the color will change to red(incorrect) or green(correct)
         */

        RadioButton checkSixth_answer_first_input = (RadioButton) findViewById(R.id.sixt_question_first_radiobutton);
        RadioButton checkSixth_answer_second_input = (RadioButton) findViewById(R.id.sixth_question_second_radiobutton);
        RadioButton checkSixth_answer_third_input = (RadioButton) findViewById(R.id.sixth_question_third_radiobutton);
        RadioButton checkSixth_answer_fourth_input = (RadioButton) findViewById(R.id.sixth_question_fourth_radiobutton);

        boolean choosen_sixthAnswer_second_input = checkSixth_answer_second_input.isChecked();

        if (choosen_sixthAnswer_second_input) {
            quizResult += 1;
            checkSixth_answer_second_input.setTextColor(Color.GREEN);
        } else {
            checkFirst_answer_second_input.setTextColor(Color.RED);
            checkSixth_answer_first_input.setTextColor(Color.RED);
            checkSixth_answer_third_input.setTextColor(Color.RED);
            checkSixth_answer_fourth_input.setTextColor(Color.RED);
        }
  /* The seventh question
         * Checking if the question choosen from radio buttons is correct
         * After clicking CheckAnswers the color will change to red(incorrect) or green(correct)
         */

        RadioButton checkSeventh_answer_first_input = (RadioButton) findViewById(R.id.seventh_question_first_answer_checked);
        RadioButton checkSeventh_answer_second_input = (RadioButton) findViewById(R.id.seventh_question_second_answer_checked);


        boolean choosen_seventhAnswer_second_input = checkSeventh_answer_second_input.isChecked();

        if (choosen_seventhAnswer_second_input) {
            quizResult += 1;
            checkSeventh_answer_second_input.setTextColor(Color.GREEN);
        } else {
            checkSeventh_answer_first_input.setTextColor(Color.RED);
        }

        EditText userNameInput = (EditText) findViewById(R.id.nameTextInput);
        String nameOfUser = userNameInput.getText().toString();

        Button results = (Button) findViewById(R.id.checkingButton);
        results.setClickable(true);


        /* Display toast messages for each possible ressult*/

        if ( quizResult <= 3) {
            Toast.makeText(this,nameOfUser + ", " + getString(R.string.summary) + quizResult  + getString(R.string.worstScore), Toast.LENGTH_LONG).show();
        } else if (quizResult > 4 && quizResult <=6) {
            Toast.makeText(this,nameOfUser + ", " + getString(R.string.summary) + quizResult  + getString(R.string.betterScore), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this,nameOfUser + ", " + getString(R.string.summary) + quizResult  + getString(R.string.bestScore), Toast.LENGTH_LONG).show();
        }


    }
}

