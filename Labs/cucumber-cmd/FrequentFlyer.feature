Feature: ClassDemo

As a frequent flyer
I want to cancel a reservation
So that I can get my money back

Scenario: Frequent Flyer with over 5000 reservation

Given a frequent flyer "cesario"
And given a reservation of 6000 dollar
When the reservation is cancelled
Then the frequent flyer gets 6000 dollar back

Scenario Outline: Frequent flyer

Given a frequent flyer <name>
And given a reservation of <reservation> dollar
When the reservation is cancelled
Then the frequent flyer gets <refund> dollar back

Examples:
|name     |reservation|refund|
|"cesario"|5000       | 5000 |
|"pascal" |9000       | 9000 |


Scenario: Frequent Flyer with less then 5000 reservation

Given a frequent flyer "cesario"
And given a reservation of 6000 dollar
When the reservation is cancelled
Then the frequent flyer gets 5500.5 dollar back
