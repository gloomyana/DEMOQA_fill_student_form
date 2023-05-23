package ru.gloomyjana.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {
    private final SelenideElement FULL_NAME_INPUT = $("#userName"),
            USER_EMAIL_INPUT = $("#userEmail"),
            CURRENT_ADDRESS_INPUT = $("#currentAddress"),
            SUBMIT_BUTTON = $("#submit");

    public TextBoxPage openPage() {
        open("/text-box");
        return this;
    }

    public TextBoxPage removeBanners() {
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public TextBoxPage setFullName(String fullName) {
        FULL_NAME_INPUT.setValue(fullName);
        return this;
    }

    public TextBoxPage setUserEmail(String email) {
        USER_EMAIL_INPUT.setValue(email);
        return this;
    }

    public TextBoxPage setCurrentAddress(String address) {
        CURRENT_ADDRESS_INPUT.setValue(address);
        return this;
    }

    public TextBoxPage submitForm() {
        SUBMIT_BUTTON.click();
        return this;
    }
}
