Feature: Customer Withdraws Cash.

As a Customer
I want to withdraw cash from an ATM
So that I do not have to wait in line at the bank.

Scenario: Account is in credit

Given the account has 12 dollars in credit
And given the dispenser contains 1000 dollars
When the customer withdraws 10 dollars
Then ensure the account contains 2 dollars
And ensure cash is dispensed from the dispenser
And the dispenser should have 990 dollars


Scenario: Account cannot be negative

Given the account has 10 dollars in credit
And given the dispenser contains 1000 dollars
When the customer withdraws 15 dollars
Then ensure the account contains 10 dollars
And the dispenser should have 1000 dollars