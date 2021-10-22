Class {
	#name : #TableMain,
	#superclass : #Object,
	#category : #Table
}

{ #category : #accessing }
TableMain >> main: args [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
			
	| working stream |
	working := FileSystem disk workingDirectory.
	stream := (working / 'stdout.txt') writeStream.
	stream nextPutAll: 'Arguments'.
	stream nextPutAll: args; lf.
]
