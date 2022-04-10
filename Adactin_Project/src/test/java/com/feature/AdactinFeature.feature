Feature: Adactin Hotel Application

Scenario: Login Functionality
Given User Launch The Adactin Application
When User Enters The Username In The InputBox
And User Enters The Password In The InputBox
And User Clicks The Login Button And It Navigates To The SearchHotel Page

Scenario: Search Hotel Functionality
When User Selects The Location From The Dropdown
And User Selects The Hotels From The Dropdown
And User Selects The Roomtype From The Dropdown
And User Selects The Number Of Rooms From The Dropdown
And User Clear And Enters Checkin Date In The InputBox
And User Clear And Enters Checkout Date In The InputBox
And User Selects The Adultsperroom From The Dropdown
And User Selects The Childrenperroom From The Dropdown
Then User Clicks The Search Button And It Navigates To The SearchHotel Page

Scenario: Select Hotel Functionality
When User Verifies The Details and Selects The RadioButton
Then User Click The ContinueButton And It Navigates To Book A Hotel Page

Scenario: Book A Hotel Functionality
When User Enters The FirstName In The InputBox
And User Enters The Lastname In The InputBox
And User Enters The Billing Address In The InputBox
And User Enters The Credit Card No In The InputBox
And User Selects The Credit Card Type From The Dropdown
And User Selects The Expiry Date And Year From The Dropdowns
And User Enters The CVV Number In The InputBox
Then User Clicks The BookNow Button And It Navigates To Booking Confirmation

Scenario: Booking Confirmation
When User Selects The MyItinerary Button And It Navigates To Booked Itenarary Page
But User Clicks The Logoout Button

Scenario: Booked Itinerary Functionality
When User Verifies the Details And Checks The CheckBox
And User Clicks The SearchHotel Button



 