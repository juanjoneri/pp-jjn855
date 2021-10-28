"
A Table like an excel spreadsheet.
"
Class {
	#name : #Table,
	#superclass : #Object,
	#instVars : [
		'hasHeaders',
		'headers',
		'numRows',
		'numCols',
		'data',
		'logger'
	],
	#category : #Table
}

{ #category : #adding }
Table >> addRow: newRow [
	"adds a string row '123 -0.2 salmon 9h8fs0' to the end of the table"
	| cellFactory splitRow |
	cellFactory := CellFactory new.
	splitRow := newRow splitOn: ('\s+' asRegex).
	(numCols = 0) ifTrue: [ numCols := (splitRow size) ]  
					  ifFalse: [ numCols = (splitRow size) ifFalse: [ logger logNumColsError ] ].
	
	data add: (splitRow collect: [ :v | cellFactory create: v ]).
	numRows := numRows + 1.
]

{ #category : #checking }
Table >> checkColIndex: each [
	((each < 1) or: (each > numCols)) ifTrue: [logger logColIndexError ].
]

{ #category : #accessing }
Table >> getCol: name [
	"returns the index of the column with the given header."	
	(headers includes: name) ifTrue: [ ^ headers indexOf: name ] ifFalse: [ logger logColIndexError ].
]

{ #category : #initialization }
Table >> initialize [
	"Initialize table with default values."
	hasHeaders := false.
	headers := OrderedCollection new.
	numRows := 0.
	numCols := 0.
	data := OrderedCollection new.
	
	
]

{ #category : #parsing }
Table >> parseTable: table withHeaders: parseHeaders [
	hasHeaders := parseHeaders.
	hasHeaders ifTrue: [ self setHeaders: (table at: 1) ].
	hasHeaders ifTrue: [ table removeAt: 1 ].
	table do: [ :each | self addRow: each ].
]

{ #category : #printing }
Table >> print [
	"Returns a string representation of everything in the table."	
			
	| bodyName name |	
	name := String new.
	hasHeaders ifTrue: [ name := name, (' ' join: headers), String cr ].
	bodyName := (String cr) join: ( data collect: [ :row | ' ' join: (row collect: [ :cell | cell getValue ]) ] ).
	
	name := name, bodyName, String cr.
	^ name.
]

{ #category : #printing }
Table >> print: cols [
	"Returns a new Table with only the given comma delimited cols '0,2,5'."	
			
	| indexes newTable |
	indexes := (cols splitOn: ',') collect: [ :i | (i asNumber) + 1 ].
	
	indexes do: [ :each | self checkColIndex: each].
	
	newTable := self class new.
	newTable setLogger: logger.
	hasHeaders ifTrue: [ newTable setHeaders: (' ' join: ( headers withIndexSelect: [:v :i | indexes includes: i ] ) ) ].
	data withIndexDo: [ :r :i | newTable addRow: (' ' join: ( (self printRow: i) withIndexSelect: [ :v :c | indexes includes: c ] ) ) ].
	^ newTable.
]

{ #category : #printing }
Table >> printRow: row [
	"Returns a string representation of the cells in the given row."	
	^ (data at: row) collect: [ :cell | cell getValue ].
]

{ #category : #initialization }
Table >> setHeaders: newHeaders [
	"Upserts the headers of this table from string form like '1 header-B 3'"
	headers := newHeaders splitOn: '\s+' asRegex.
	numCols := headers size.
	hasHeaders := true.
]

{ #category : #initialization }
Table >> setLogger: errorLogger [
	logger := errorLogger.
]

{ #category : #enumerating }
Table >> sum: col [
	"Adds the values in the given row into a cell and returns the value."	
	| sum cell colNumber |
	colNumber := (col asNumber) + 1.
	self checkColIndex: colNumber.
	data do: [ :row | ((row at: colNumber) class) = NumericCell ifFalse: [ logger logTypeError ] ].
	
	sum := 0.
	data do: [ :row | sum := sum + ((row at: colNumber) getValue) ].
	cell := NumericCell new.
	cell setValue: sum.
	^ (cell getValue) asString.
]

{ #category : #scripting }
Table >> when: exp [
	"Returns a new table with rows matching the given condition."
	| condition newTable col constant op |
	condition := Condition new.
	condition setLogger: logger.
	condition parse: exp.	
	col := condition colNum ifNotNil: [ (condition colNum) + 1] ifNil: [ self getCol: (condition colName) ].
	self checkColIndex: col.
	constant := condition constant.
	op := condition op.
	
	newTable := self class new.
	newTable setLogger: logger.
	hasHeaders ifTrue: [newTable setHeaders: (' ' join: headers) ].
	data withIndexDo: [ :row :index | (op value: (row at: col) value: constant) ifTrue: [ newTable addRow: (' ' join: (self printRow: index)) ] ].
	^ newTable.
]
