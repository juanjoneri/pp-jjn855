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
	data add: (newRow splitOn: '\s+' asRegex).
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
	bodyName := (String cr) join: ( data collect: [ :row | ' ' join: row  ] ).
	
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
