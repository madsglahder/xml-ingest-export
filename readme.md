# Project for learning to ingest XML

Project contains program for reading, altering and writing an xml.

Also added various functions for reading settings and making my life easier.
One instance of this is the nested class structure of the xml which provides a nested view of getters
and setters, which follows the structure of the original xml making it possible to recreate the form.

Settings can either be put in settings.json or loaded from any json containing a key:value pair "xmlpath": "Path/to/xml".
Alternatively provide both filepath and json key. I'm not sure what scenario this would be useful in but now I've thought about it and it's going in.

Forms are loaded and can be changed in either with direct data input or randomized. Everything is made with future API hooks in mind.