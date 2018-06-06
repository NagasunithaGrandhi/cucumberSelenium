Feature: Test NriDesicharms Login feature By passing parameters
           
Scenario: NriDesicharms Login Test Feature passing parameters
      Give  user is already on home  page
      When  Title of home  Page is Nridesicharms
      Then Click on Login Button
      Then Enters the info "sunithagrandhi15@gmail.com" and "Runitha@1"
      And  Clicks on Login Button
      And  User is logged in using his Account.
      Then close the Browser