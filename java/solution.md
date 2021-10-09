## Assumptions

1. Actions must always be valid, even if the row is not explicitly called in an action command. 

For example, the following is expected to result in a DAG ERROR:

in.txt
```
A                   B                   C
__to_upper__([0,1]) __to_lower__([0,0]) some_text
123                 456                 789
```

`./simple -header -action 2 in.txt out.txt`

2. The results of executing __sum__ on Cells of type int results in an int. However if there is at least one float, the results will be of type float

For example

in.txt
```
A B   SUM
1 2   __sum__([0,0],[0,1])
1 2.0 __sum__([0,0],[0,1])
```

`./simple -header -action 2 in.txt out.txt`

out.txt
```
A B   SUM
1 2   3
1 2.0 3.0
```

3. The result of executing __avg__ is always of type float

For example

in.txt
```
A B   AVG
2 2 __avg__([0,0],[0,1])
1 2 __avg__([0,0],[0,1])
```

`./simple -header -action 2 in.txt out.txt`

out.txt
```
A B AVG
2 2 2.0
1 2 1.5
```

4. Output always "cleans up" the format of a float cell

For example

in.txt
```
A
1.
01.000
```

`./simple -header -print 0 in.txt out.txt`

out.txt
```
A
1.0
1.0
```

5. String cells can look like actions

The following are all examples of valid string cells:
```
- `__sum__(love)`                         | <- Numeric Action arguments should be pairs of ints 
- `__sum__([1,2,3])`                      |    and should be delimited by commas
- `__sum__([1, 2])`                       |
- `__to_upper__([1,2],[3,4])`               <- String actions should only have one argument 
- `__i_love_programming__([1,2],[3,4])`     <- This action is not defined (but it should XD)
- `__SUM__([1,2],[3,4])`                    <- Actions must be lowercase
```