package Courses1;

import java.lang.annotation.Documented;

/**
 * @author Oleksii Butenko
 */
public class Main {
    // Аннотация @Documented - документирует в JavaDoc
    @Documented
    @interface ClassPreamble {
        String author();

        String date();

        int currentRevision() default 1;

        String lastModified() default "N/A";

        String lastModifiedBy() default "N/A";

        String[] reviewers();


    }

    @ClassPreamble(
            author = "Oleksii",
            date = "24/09/2023",
            currentRevision = 5,
            lastModified = "24/09/2023",
            lastModifiedBy = "Oleksii Butenko",
            reviewers = {"Oleksii", "Alex", "Bob"}
    )
    public static void main(String[] args) {

    }

}
