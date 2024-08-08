package com.example.quiz.form;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Form */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizForm {
    private Integer id;

    /**퀴즈 내용 */
    @NotBlank
    private String question;

    /** 퀴즈 해답 */
    private Boolean answer;

    /** 작성자 */
    @NotBlank
    private String author;

    /** 등록 도는 변경 판단용 */
    private Boolean newQuiz;
}
