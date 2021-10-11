## Assumptions

### 1. Actions must always be valid, even if the row is not explicitly called in an action command. 

For example, the following is expected to result in a DAG ERROR:

in.txt
```
A                   B                   C
__to_upper__([0,1]) __to_lower__([0,0]) some_text
123                 456                 789
```

`./simple -header -action 2 in.txt out.out`

### 2. The results of executing __sum__ on Cells of type int results in an int. However if there is at least one float, the results will be of type float

For example

in.txt
```
A B   SUM
1 2   __sum__([0,0],[0,1])
1 2.0 __sum__([0,0],[0,1])
```

`./simple -header -action 2 in.txt out.out`

out.out
```
A B   SUM
1 2   3
1 2.0 3.0
```

### 3. The result of executing __avg__ is always of type float

For example

in.txt
```
A B   AVG
2 2 __avg__([0,0],[0,1])
1 2 __avg__([0,0],[0,1])
```

`./simple -header -action 2 in.txt out.out`

out.out
```
A B AVG
2 2 2.0
1 2 1.5
```

### 4. Output always "cleans up" the format of a float cell

For example

in.txt
```
A
1.
01.000
```

`./simple -header -print 0 in.txt out.out`

out.out
```
A
1.0
1.0
```

### 5. String cells can look like actions

The following are all examples of valid string cells:
```
- `__sum__(love)`                         | <- Numeric Action arguments should be pairs of ints 
- `__sum__([1,2,3])`                      |    and should be delimited by commas
- `__sum__([1, 2])`                       |
- `__to_upper__([1,2],[3,4])`               <- String actions should only have one argument 
- `__i_love_programming__([1,2],[3,4])`     <- This action is not defined (but it should XD)
- `__SUM__([1,2],[3,4])`                    <- Actions must be lowercase
```

### 6. An OP file can have at most one print or sum operation and it must be the last operation in the file

For example:

op.txt
```
-action 1
-sum 1    # Sum can only be used as the very last statement
-print 1
```

`./simple op.txt in.txt out.out` is not valid

### 6. An OP file must have 1 operation per line with the form `-OP_NAME`. Each line may have comments delimited by an `#`

For example:

op.txt
```
-action 1     # execute actions in column 1
-when ($1>55) # only include rows when the first column is greater than 55
```

`./simple op.txt in.txt out.out` is valid

op.txt
```
action 1      # missing token `-` before name `action`
-when ($1>55)
```

`./simple op.txt in.txt out.out` is not valid

### 7. `when` conditions if checked against an "action" cell be compared against the result of that cell

For example:

in.txt
```
A                    B  C
__sum__([0,1],[0,2]) 10 12
32                   -1  133
```

`./simple -header -when ($0==22) in.txt out.txt` will output

out.txt
```
A                    B  C
__sum__([0,1],[0,2]) 10 12
```

### 8. `when` conditions compare ints and floats as expected

The below examples are all true:
```
1 < 1.1
1.0 < 2
1 = 1.0
```

### 9. `when` conditions with a string parameter for grater than or equals will always be false

The below examples are all false:
```
"A" < "B"
"A" < "AA"
"A" > 1
"2" > 1
```

### 9. `when` conditions always interpret $int as a COL_NUM and not a COL_NAME

For example

in.txt
```
1 2 3
O O X
O X O
X O O
```

`./simple -header -when ($2==X) in.txt out.txt` will output

out.txt
```
1 2 3
O O X
```
