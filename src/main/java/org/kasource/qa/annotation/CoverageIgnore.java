package org.kasource.qa.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks methods as ignore coverage checks.
 *
 * Note: Java 10 (or later) projects does not support coverage ignore by annotations, since JaCoCo is used.
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CoverageIgnore {
    /**
     * Describe why this method should be omitted from coverage check
     *
     * @return Reason why coverage check should be ignored
     */
    String justification();
}
