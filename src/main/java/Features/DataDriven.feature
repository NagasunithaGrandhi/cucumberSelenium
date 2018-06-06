Feature: Validate Keyword Search feature in NriDesicharms

Scenario Outline: Check Keyword search
            Given user is already on home  page 
            When Title of home  Page is Nridesicharms
            Then enter "<values>" in Keyword text box
            And  close the Browser
            Examples:
            | values|
            |Bussiness|
            |Food|
            |DesiBazar|
            |cpa|
            