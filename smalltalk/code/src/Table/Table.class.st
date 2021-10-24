Class {
	#name : #Table,
	#superclass : #Object,
	#instVars : [
		'hasHeaders',
		'headers',
		'numRows',
		'numCols',
		'data'
	],
	#category : #Table
}

{ #category : #adding }
Table >> addRow: newRow [
	"adds a string row '123 -0.2 salmon 9h8fs0' to the end of the table"
	| cellFactory |
	cellFactory := CellFactory new.
	data add: ((newRow splitOn: '\s+' asRegex) collect: [ :v | cellFactory create: v ]).
	numRows := numRows + 1.
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

{ #category : #printing }
Table >> print [
	"Returns the name of this table for debugging."	
			
	| headersName bodyName name |
	headersName := ' ' join: headers.
	bodyName := (String cr) join: ( data collect: [ :row | ' ' join: (row collect: [ :cell | cell getValue ]) ] ).
	
	name := headersName, String cr, bodyName, String cr.
	^ name.
]

{ #category : #printing }
Table >> print: cols [
	"Returns a new Table with only the given comma delimited cols '0,2,5'."	
			
	| indexes newTable |
	indexes := (cols splitOn: ',') collect: [ :i | (i asNumber) + 1 ].
	newTable := self class new.
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

{ #category : #enumerating }
Table >> sum: col [
	"Adds the values in the given row into a cell and returns the value."	
	| sum cell |
	sum := 0.
	data do: [ :row | sum := sum + ((row at: col) getValue) ].
	cell := NumericCell new.
	cell setValue: sum.
	^ cell getValue.
]
