package za.ac.cput.entity;
/*
 *Author: Athi Fukama 218328591
 * Entity class for Test
 */

import java.io.Serializable;


public class ControlledTest implements Serializable
{

    private String testId;
    private String lectureId;
    private String testInfo;


    protected ControlledTest(){
    }

    private ControlledTest(ControlledTest.Builder builder){
        this.testId = builder.testId;
        this.lectureId = builder.lectureId;
        this.testInfo = builder.testInfo;

    }

    @Override
    public String toString() {
        return "Test{" +
                "testId='" + testId + '\'' +
                ", lectureId='" + lectureId + '\'' +
                ", testInfo='" + testInfo + '\'' +
                '}';
    }

    public String getTestId() {
        return testId;
    }

    public String getLectureId() {
        return lectureId;
    }

    public String getTestInfo() {
        return testInfo;
    }

    public static class Builder{
        private String testId;
        private String lectureId;
        private String testInfo;


        public Builder setTestId(String testId) {
            this.testId = testId;
            return this;
        }
        public Builder setLectureId(String lectureId) {
            this.lectureId = lectureId;
            return this;
        }

        public Builder setTestInfo(String testInfo) {
            this.testInfo = testInfo;
            return this;
        }

        public ControlledTest build(){
            return new ControlledTest(this);
        }

        public Builder copy(ControlledTest test){
            this.testId= test.testId;
            this.lectureId = test.lectureId;
            this.testInfo = test.testInfo;
            return this;
        }


    }

}
