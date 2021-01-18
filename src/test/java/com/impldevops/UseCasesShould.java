package com.impldevops;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import org.junit.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;

public class UseCasesShould {

    @Test
    public void matchNaming() {
        JavaClasses classes = new ClassFileImporter().importPackages("com.impldevops.usecases");
        classes().should().haveSimpleNameEndingWith("UseCase").check(classes);
    }

    @Test
    public void haveExecuteMethod() {
        JavaClasses classes = new ClassFileImporter().importPackages("com.impldevops.usecases");
        methods().that().arePublic().should().haveName("execute").check(classes);
    }

}
