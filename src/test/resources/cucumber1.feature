Feature: To validate the login functionality of facebook application
Scenario: To validate login with valid username and invalid password
Given to launch the chrome browser and maximise window
When To launch the url of the facebook application
And To pass valid username in the email field
And To pass invalid password in the password field
And to click the login button
And to check whether navigate to the home page or not
Then To close the browser