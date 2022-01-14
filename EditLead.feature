Feature: Edit Lead of Leaftaps Application

@Smoke @Regression
Scenario: Edit the Lead details
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When click on Login Button
Then Homepage Click
Given Click Leads button
Given Search with first name as 'Reshika'
And Click Find Leads button
And Click the first row
And Click Edit button
And Update Company Name as 'TCS'
When Click Update Button
Then Verify Company Name is 'TCS'
