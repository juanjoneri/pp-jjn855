Class {
	#name : #NumericCell,
	#superclass : #Cell,
	#category : #Table
}

{ #category : #tests }
NumericCell >> getValue [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
	^ value asNumber.
]
