package unittest;

import backend.Anggota1841720149Alief;
import backend.Kategori1841720149Alief;
import learnunittesting.MessageProcessor1841720149Alief;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1841720149Alief {
    public static void main(String[] args) {
        Result mResult = JUnitCore.runClasses(MessageProcessor1841720149Alief.class);
        showMessageResultAlief(mResult, MessageProcessor1841720149Alief.class.getSimpleName());

        mResult = JUnitCore.runClasses(Kategori1841720149Alief.class);
        showMessageResultAlief(mResult, Kategori1841720149Alief.class.getSimpleName());

        mResult = JUnitCore.runClasses(Anggota1841720149Alief.class);
        showMessageResultAlief(mResult, Anggota1841720149Alief.class.getSimpleName());
    }

    private static void showMessageResultAlief(Result mResult, String className) {
        if (mResult.wasSuccessful()) {
            System.out.format("The result Test from %s : %s\n", className, mResult.wasSuccessful());
        } else {
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
