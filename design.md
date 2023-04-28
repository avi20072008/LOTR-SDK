# Lord of the Rings (LOTR) SDK Design 

# Introduction
This document provides an introduction to use LOTR SDK.
By using this guide, you can use LOTR SDK in your Java applications.  

# Scope
This SDK has limited functionality to provide LOTR movie names and quotes provided by “The One API”

# SDK information
This SDK is developed in Java. A Jar file will need to add to your project as an external dependency. 

This jar file will expose an Interface IRepository. This interface exists in src.lotr package. 
        IRepository lotrapi = new LordOfTheRingAPI();

Client applications can use this interface to interact with different methods.

There are 5 endpoints exposed via interface. You can access them as methods.
1.	getAllMovies() 
2.	getMovieById(String movieId)
3.	getAllMovieQuotes()
4.	getMovieQuotesByQuoteId((String quoteId)
5.	getMovieQuoteByMovieId(String movieId)

These methods internal make HTTP request to The One API.

# Extensibility 
SDK uses abstractions in a such way that it can be further extended without changing existing code.

# Usage
You can check GitHub docs @ https://github.com/avi20072008/LOTR-SDK

# Limitations 
This SDK has external dependency on “The One API”. You can visit here https://the-one-api.dev/   If the One API does not work, this SDK will not work. 
