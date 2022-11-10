Feature: To test BMI calculator

@Regression
Scenario Outline: To calculate BMI

Given enter "<age>" "<height>" and "<weight>" and then calculate it
When Capture result and print for user 
Then close the browser

Examples:
|age|height|weight|
|10|127|40|
|30|156|70|
|25|152|55|
|20|160|45|
|35|160|70|