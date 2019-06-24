Feature: UI test

@testOne
Scenario: open Browser
	Given i open browser
	Then i wait for ten seconds
	Then i search for the product
	Then i wait for ten seconds
	Then i click on the product and verify details and add the product to basket
	Then i wait for ten seconds
	Then i validate voucher code details
	Then i wait for ten seconds
	Then i validate the login options
