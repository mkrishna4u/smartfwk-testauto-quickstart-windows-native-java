#
# @Author Ajita Krishna
#
@StandardModeTests
Feature: Verify Standard calculator functionality.
	This feature will be used to verify Standard calculator functionality.
	
	@RegressionTest
	Scenario Outline: Verify arithmatic operations of 2 numbers.
		Given Calculator is already opened.
		Given Standard menu item is already selected.
		When User clicks on <Number1> <Operator> <Number2> = buttons.
		Then The <Result> is displayed on result textbox.		
		Examples:
			| Number1 | Operator | Number2 | Result |
			| 34      | '+'      | 56      | 80     |
			| 64      | '+'      | 156     | 220    |
			| 50      | '*'      | 10      | 50    |
			
	
	