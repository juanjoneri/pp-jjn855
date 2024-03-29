
Design a set of functions for manipulating data given in a tabular
format.  As part of the assignment, you will also develop a main
*program* that will leverage the functions.

*IMPORTANT* differences from previous assignments:

- All classes that you develop should be placed in the "Table"
  package.  There should also be a class called "TableMain" that has a
  "main" method; this is the method that we will be invoking.
  
- Error messages are printed to a file called stdout.txt, located in
  the same directory as the input table file.
  
- You will not be directly submitting the Pharo image, but you should
  submit the exported code.  See the submission instructions in the
  video published on Canvas and at the end of this README.



### INPUT(s)

One of the key inputs to your program is going to be a .txt file that
contains a table.  Keep in mind that the input might not be well
formatted.  Counting rows and columns in the table starts with 0; if a
table has a header, then the header is ignored when indexing into the table.


### TABLE FORMAT

Here is an example of a table (in a .txt file):

```
1 3 5
2 4 7
22 30 50
```

The table above has 3 rows and 3 columns. but it can have any number
of rows and columns and the numbers do not need to match.  The table
can also be empty.

If the number of columns in all rows is not the same, you should print
"NUM COLS ERROR".

The input table can also have a header like in the example below:

size group age
1 3 5
2 4 7
22 30 50

Each cell of a table can be one of the following:

  an integer (as defined by the Smalltalk programming language)

  a floating point number (as defined by the Smalltalk programming language)

  a string (anything that does not fit into other types).  Each string
  is a sequence of characters that ends with a white space char; "abc"
  is a valid string and "a bc" are two strings "a" and "bc".  Strings
  are *not* quoted in the input file.

A single table can contain various types (and there is no requirement
that all values in one row or column need to have the same type).

Below is an example of a table with various types and actions.

1 3 abz
2 4 4.0

In this example, we have a table with 2 rows and 3 columns.  Most of
the values are integers (1, 2, 3, 4), but one cell is a string (abz),
and one cell is a floating point number (4.0).


### PROGRAM

A user can invoke your program with the following options:

  (a) ./simple [-header] -print COLS TABLE_FILE OUT_FILE
      -header is optional and says that the input table has a header
      COLS (int) is a comma separated list of column indexes to print; at least one index is given and there are no white spaces between indexes
      TABLE_FILE is the path to the input table
      OUT_FILE is the path where you should store the result

      The output of this invocation should include the specified
      columns of the original table (preserving the order of both
      columns and rows as in the original table).  If a user provides
      an invalid value for COLS, print "COL INDEX ERROR" to stdout.txt.

      Ignore the header during computation, but print the relevant
      headers to the resulting file.

  (b) ./simple [-header] -sum COL TABLE_FILE OUT_FILE
      -header is optional and says that the input table has a header
      COL (int) is the index of the column to sum
      TABLE_FILE is the path to the input table
      OUT_FILE is the path where you should store the result

      The result in this case is the sum of all the cells in the given column.

      If types of any cell in the column cannot be used for the sum
      function (i.e., strings), print "TYPE ERROR" to stdout.txt.

      If COL has an invalid value, then print "COL INDEX ERROR" to stdout.txt.

      Ignore header if present and do not print any of them to the output.

   (c) ./simple [-header] -when COND TABLE_FILE OUT_FILE
      -header is optional and says that the input table has a header
      COND is a condition to specify what rows to include in the resulting file; this input is given as a string without white spaces
      TABLE_FILE is the path to the input table
      OUT_FILE is the path where you should store the result

      The result is a table (only rows for which the given condition
      is satisfied) written to the OUT_FILE.

      If COND is not well formed, print "COND ERROR".
      If when cannot be evaluated because of type, then default to "false".

      Format for condition:

          COND -> OP OPERAND "," OPERAND
          OPERAND -> $COL_NUM | @COL_NAME | CONSTANT
          OP -> "<" | ">" | "<>" | "=="
          CONSTANT - int const, float const or string const

      Examples:
          ==$1,some_string # every row where column 1 is equal to "some_string"
          <>@header_name,5 # every row where column with the given header is not equal 5

      Ignore header during computation, but print the relevant headers
      to the resulting file.


### SAMPLE TESTS

We provide some sample tests. See "tests" for all table and output files.

./simple -print 0 1.txt 1.out

./simple -header -sum 1 2.txt 2.out


### GENERAL

You are required to use Pharo 9 (https://pharo.org/download).

All classes that you develop should be placed in the "Table" package.
There should also be a class called "TableMain" that has a "main"
method; this is the method that we will be invoking.

If you detect any other error not specified in this README, then print
"OTHER ERROR" to stdout.txt.

stdout.txt should be in the same directory as the input table file.

We will use Linux to test all assignments.  If you do not test on
Linux, we might see different result from you.

Be creative.  When something is unclear make a reasonable assumption.

Also, do not try to cover everything at once; start with small
examples and then expand from there.

In your implementation, you can use standard libraries available in
Pharo 9, but you cannot use any third-party libraries/code.


### SUBMISSION INSTRUCTIONS

Please first check the submission instructions video published on
Canvas.  This section provides the starter code for exporting that
appeared in the video.

In package BaselineOfTable, class BaselineOfTable:
```
BaselineOf subclass: #BaselineOfTable
	instanceVariableNames: ''
	classVariableNames: ''
	package: 'BaselineOfTable'
```

BaselineOfTable should have two instance methods. 
Method baseline:
```
baseline: spec
	<baseline>
	spec
		for: #common
		do: [ spec package: 'Table' ]
```

Method projectClass:
```
projectClass 
	^ MetacelloCypressBaselineProject
```

In package Table, class TableMain (you can change this):
```
Object subclass: #TableMain
	instanceVariableNames: ''
	classVariableNames: ''
	package: 'Table'
```

TableMain's method main (you can change this):
```
main: message
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"
	| working stream |
	working := FileSystem disk workingDirectory.
	stream := (working / 'stdout.txt') writeStream.
	stream nextPutAll: message; lf.
	stream nextPutAll: 'over'; lf.
	stream close.
```

* In your program, you should figure out the directory of input table
  file and output stdout.txt to the same directory.
