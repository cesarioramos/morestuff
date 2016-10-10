Feature: Cancellation Policy

As a financial administrator
I want to see the cancellation penalty when a reservation is cancelled
So that I can create an invoice


Scenario Outline: Normal Customer

Given a normal customer
And given a reservation fee of <amount> dollars
When the customer cancels <cancel date> days before arrival date
Then ensure the cancellation penalty is <penality amount> dollars

  Examples:
  |amount|cancel date|penalty amount|
  |5001  |10         | 37            |
  |5001  |10         | 37.50         |
  |5000  |10         | 30            |
