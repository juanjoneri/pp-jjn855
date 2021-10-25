"
Used to parse conditions of the form:
```
COND -> OP OPERAND "","" OPERAND
OPERAND -> $COL_NUM | @COL_NAME | CONSTANT
OP -> ""<"" | "">"" | ""<>"" | ""==""
CONSTANT - int const, float const or string const
```

For example:
```
==$1,some_string # every row where column 1 is equal to ""some_string""
<>@header_name,5 # every row where column with the given header is not equal 5
```

"
Class {
	#name : #Condition,
	#superclass : #Object,
	#instVars : [
		'op',
		'colNum',
		'colName',
		'constant'
	],
	#category : #Table
}

{ #category : #parsing }
Condition >> parse: input [
	"Populates the condition given an input such as '==$1,some_string' or '<>@header_name,5'"
	| cell |
	(('==.+' asRegex) matches: input) ifTrue: [ op := #EQ ].
	(('<>.+' asRegex) matches: input) ifTrue: [ op := #EQ ].
	(('>.+' asRegex) matches: input) ifTrue: [ op := #EQ ].
	(('<.+' asRegex) matches: input) ifTrue: [ op := #EQ ].
]
