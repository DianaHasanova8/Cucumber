$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmpUpdated.feature");
formatter.feature({
  "name": "Add Employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I am logged into HRMS",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add new Employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I add \"John\", \"S\" and \"Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_add_and_(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click Save",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_Save()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I see Employee has been succesfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_Employee_has_been_succesfully_added()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Add new Employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I add \"\u003cFirstName\u003e\", \"\u003cMiddleName\u003e\" and \"\u003cLastName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click Save",
  "keyword": "And "
});
formatter.step({
  "name": "I see Employee with \"\u003cFirstName\u003e\", \"\u003cMiddleName\u003e\" and \"\u003cLastName\u003e\" is displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FirstName",
        "MiddleName",
        "LastName"
      ]
    },
    {
      "cells": [
        "James",
        "",
        "Smith"
      ]
    },
    {
      "cells": [
        "Jane",
        "J",
        "Smith"
      ]
    },
    {
      "cells": [
        "Sasha",
        "J",
        "Smith"
      ]
    },
    {
      "cells": [
        "David",
        "J",
        "Smith"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I am logged into HRMS",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add new Employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I add \"James\", \"\" and \"Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_add_and_(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click Save",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_Save()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I see Employee with \"James\", \"\" and \"Smith\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_Employee_with_and_is_displayed(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I am logged into HRMS",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add new Employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I add \"Jane\", \"J\" and \"Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_add_and_(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click Save",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_Save()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I see Employee with \"Jane\", \"J\" and \"Smith\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_Employee_with_and_is_displayed(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I am logged into HRMS",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add new Employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I add \"Sasha\", \"J\" and \"Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_add_and_(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click Save",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_Save()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I see Employee with \"Sasha\", \"J\" and \"Smith\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_Employee_with_and_is_displayed(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I am logged into HRMS",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add new Employee",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I add \"David\", \"J\" and \"Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_add_and_(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click Save",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_Save()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I see Employee with \"David\", \"J\" and \"Smith\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_Employee_with_and_is_displayed(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I am logged into HRMS",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add and Modify Employee Details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I enter employee details",
  "rows": [
    {
      "cells": [
        "FirstName",
        "MiddleName",
        "LastName"
      ]
    },
    {
      "cells": [
        "John",
        "J",
        "Smith"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_enter_employee_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click Save",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_Save()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on Edit",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.clickOnEdit_SaveButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I am able to modify Employee Details",
  "rows": [
    {
      "cells": [
        "DriverLicence",
        "ExpirationDate",
        "SSN",
        "SIN",
        "Gender",
        "MaritalStatus",
        "Nationality",
        "DOB"
      ]
    },
    {
      "cells": [
        "N78787886",
        "2021-13-08",
        "123-45-6789",
        "7687687",
        "Male",
        "Other",
        "Afghan",
        "1980-10-10"
      ]
    },
    {
      "cells": [
        "T55578855",
        "2018-15-08",
        "245-45-6789",
        "5486547",
        "Female",
        "Married",
        "Burmese",
        "1980-10-10"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.modifyEmployeeDetails(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I am logged into HRMS",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add Employee negative scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I click Save",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_Save()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I see required error message next to the first and last name",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I am logged into HRMS",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "AddEmployee and Login Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I add \"John\", \"M\" and \"Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_add_and_(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on create login checkbox",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I enter  \"username\",\"password\" and \"confirm password\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click Save",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_Save()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I see Employee has been succesfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_Employee_has_been_succesfully_added()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I am logged into HRMS",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add Employee and validate database",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I add \"James\", \"John\" and \"Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_add_and_(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click Save",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_Save()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I see Employee has been succesfully added",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_Employee_has_been_succesfully_added()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I collect employee data from database",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I verify employee data is matched",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/features/AddEmployee.feature");
formatter.feature({
  "name": "Add Employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I am logged in to HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "AddEmployeeSteps.i_am_logged_in_to_HRMS()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I navigated to Add Employee Page",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_navigated_to_Add_Employee_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Add new Employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint2"
    },
    {
      "name": "@addemployee"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "I add \"John\", \"S\" and \"Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddEmployeeSteps.i_add_and_(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click Save",
  "keyword": "And "
});
formatter.match({
  "location": "AddEmployeeSteps.i_click_Save()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I see Employee has been succesfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeeSteps.i_see_Employee_has_been_succesfully_added()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});