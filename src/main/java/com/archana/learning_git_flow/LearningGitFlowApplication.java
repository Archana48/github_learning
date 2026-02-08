package com.archana.learning_git_flow;

import com.archana.learning_git_flow.Controller.GitController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningGitFlowApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningGitFlowApplication.class, args);

        System.out.println("Hello, welcome to learning Git Flow!");
        GitController.print();
    }

}
