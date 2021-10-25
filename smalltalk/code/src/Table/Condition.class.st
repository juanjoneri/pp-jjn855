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

{ #category : #accessing }
Condition >> getOp [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
	^ op.
]

{ #category : #parsing }
Condition >> parse: input [
	"Populates the condition given an input such as '==$1,some_string' or '<>@header_name,5'"
	| matcher groups opName left right |
	
	matcher := '(==|<>|<|>)([$@]?\w+),([$@]?\w+)' asRegex.
	groups := (matcher matches: input) ifTrue:
		[Array
			with: (matcher subexpression: 2)
			with: (matcher subexpression: 3)
			with: (matcher subexpression: 4)].

	opName := groups at: 1.
	left := groups at: 2.
	right := groups at: 3.

	self parseOp: opName.
	self parseOperand: left.
	self parseOperand: right.
]

{ #category : #parsing }
Condition >> parseOp: opName [
	op := opName = '==' ifTrue: [ #EQ ] ifFalse: [ 
			opName = '<>' ifTrue: [ #NEQ ] ifFalse: [ 
			opName = '<' ifTrue: [ #LT ] ifFalse: [ #GT ]]].
]

{ #category : #parsing }
Condition >> parseOperand: operand [
	| matcher groups cellFactory|
	cellFactory := CellFactory new.
	matcher := '([$@]?)(\w+)' asRegex.
	groups := (matcher matches: operand) ifTrue:
		[Array
			with: (matcher subexpression: 2)
			with: (matcher subexpression: 3)].
		
	(groups at: 1) = '$' ifTrue: [ colNum := ((groups at: 2) asNumber) ] ifFalse:
	[ (groups at: 1) = '@' ifTrue: [ colName := (groups at: 2) ] ifFalse:
	[ (groups at: 1) = '' ifTrue: [ constant := (cellFactory create: (groups at: 2)) ]]].
]

{ #category : #printing }
Condition >> print [
	"Returns the name of this Condition."	
	| name col |
	col := (colName ifNil: ['$', colNum asString] ifNotNil: ['@', colName]).
	name := 'Program:', String cr.
	name := name, 'op: ' , op, String cr.
	name := name, 'col:  ' , col , String cr.
	name := name, 'constant: ' , ((constant getValue) asString), String cr.
			
	^ name.
]
