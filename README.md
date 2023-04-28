# LOTR-SDK - Lord of the Rings SDK

This SDK Provides all LOTR movies and movie quotes

# Description 

This SDK provides different API operations. This is Java based project. 


# Getting Started 

# About the Project 
You can use it to get LOTR movie names and quotes from the movies.


# Using LOTR SDK 

Step 1 : Download the lotr_sdk.jar file. 

Step 2 : Create sample Java project and add lotr_sdk.jar file as “External Jar” dependency to your project.

Right Click your Sample Java project -> Properties -> Libraries -> under Modulepath option add this jar. Click Apply and Close button.

Step 3 : You should see jar file is added in the “Referenced Libraries”.

Step 4 : Inside your sample project, add below code to test various methods provided by SDK.

	import src.lotr.IRepository;
	import src.lotr.LordOfTheRingAPI;

	IRepository lotrapi = new LordOfTheRingAPI();
         
	// Get all LOTR movies 
	lotrapi.getAllMovies();

	// Get LOTR movie by Id
         lotrapi.getMovieById("5cd95395de30eff6ebccde57");

	// Get LOTR movie quotes
         lotrapi.getAllMovieQuotes();

	// Get LOTR movie quote by quote Id
         lotrapi.getMovieQuotesByQuoteId("5cd96e05de30eff6ebcce7f1");

	// Get LOTR movie quote by movie Id
         lotrapi.getMovieQuoteByMovieId("5cd95395de30eff6ebccde57");


# Help 

If you need any help, reach out to avi_patil22@yahoo.com

# License 

No license required. Have fun!!

