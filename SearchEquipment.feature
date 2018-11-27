Feature: Search for an equipment
The system provides list of available equipments based on search criteria to the user
	Scenario: Search by Equipment Tag
	Given Barcode Equipment tag
	When Valid Barcode Equipment tag
	Then Display the Equipment 
	
	Scenario: Search by Sequence Number
	Given  Sequence Number
	When Valid  Sequence Number
	Then Display the Equipment 
	
	Scenario: Search by Machine Id
	Given Machine Id
	When Valid Machine Id
	Then Display the Equipment 
	
	Scenario: Search by User Id
	Given User Id
	When Valid User Id
	Then Display the Equipment 
	
	Scenario: Search by Location
	Given Location
	When Valid Location
	Then Display the Equipment 