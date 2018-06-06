Feature: validate the Register feature

Scenario: Test the Register Page
         
        Given  user is already on home  page 
        When  Title of home Page is Nridesicharms
        Then Click on Register button
        And  user enters registration details
         |Rani  |guntur|rani@gmail.com        |Runitha@1|Runitha@1|
         Then click on submit button
         And close the Browser
         
          
         