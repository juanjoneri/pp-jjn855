Class {
	#name : #TableMain,
	#superclass : #Object,
	#category : #Table
}

{ #category : #accessing }
TableMain >> main: message [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"
	| program table tableName |
	program := Program new.
	program parseArgs: message.
	table := program readTable.
	tableName := String new.
   table do: [:each | tableName := tableName , each, '---'].
	program writeTable: tableName.
]
