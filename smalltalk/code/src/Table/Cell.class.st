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

{ #category : #comparing }
Cell >> eq: other [
	"is this cell representing the same value as another cell?"	
	^ ((self getType) = (other getType)) ifTrue: [(self getValue) = (other getValue)] ifFalse: false.
]

{ #category : #accessing }
Cell >> getType [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
	^ type.
]

{ #category : #accessing }
Cell >> getValue [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
			
	^ value.
]

{ #category : #comparing }
Cell >> gt: other [
	"Does this cell represent a value that is greater than that of another cell? String are compared lexicographically."	
	^ ((self getType) = (other getType)) ifTrue: [(self getValue) > (other getValue)] ifFalse: false.
]

{ #category : #comparing }
Cell >> lt: other [
	"Does this cell represent a value that is greater than that of another cell? String are compared lexicographically."	
	^ ((self getType) = (other getType)) ifTrue: [(self getValue) < (other getValue)] ifFalse: false.
]

{ #category : #comparing }
Cell >> neq: other [
	"Is this cell representing a different value than other is."	
	^ (self eq: other) not.
]

{ #category : #initialization }
Cell >> setValue: newValue [
	"Sets the value of this cell. Type must be string."	
	value := newValue isString 
		ifTrue: [ newValue ]
		ifFalse: [ newValue asString ].
]
