
@full
Feature: To test google

@sanity
Scenario: to launch google1

Given Google website is launched
When Search bar is visible
Then Search text Mayuri

@regression
Scenario: to launch google2

Given Google website is launched
When Search bar is visible
Then Search text Mayuri

@mayuri
Scenario: to launch google3

Given Google website is launched
When Search bar is visible
Then Search text Mayuri

@sanity
Scenario: to launch google4

Given Google website is launched
When Search bar is visible
Then Search text Mayuri

@sanity @regression
Scenario: to launch google5

Given Google website is launched
When Search bar is visible
Then Search text Mayuri

@mayuri
Scenario: to launch google6

Given Google website is launched
When Search bar is visible
Then Search text Mayuri
