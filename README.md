# HomeWorkSpringLog
 Домашнее задание по теме "Ведение журналов" (ProductStar)

# Постановка задачи
1. Создать spring-boot приложение.
2. Подключить библиотеку Logback.
3. Настроить два аппендера для вывода в файлы.
4. В один файл с названием info.log выводить все сообщения уровня INFO.
5. В другой файл с названием debug.log выводить все сообщения уровня DEBUG.
6. Протестировать работу приложения с подключенным логированием.
7. Отправить на проверку получившиеся файлы с логами и файл с конфигурацией logback.xml.

## Подключенные зависимости и плагины
- spring-boot-starter - Spring boot Starter - Core starter, including auto-configuration support, logging and YAML.
- logback-classic - Билиотека для логгированния (Implementation of the SLF4J API for Logback, a reliable, generic, fast and flexible logging framework.).
- spring-boot-starter-test -  это фреймворк для модульного и интеграционного тестирования компонентов Spring Boot Application с помощью JUnit.
- spring-boot-maven-plugin - это плагин для сборки и упаковки приложений Spring Boot.

## Описание основных файлов
- main/java/com/example/homeworkspringlog/HomeWorkSpringLogApplication.java - исполняемый файл для запуска и выполнения SpringApplication 
- main/java/com/example/homeworkspringlog/ClassForLog.java - класс с Bean для записи в лог информации
- main/resources/logback.xml - файл по умольчанию для настроек логгирования logback 
- main/resources/application.properties - файл параметров приложения

## Примечания
- первоначально сгенерировал проект HomeWorkSpringLog (Demo project for Spring Boot generated) на сайте https://start.spring.io/ .