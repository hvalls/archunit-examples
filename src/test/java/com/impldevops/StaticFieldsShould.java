package com.impldevops;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import org.junit.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.fields;

public class StaticFieldsShould {

    @Test
    public void beFinal() {
        JavaClasses classes = new ClassFileImporter().importPackages("com.impldevops");
        fields().that().areStatic().should().beFinal().check(classes);
    }
}

