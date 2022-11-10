Feature: Logging into Facebook

Scenario Outline: to enter valid username and password

Given facebook website is launched
When enter "<username>" and "<password>"
Then click on login button

Examples:
|username|password|
|mayuri|123|
|sharva|345|