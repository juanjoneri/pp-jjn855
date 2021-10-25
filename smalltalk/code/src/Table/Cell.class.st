"
A cell represents an entry in the Table.
"
Class {
	#name : #Cell,
	#superclass : #Object,
	#instVars : [
		'type',
		'value'
	],
	#category : #Table
}

{ #category : #accessing }
Cell >> getValue [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
			
	^ value.
]

{ #category : #initialization }
Cell >> setValue: newValue [
	"Sets the value of this cell. Type must be string."	
	value := newValue isString 
		ifTrue: [ newValue ]
		ifFalse: [ newValue asString ].
]
