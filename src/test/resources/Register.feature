Feature: Signin

   @Register
   Scenario: submit with all valid fields
   Given I goto URL as "https://www.d3dsecurity.co.uk"
    When I Click Register Button
   Given Enter Firstname as "Testfirstname"
    Given Enter Lastname as "Testlastname"
    Given Enter email id as "Testfirstname@gmail.com"
    Given Enter password as "123456"
    Given Enter confirm password as "123456"
    When click Register Button
   # Then I should see my Account Button
   # Then I should see my Logout Button
   # Then I should see firstname as header
   # Then I should not see the signin Button








