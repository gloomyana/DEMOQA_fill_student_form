package ru.gloomyjana.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class RegistrationWithRemoteDriverTests extends TestBase {
    @Tag("registration_form")
    @Test
    void successfulRegistrationFormTest() {
        step("Generate data using Faker", () -> {
            testDataUsingFaker.GenerateData();
        });

        step("Open form", () -> {
            registrationPage.openPage();
        });
        step("Remove banners and footer", () -> {
            registrationPage.removeBanners();
        });
        step("Set name", () -> {
            registrationPage.setFirstName(testDataUsingFaker.firstName)
                    .setLastName(testDataUsingFaker.lastName);
        });
        step("Set email address", () -> {
            registrationPage.setUserEmail(testDataUsingFaker.userEmail);
        });
        step("Set gender", () -> {
            registrationPage.setUserGender(testDataUsingFaker.userGender);
        });
        step("Set phone number", () -> {
            registrationPage.setUserNumber(testDataUsingFaker.phoneNumber);
        });
        step("Set birth date", () -> {
            registrationPage.setBirthDate(testDataUsingFaker.dayOfBirth,
                    testDataUsingFaker.monthOfBirth,
                    testDataUsingFaker.yearOfBirth);
        });
        step("Set subjects and hobbies", () -> {
            registrationPage.setSubjects(testDataUsingFaker.userSubjects)
                    .setHobbies(testDataUsingFaker.userHobbies);
        });
        step("Upload picture", () -> {
            registrationPage.uploadPicture(testDataUsingFaker.pathName);
        });
        step("Set current address", () -> {
            registrationPage.setCurrentAddress(testDataUsingFaker.userAddress);
        });
        step("Set state and city", () -> {
            registrationPage.setState(testDataUsingFaker.stateName)
                    .setCity(testDataUsingFaker.cityName);
        });
        step("Submit form", () -> {
            registrationPage.submitForm();
        });

        step("Verify results", () -> {
            modalPage.verifyResultsModalAppears()
                    .verifyResult("Student Name", testDataUsingFaker.firstName + " "
                            + testDataUsingFaker.lastName)
                    .verifyResult("Student Email", testDataUsingFaker.userEmail)
                    .verifyResult("Gender", testDataUsingFaker.userGender)
                    .verifyResult("Mobile", testDataUsingFaker.phoneNumber)
                    .verifyResult("Date of Birth", testDataUsingFaker.dayOfBirth + " "
                            + testDataUsingFaker.monthOfBirth + ","
                            + testDataUsingFaker.yearOfBirth)
                    .verifyResult("Subjects", testDataUsingFaker.subjects)
                    .verifyResult("Hobbies", testDataUsingFaker.hobbies)
                    .verifyResult("Picture", testDataUsingFaker.pathName.
                            substring(testDataUsingFaker.pathName.lastIndexOf("/") + 1))
                    .verifyResult("Address", testDataUsingFaker.userAddress)
                    .verifyResult("State and City", testDataUsingFaker.stateName + " "
                            + testDataUsingFaker.cityName);
        });

    }

    @Tag("text_box")
    @Test
    void successfulFillTextBoxTest() {
        step("Generate data using Faker", () -> {
            testDataUsingFaker.GenerateDataTextBox();
        });

        step("Open form", () -> {
            textBoxPage.openPage();
        });
        step("Remove banners and footer", () -> {
            textBoxPage.removeBanners();
        });
        step("Set full name", () -> {
           textBoxPage.setFullName(testDataUsingFaker.fullName);
        });
        step("Set email address", () -> {
            textBoxPage.setUserEmail(testDataUsingFaker.userEmail);
        });
        step("Set current address", () -> {
            textBoxPage.setCurrentAddress(testDataUsingFaker.userAddress);
        });
        step("Submit form", () -> {
            textBoxPage.submitForm();
        });

        step("Verify results", () -> {
            $(".border").should(appear);
            $("#name.mb-1").shouldHave(text("Name:" + testDataUsingFaker.fullName));
            $("#currentAddress.mb-1").shouldHave(text("Current Address :"
                    + testDataUsingFaker.userAddress));
        });
    }
}
