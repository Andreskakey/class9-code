# README.md

Based on [notes](http://csis.pace.edu/~bergin/patterns/strategydecorator.html) by Joseph Bergin

## To Do:

* _review_ the reading linked above
* _predict_ what this application will do when it is run (you should be able to figure this out just by looking at Driver.java)
* _run_ the application and make sure you understand why it does why it does
* carry out the _exercises below_ (derived from the reading)
* do the _bonus exercise_

### Exercises

1. Parameterize the class `StartWithT`, giving it a name that reflects its behavior.

2. Write a "saving decorator" that will save in a `Vector` all of the words from the input for which the decorated Strategy object returns true, and all the other words in another vector. Of course, the decorator should have methods to provide access to those Vectors.

3. Write a boolean reversing decorator for our simple strategies that returns true when the `Strategy` object it decorates returns false, and conversely.

4. Write a logical OR composite for `CheckStrategy`. It should return true if any of its parts return true. Otherwise it should return false. What should be returned from an OR composite if you don't add any strategies to it?

5. Revise main to return a count of how many words in the `gutenberg.txt` file are palindromes longer than 6 characters. Use strategies, of course, but do it two ways: one using the AND composite and one using the OR composite.

### Bonus Exercise

Suppose that instead of dealing with a file full of words, you're dealing a text file containing integer values, one per line, like

```
137
29
-14
98
4321
```

a) Define a new interface `CheckIntStrategy`, which you can use to check integer values (rather than `String`s)

b) Define an `IsOddStrategy` class which extends `CheckIntStrategy`. Add a datafile `numbers.txt` to this project, and put a bunch of integers (like 10 or 20) in it. Write an `IntDriver` class that uses the `IsOddStrategy` to output the odd numbers in your file.

c) Now, write an `OldSchoolIsOddStrategy` class which extends `CheckStrategy` (that is, the one that works on `String`s) and, when run on `numbers.txt` produces exactly the same results as `IsOddStrategy`.

### Submission

To turn this in, first change the name of the Eclipse project to be <lastname>-DesignPatterns (for example, Dexter-DesignPatterns). Then under the File... menu select Export... then "Archive File" and save the file as a .zip file. Email this file to me by the end of the day on the third day after the lab (that is, either Friday or Sunday).