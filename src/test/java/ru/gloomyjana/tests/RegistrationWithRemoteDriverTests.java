package ru.gloomyjana.tests;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class RegistrationWithRemoteDriverTests extends TestBase {

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
}
