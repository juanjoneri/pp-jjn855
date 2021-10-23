Class {
	#name : #StringCell,
	#superclass : #Cell,
	#category : #Table
}

{ #category : #initialization }
StringCell >> initialize [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
	type := 'string'.
]
