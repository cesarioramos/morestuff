Feature: Cancellation Policy

As a financial administrator
I want to see the cancellation penalty when a reservation is cancelled
So that I can create an invoice


Scenario: Normal Customer with over 5000 euro reservation.

Given a normal customer
And given a reservation fee of 5001 dollars
When the customer cancels 14 days before arrival date
Then ensure the cancellation penalty is 37.50 dollars

Scenario: ListTest
Given a list
|apple|1|
|banana|2|

