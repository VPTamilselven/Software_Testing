Feature: To validate the login functionality of facebook application

@Feature1
Scenario Outline: To validate the positive and negative combination of login functionality
Given User has to launch the browser and maximise the window
When User has to hit the facebook url
And User has to pass the data"<emaildata>" in email field
And User has to pass the date "<passworddaata>" in the password field 
And User has to click login button
Then User has to close the bowser

Examples:
 |emaildata                |passworddata|
 |vptamilselvan@gmail.com  |9865273529  |
 |vptamilselven@gmail.com  |85296374185 |
 |98652@gmail.com					 |Potato      |
 |Softwaretesting@gmsil.com|852963      |
 |rpchandru2002@gmail.com  |7410852963  |
 |rpchandru2002@gmail.com  |9787425965  |
 