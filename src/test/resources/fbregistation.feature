Feature: To validate the account creation of fb applicatiom
@Sanity
Scenario: To create new account 
Given To launch the browser and maximise the window
When To launch the url of fb application
And To click the create new account button


#One dimensional map data

And To pass firstname in firstname text box
|firsrname1|inmakes|
|firstname2|Tamil|
|firstname3|Selvan|
|firstname4|Manoj|

And To pass secondname in secondname text box

#Two dimensional map data

And TO pass mobileno or email in email text box

|password1|password2|password3|
|vptamilsel@gmail.com|741258|mohan@gmail.com|
|Manoj@gmail.com|963258|Kumar@gmail.com|
|friend@gmail.com|741852|MNBV@gmail.com|

And To create new password using new password text box
Then To close the chrome browser