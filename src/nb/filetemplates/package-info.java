/*
 * Copyright (c) 2020 Arthur Sadykov.
 */
@TemplateRegistrations({
    @TemplateRegistration(
            folder = "SpringFramework",
            displayName = "#SpringMVCController_displayName",
            iconBase = "nb/filetemplates/spring-framework.png",
            content = "SpringMVCController.java.template",
            description = "SpringMVCDescription.html",
            scriptEngine = "freemarker"
    ),
    @TemplateRegistration(
            folder = "Functional Tests",
            displayName = "#JellyToolsTest_displayName",
            content = "JellyToolsTest.java.template",
            description = "JellyToolsDescription.html",
            scriptEngine = "freemarker"
    ),
    @TemplateRegistration(
            folder = "UnitTests",
            displayName = "#NbTestCase_displayName",
            iconBase = "nb/filetemplates/JUnitLogo.png",
            content = "NbTestCase.java.template",
            description = "NbTestCaseDescription.html",
            scriptEngine = "freemarker"
    )
}) @Messages({"SpringMVCController_displayName=Spring MVC annotation-based controller",
    "JellyToolsTest_displayName=Jelly Tools Test Case",
    "NbTestCase_displayName=NbTestCase"})
package nb.filetemplates;

import org.netbeans.api.templates.TemplateRegistration;
import org.netbeans.api.templates.TemplateRegistrations;
import org.openide.util.NbBundle.Messages;
