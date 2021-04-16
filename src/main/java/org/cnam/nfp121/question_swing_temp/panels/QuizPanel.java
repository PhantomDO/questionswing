package org.cnam.nfp121.question_swing_temp.panels;

import org.cnam.nfp121.question_swing_temp.datas.QuizData;

import javax.swing.*;
import java.awt.*;

public class QuizPanel extends JPanel {

    private QuizData quizData;
    public QuizData getQuizData() {
        return quizData;
    }

    private QuestionPanel questionPanel;
    public QuestionPanel getQuestionPanel() {
        return questionPanel;
    }

    private ReponsePanel reponsePanel;
    public ReponsePanel getReponsePanel() {
        return reponsePanel;
    }

    public QuizPanel(QuizData quizData){
        this.setLayout(new BorderLayout());

        // Question
        questionPanel = new QuestionPanel();
        questionPanel.addQuestion(quizData.getQuestion());
        questionPanel.addClues(quizData.getClues());
        this.add(questionPanel, BorderLayout.CENTER);

        // Answers
        reponsePanel = new ButtonReponsePanel(new JButton("Validate"));
        reponsePanel.addAnswers(quizData.getAnswers());
        this.add(reponsePanel, BorderLayout.SOUTH);
    }
}
