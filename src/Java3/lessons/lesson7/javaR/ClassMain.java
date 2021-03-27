package Java3.lessons.lesson7.javaR;

import Java3.lessons.lesson7.testsR.ClassTests;
import Java3.lessons.lesson7.testsR.ClassTest2;
import Java3.lessons.lesson7.testsR.ClassTest3;
import Java3.lessons.lesson7.testsR.TestAll;

public class ClassMain {

    public static void main(String[] args) {

        TestAll testAll = new TestAll();
        TestAll.start(ClassTests.class);
        TestAll.start(ClassTest3.class);
        TestAll.start(ClassTest2.class);
    }

}