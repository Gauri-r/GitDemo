Feature: Application Login

Scenario Outline: Home page login
Given Initialize browser
And Navigate to "http://www.qaclickacademy.com/" site
And User click on SignIn button
When User login into application with <username> and <password>
Then Verify that user is successfully logged in

Examples:
|username		|password |
|abcd@gmail.com |abcs12345|
|12335@gmail.com|abcde	  |