"
Entry point for the program.
"
Class {
	#name : #TableMain,
	#superclass : #Object,
	#category : #Table
}

{ #category : #accessing }
TableMain >> main: message [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"
	| program |
	program := Program new.
	program parseArgs: message.
	program execute.
]
