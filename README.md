# Автоматизация тестирования для [DEMOQA](https://demoqa.com/)
<img title="DEMOQA" src="https://demoqa.com/images/Toolsqa.jpg">

## :page_facing_up: Cодержание
- [Описание, технологии и иструменты](#paperclip-описание,-технологии-и-иструменты)
- [Реализованные проверки](#white_check_mark-реализованные-проверки)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Allure отчет](#-allure-отчет)
- [Уведомления в Telegram](#-уведомления-в-telegram)
- [Пример прогона теста в Selenoid](#-пример-прогона-теста-в-selenoid)

## :paperclip: Описание, технологии и иструменты
<a href="https://www.java.com"><img src="https://github.com/gloomyana/gloomyana/blob/main/icons/java.svg" title="Java" alt="Java" width="40" height="40"/></a>
<a href="https://selenide.org"><img src="https://github.com/gloomyana/gloomyana/blob/main/icons/selenide.svg" title="Selenide" alt="Selenide" width="40" height="40"/></a>
<a href="https://junit.org/junit5"><img src="https://github.com/gloomyana/gloomyana/blob/main/icons/junit5.svg" title="JUnit5" alt="JUnit5" width="40" height="40"/></a>
<a href="https://gradle.org"><img src="https://github.com/gloomyana/gloomyana/blob/main/icons/gradle.svg" title="Gradle" alt="Gradle" width="40" height="40"/></a>
<a href="https://www.jenkins.io"><img src="https://github.com/gloomyana/gloomyana/blob/main/icons/jenkins.svg" title="Jenkins" alt="Jenkins" width="40" height="40"/></a>
<a href="https://qameta.io/allure-report"><img src="https://github.com/gloomyana/gloomyana/blob/main/icons/allure_report.svg" title="Allure Report" alt="Allure Report" width="40" height="40"/></a>
<a href="https://aerokube.com/selenoid/latest/"><img src="https://github.com/gloomyana/gloomyana/blob/main/icons/selenoid.svg" title="Selenoid" alt="Selenoid" width="40" height="40"/></a>

Демо проект состоит из UI-тестов для заполнения форм на сайте [DEMOQA](https://demoqa.com/) - Student Registration Form и Text Box. \
В проекте используется:
- [x] `Page Object` проектирование
- [x] Библиотека `JavaFaker` для генерации данных
- [x] Удаленная сборка (запуск тестов на удаленном браузере)
- [x] `Allure Report`
- [x] Уведомления в Telegram с использованием бота
- [x] Пример прогона теста в Selenoid

## <img width="3%" title="Jenkins" src="https://github.com/gloomyana/gloomyana/blob/main/icons/jenkins.svg"> Сборка в Jenkins
[Сборка в Jenkins](https://jenkins.autotests.cloud/job/DEMOQA_fill_student_form/) 

<img title="Jenkins project page" src="images/jenkins_project_page.png">

Это параметризированная сборка, поэтому есть возможность выбрать браузер и версию и размер:
<img title="Jenkins build parameters" src="images/jenkins_build_parameters.png">

Также есть возможность выбора таска и ветки проекта: \
<img title="Jenkins build parameters" src="images/jenkins_build_parameters2.png">

## <img width="3%" title="Allure Report" src="https://github.com/gloomyana/gloomyana/blob/main/icons/allure_report.svg"> Allure отчет
Главная страница отчета Allure содержит следующие блоки:
- **ALLURE REPORT** - отображает дату и время теста, общее количество запущенных тестов, а также диаграмму с процентом и количеством успешных, упавших и сломавшихся в процессе выполнения тестов
- **TREND** - отображает тенденцию выполнения тестов для всех запусков
- **SUITES** - отображает распределение тестов по сьютам

<img title="Allure Report" src="images/allure_report_main.png"> 

Список тестов с шагами:

<img title="Allure Report test 1" src="images/allure_report_test1.png">

<img title="Allure Report test 2" src="images/allure_report_test2.png">

После каждого теста доступны дополнительные тестовые артефакты:
- Last Screenshot
- Page Source
- Browser console logs
- Video
<img title="Allure Report test 3" src="images/allure_report_attachments.png">

## <img width="3%" title="Telegram" src="https://github.com/gloomyana/gloomyana/blob/main/icons/telegram.svg"> Уведомления в Telegram

<img title="Telegram bot message" src="images/telegram_report.png">

## <img width="3%" title="Selenoid Video" src="https://github.com/gloomyana/gloomyana/blob/main/icons/selenoid.svg"> Пример прогона теста в Selenoid

 <img title="Selenoid Video" src="images/selenoid_video.gif">
