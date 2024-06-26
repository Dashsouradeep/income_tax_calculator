Tax Calculator

Description

This Java program calculates the annual tax based on the user's annual income. It uses different tax classes to calculate the tax for various income brackets.
Classes and Methods

Classes

Tax0: Handles income less than or equal to 300,000.

Tax1: Handles income greater than 300,000 and less than or equal to 600,000.

Tax2: Handles income greater than 600,000 and less than or equal to 900,000.

Tax3: Handles income greater than 900,000 and less than or equal to 1,200,000.

Tax4: Handles income greater than 1,200,000 and less than or equal to 1,500,000.

Tax5: Handles income greater than 1,500,000.
Methods

Each class has a method taxcalc(double sal) that calculates the tax based on the provided salary (sal).

Tax Brackets

Tax0: No tax for income less than or equal to 300,000.

Tax1: 5% tax for income greater than 300,000 and less than or equal to 600,000.

Tax2: 15,000 plus 10% tax for income greater than 600,000 and less than or equal to 900,000.

Tax3: 45,000 plus 15% tax for income greater than 900,000 and less than or equal to 1,200,000.

Tax4: 90,000 plus 20% tax for income greater than 1,200,000 and less than or equal to 1,500,000.

Tax5: 150,000 plus 30% tax for income greater than 1,500,000.

Usage

Compile the Java program using javac Taxcalculator.java.

Run the program using java Taxcalculator.

Enter your annual income when prompted.

The program will output your calculated annual tax.

