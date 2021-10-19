package za.ac.cput.factory;


import za.ac.cput.entity.ControlledTest;
import za.ac.cput.util.GenericHelper;

/*
 *Author: Athi Fukama 218328591
 * Factory class for Test
 */
public class TestFactory {

    public static ControlledTest createTest(String testInfo)
    {
        String testId = GenericHelper.generateAnId();
        String lectureId = GenericHelper.generateAnId();


        ControlledTest test = new ControlledTest.Builder()
                .setTestId(testId)
                .setLectureId(lectureId)
                .setTestInfo(testInfo).build();


        return test;
    }

}
