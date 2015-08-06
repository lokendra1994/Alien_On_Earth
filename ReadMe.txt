To run the project :-

javac AlienOnEarth.java
java AlienOnEarth
To add a new plugin :-

1. Make a new class and name it ExportFormatName
2. Extend Export class to ExportFormatName
3. Add a new else-if statement for new plug in format in Exporting Method of AlienOnEarth class
4. Add this code to else-if 
   export = new ExportFormatName();
   export.ExportAlien(alienList);