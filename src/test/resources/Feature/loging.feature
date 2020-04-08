Feature: To validate the login functionality

  Scenario Outline: To verify whether the user can able to login with all possible combination
    Given User has to be in the login
    When User has to enter "<username>","<password>" and click the login button
    Then User has to find error page

    Examples: 
      | username | password |
      | sridhar  |  1234567 |
      | sampath  |  0987654 |
      | sri      |     6789 |
