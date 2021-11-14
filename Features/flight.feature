@Test
Feature: Round Trip Tickets

Scenario: End to End flow of tickets booking
   Given User able to access Kayak link
   When User logged into kayak page
   Then user provides the From and To details
   And User provides the date range 
   And user click on search button
  
Scenario: Tickets with Low Price any random number
   Given User able to access Kayak link
   When User logged into kayak page
   Then user provides "Hyd" in From details
   And user provides "Kra" in To details
   And user provides Departure date Low price "3"
   And user provides return date Low price "6"
   And user click on search button
   
Scenario: Tickets with High price
   Given User able to access Kayak link
   When User logged into kayak page
   Then user provides "Hyd" in From details
   And user provides "Kra" in To details
   And user provides Departure date High price "25"
   And user provides return date High price "10"
   And user click on search button
@TestNew   
Scenario Outline: Check with multiple set of data
   Given User able to access Kayak link
   When User logged into kayak page
   Then user provides <From> in from details
   And user provides <To> in to details
   And user provides Departure date Low price <depDate>
   And user provides return date Low price <returnDate>
   And user click on search button
Examples: 
 | From | To   | depDate | returnDate |
 | hyd  | kra  | 3       | 4          |
 | dub  | mun  | 5       | 7          |