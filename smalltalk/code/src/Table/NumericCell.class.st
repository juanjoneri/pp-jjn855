"
A numeric cell has a value of type double and can be used to do math.
"
Class {
	#name : #NumericCell,
	#superclass : #Cell,
	#category : #Table
}

{ #category : #tests }
NumericCell >> getValue [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"
	| n |
	n := value asNumber.
	^ (n floor = n ifTrue: [n floor] ifFalse: [n]).
]

{ #category : #initialization }
NumericCell >> initialize [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
	type := 'numeric'.
]
