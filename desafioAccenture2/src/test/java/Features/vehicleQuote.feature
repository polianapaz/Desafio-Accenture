Feature: Vehicle Insurance

  @quote
  Scenario: Generate vehicle quote
    Given I access "http://sampleapp.tricentis.com/101/app.php" webpage
    When I fill out the form in the "Enter Vehicle Data" tab
    When I fill out the form in the "Enter Insurant Data" tab
    When I fill out the form in the "Enter Product Data" tab
    When I fill out the form in the "Select Price Option" tab
    When I fill out the form in the "Send Quote" tab
    Then A “Sending e-mail success!” message is displayed