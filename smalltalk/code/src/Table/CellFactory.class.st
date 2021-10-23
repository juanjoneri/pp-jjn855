Class {
	#name : #CellFactory,
	#superclass : #Object,
	#category : #Table
}

{ #category : #factory }
CellFactory >> create: value [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
			
	| cell |
	
	(('\d+' asRegex) matches: value) 
		ifTrue: [ cell := NumericCell new ] ;
		ifFalse: [ cell := StringCell new ].
	cell setValue: value.
	^ cell.
]
