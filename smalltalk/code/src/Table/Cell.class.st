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
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
			
	value := newValue.
]
