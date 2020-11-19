package main.java.collections.main.java.corejava.example_annotations.custom_annotation.two;

import main.java.collections.main.java.corejava.example_annotations.custom_annotation.two.Test;
import main.java.collections.main.java.corejava.example_annotations.custom_annotation.two.TesterInfo;
import main.java.collections.main.java.corejava.example_annotations.custom_annotation.two.TesterInfo.Priority;

@TesterInfo(
        priority = Priority.HIGH,
        createdBy = "Nitin",
        tags = {"sales","test" }
)

public class TestExample {
    @Test
    void testA() {
        if (true)
            throw new RuntimeException("This test always failed");
    }

    @Test(enabled = false)
    void testB() {
        if (false)
            throw new RuntimeException("This test always passed");
    }

    @Test(enabled = true)
    void testC() {
        if (10 > 1) {
            // do nothing, this test always passed.
        }
    }


}
