package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Scanner getName = new Scanner(System.in);
        String name = null;
        System.out.println("Welcome to the Quiz Game show do you have what it takes to be the World's best programmer?");
        System.out.println("Enter your username: ");
        name = getName.next();
        Player newPlayer = new Player(name);
        System.out.println("Welcome " + name);

        Question[] questions = {
                new Question("What is OOP?", "object oriented programming", 1),
                new Question("Which is a self closing tag\n (a) hr\n (b) body\n  (c) div", "a", 1),
                new Question("What is Jest?\n (a) framework\n (b) testing-library\n  (c) library", "b", 1),
                new Question("What is Java?\n (a) front-end\n (b) back-end", "b" , 2),
                new Question("Which languages can the web read?\n (a) HTML,SCSS,JS\n (b) HMTL,CSS,C++\n, (c) HTML,CSS,Js", "c" , 2),
                new Question("Who created Java?\n (a) Matt Bickell\n (b) James Gosling\n  (c) Brendan Eich", "b", 2),
                new Question("Who created Js?\n (a) Brendan Eich\n (b) James Gosling\n  (c) Andy Evans", "a", 2),
                new Question("Which is the best operating system?\n (a) Mac OS\n (b) Windows\n (c) Linux", "a", 3),
                new Question("Which programming language is the most popular?", "Python", 3),
                new Question("Who thinks they aced this quiz?", "me", 3)
        };
        Scanner getQuestionDifficulty = new Scanner(System.in);
        System.out.println("Enter difficulty:\n (1) Easy\n (2) Medium\n (3) Hard ");
        int questionDifficulty = getQuestionDifficulty.nextInt();
        Stream<Question> newQuestions = Arrays.stream(questions).filter(question ->  question.getQuestionDifficulty() ==  questionDifficulty);
        // using scanner get the difficulty they want
        // based on the difficulty filter the questions
        // pass in filtered questions only
    startQuiz(newQuestions.toArray(Question[]::new),name);
    }

    private static void startQuiz(Question[] questions,String name) {
        int score = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i].getquestionPrompt());
            String answer = input.nextLine().toLowerCase(Locale.ROOT);
            if (answer.equals(questions[i].getAnswer())){
                score++;
            }
        }
        System.out.println(name + " you got " + score + "/" + questions.length);
        if (score <= 1){
            System.out.println("Maybe you need more coding lessons, " + name + "!");
        } else if(score == 2){
            System.out.println("That's a decent score, " + name + "!");
        } else{
            System.out.println("Well done! " + name + " you are the best coder");
        }
    }
}
