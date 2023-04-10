package ru.gloomyjana.tests;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class TestDataUsingFaker {
    Faker faker = new Faker(new Locale("en"));
    String firstName, lastName, userEmail, userGender, phoneNumber, dayOfBirth, monthOfBirth,
            yearOfBirth, subjects, hobbies, pathName, userAddress, stateName, cityName;
    String[] userSubjects, userHobbies;
    String[] allSubjects = new String[] {"Arts, Physics", "English, Chemistry",
            "Computer Science, History, Biology", "Maths, Civics"},
            allHobbies = new String[] {"Music, Sports", "Reading, Music", "Music, Sports, Reading"},
            allStates = new String[] {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

    Map<String, String[]> stateCityMap = Map.of(
            "NCR", new String[]{"Delhi", "Gurgaon", "Noida"},
            "Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"},
            "Haryana", new String[]{"Karnal", "Panipat"},
            "Rajasthan", new String[]{"Jaipur", "Jaiselmer"});

    public void getRandomUserBirthday() {
        Date userDateOfBirth = faker.date().birthday(18, 40);
        yearOfBirth = new SimpleDateFormat("yyyy").format(userDateOfBirth);
        monthOfBirth = new SimpleDateFormat("MMMM", Locale.UK).format(userDateOfBirth);
        dayOfBirth = new SimpleDateFormat("d").format(userDateOfBirth);
    }

    public String getRandomItemFromArray(String[] items) {
        return faker.options().option(items);
    }

    public String getRandomCityFromState(String stateName) {
        return faker.options().option(stateCityMap.get(stateName));
    }

    public void GenerateData() {
        getRandomUserBirthday();
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        userEmail = faker.internet().emailAddress();
        userGender = faker.demographic().sex();
        phoneNumber = faker.phoneNumber().subscriberNumber(10);
        subjects = getRandomItemFromArray(allSubjects);
        hobbies = getRandomItemFromArray(allHobbies);
        pathName = "src/test/resources/pictures/pic.jpg";
        userAddress = faker.address().fullAddress();
        stateName = getRandomItemFromArray(allStates);
        cityName = getRandomCityFromState(stateName);
        userSubjects = subjects.split(", ");
        userHobbies = hobbies.split(", ");
    }
}
