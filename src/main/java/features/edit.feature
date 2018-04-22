Feature: edit

Scenario Outline: Login and Edit Lead
And Enter the username as <username>
And Enter password as <password>
And Click on login button
And Click CRM/SFA link
And Click on Leads
And Click on identifying Leads
And Enter the Name <fName>
And Click on Find
And Click on first resulting lead
And Verify the title <title>
And Click on Edit
And Change the Company name <cName>
And Click update
When Verify the company name <cName>

Examples:
|username|password|fName|title|cName|
|DemoSalesManager|crmsfa|AB|View Lead|Infy|