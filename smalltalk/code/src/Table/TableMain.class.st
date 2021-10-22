Class {
	#name : #TableMain,
	#superclass : #Object,
	#category : #Table
}

{ #category : #accessing }
TableMain >> main: message [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"
	| working stream |
	working := FileSystem disk workingDirectory.
	stream := (working / 'stdout.txt') writeStream.
	stream nextPutAll: message; lf.
	stream nextPutAll: 'over'; lf.
	stream close.
]
