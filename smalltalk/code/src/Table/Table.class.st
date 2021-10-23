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
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"
	| cellFactory |
	cellFactory := CellFactory new.
	data add: ((newRow splitOn: '\s+' asRegex) collect: [ :v | cellFactory create: v ]).
	numRows := numRows + 1.
]

{ #category : #initialization }
Table >> initialize [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"
	hasHeaders := false.
	headers := OrderedCollection new.
	numRows := 0.
	numCols := 0.
	data := OrderedCollection new.
	
	
]

{ #category : #printing }
Table >> print [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
			
	| headersName bodyName name |
	headersName := ' ' join: headers.
	bodyName := (String cr) join: ( data collect: [ :row | ' ' join: (row collect: [ :cell | cell getValue ]) ] ).
	
	name := headersName, String cr, bodyName, String cr.
	^ name.
]

{ #category : #initialization }
Table >> setHeaders: newHeaders [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"
	headers := newHeaders splitOn: '\s+' asRegex.
	numCols := headers size.
	hasHeaders := true.
]

{ #category : #enumerating }
Table >> sum: col [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
	| sum |
	sum := 0.
	data do: [ :row | sum := sum + ((row at: col) getValue) ].
	^ sum.
]
