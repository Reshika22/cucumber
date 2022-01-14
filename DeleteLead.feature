Feature: Delete Lead of Leaftaps Application

@Regression
Scenario: Delete the Lead details
Creating Lead Details
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When click on Login Button
Then Homepage Click
Given Click Leads button
And Search with phone number as '99'
And Click Find Leads button
And Get first Lead name
And Click the first row
And Click Delete button
And Click Leads button
When Verify the Lead is deleted
But No Records found
