Feature: Merge two Leads of Leaftaps Application

@Smoke @Regression
Scenario: Duplicate the Lead details
Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa'
When click on Login Button
Then Homepage Click
And Click Leads button
Given Click Merge Leads button
When Click From Leads lookup
Then Switch to the new window1
And Search with 'Reshika'
And Click on First Lead button in the window
And Get the Lead Id
When Click the first lead link
Then Switch to the original window
When Click To Leads lookup
Then Switch to the new window2
And Search with 'babu'
And Click on First Lead button in the window
When Click the first lead link
Then Switch to the original main window
When Click Merge button
Then Accept Alert
And Click Leads button
When Verify Lead ID 
But No Records found

