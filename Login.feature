Feature: Login functionality of Leaftaps Application


Scenario Outline: Login with positive credentials
And Enter the username as <username>
And Enter the password as <password>
When click on Login Button
Then Homepage Click

Examples: 
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario: Login with positive credentials
And Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When click on Login Button
But ErrorMessage should be displayed

