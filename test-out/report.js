$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sunit_000/Desktop/testing/cucumberProject/src/main/java/Features/RegisterMap.feature");
formatter.feature({
  "line": 1,
  "name": "Cheking the Registration using map",
  "description": "",
  "id": "cheking-the-registration-using-map",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test Registration using Map",
  "description": "",
  "id": "cheking-the-registration-using-map;test-registration-using-map",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is already on home  page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Title of home Page is Nridesicharms",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click on Register button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters registration details",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "Email",
        "password",
        "Re-password"
      ],
      "line": 11
    },
    {
      "cells": [
        "Rani5",
        "guntur1",
        "rp99@gmail.com",
        "Runitha@1",
        "Runitha@1"
      ],
      "line": 12
    },
    {
      "cells": [
        "Rani7",
        "guntur2",
        "rn10@gmail.com",
        "Runitha@1",
        "Runitha@1"
      ],
      "line": 13
    },
    {
      "cells": [
        "Rani9",
        "guntur3",
        "ra91@gmail.com",
        "Runitha@1",
        "Runitha@1"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDef.user_is_already_on_home_page()"
});
formatter.result({
  "duration": 10854966827,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDef.title_of_home_Page_is_Nridesicharms()"
});
formatter.result({
  "duration": 48436622,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDef.Click_on_Register_button()"
});
formatter.result({
  "duration": 194727956,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDef.user_enters_registration_details(DataTable)"
});
formatter.result({
  "duration": 28441683695,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDef.close_the_Browser()"
});
formatter.result({
  "duration": 2094283366,
  "status": "passed"
});
});