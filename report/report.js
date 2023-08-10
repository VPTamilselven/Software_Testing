$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/fbregistation.feature");
formatter.feature({
  "name": "To validate the account creation of fb applicatiom",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To create new account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "FBregistration.to_launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of fb application",
  "keyword": "When "
});
formatter.match({
  "location": "FBregistration.to_launch_the_url_of_fb_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the create new account button",
  "keyword": "And "
});
formatter.match({
  "location": "FBregistration.to_click_the_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass firstname in firstname text box",
  "rows": [
    {
      "cells": [
        "firsrname1",
        "inmakes"
      ]
    },
    {
      "cells": [
        "firstname2",
        "Tamil"
      ]
    },
    {
      "cells": [
        "firstname3",
        "Selvan"
      ]
    },
    {
      "cells": [
        "firstname4",
        "Manoj"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FBregistration.to_pass_firstname_in_firstname_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass secondname in secondname text box",
  "keyword": "And "
});
formatter.match({
  "location": "FBregistration.to_pass_secondname_in_secondname_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TO pass mobileno or email in email text box",
  "rows": [
    {
      "cells": [
        "password1",
        "password2",
        "password3"
      ]
    },
    {
      "cells": [
        "vptamilsel@gmail.com",
        "741258",
        "mohan@gmail.com"
      ]
    },
    {
      "cells": [
        "Manoj@gmail.com",
        "963258",
        "Kumar@gmail.com"
      ]
    },
    {
      "cells": [
        "friend@gmail.com",
        "741852",
        "MNBV@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FBregistration.to_pass_mobileno_or_email_in_email_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To create new password using new password text box",
  "keyword": "And "
});
formatter.match({
  "location": "FBregistration.to_create_new_password_using_new_password_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FBregistration.to_close_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
});