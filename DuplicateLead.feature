Feature: Duplicate Lead of Leaftaps Application

@Smoke @Regression
Scenario: Duplicate the Lead details
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When click on Login Button
Then Homepage Click
Given Click Leads button
Given Search with email as 'babu@testleaf.com'
And Click Find Leads button
And Get first Lead name
And Click the first row
And Click Duplicate button
And Click create lead button at the bottom
When Verify Lead Name is duplicated
Then Print the name