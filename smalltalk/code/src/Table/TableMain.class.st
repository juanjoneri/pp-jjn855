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
	| program logger |
	
   logger := ErrorLogger new.
	logger setFile: 'MyErrorLog.txt'.
	logger log: message.
	
	
	program := Program new.
	program parseArgs: message.
	program execute.
]
