package za.ac.cput.factory;
/*
 *Author: Athi Fukama 218328591
 * Factory class for Exam
 */

import za.ac.cput.entity.Exam;
import za.ac.cput.util.GenericHelper;

public class ExamFactory {
    public static Exam createExam(String lecturerId, String examInfo) {
        String examId = GenericHelper.generateAnId();

        Exam exam = new Exam.Builder()
                .setExamId(examId)
                .setLecturerId(lecturerId)
                .setExamInfo(examInfo).build();


        return exam;
    }
}