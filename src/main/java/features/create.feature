Feature: create
@smoke @sanity
Scenario Outline: Login and Create Lead
And Enter the username as <username>
And Enter password as <password>
And Click on login button
And Click CRM/SFA link
And Click on Leads
And Click on Create lead
And Enter the Firstname as <fName>
And Enter the lastname as <lName>
And Enter the Company as <cName>
When Click on submit button

Examples:
|username|password|fName|lName|cName|
|DemoSalesManager|crmsfa|Kevin|Christ|Infy|