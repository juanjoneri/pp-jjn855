"
Logs errors to stdout.txt
"
Class {
	#name : #ErrorLogger,
	#superclass : #Object,
	#instVars : [
		'file'
	],
	#category : #Table
}

{ #category : #logging }
ErrorLogger >> log: value [
	"Writes the value to the error file as is."
	| working stream |
		working := FileSystem disk workingDirectory.
		stream := (working / file) writeStream.
		stream nextPutAll: value; lf.
		stream close.
		Error signal: value.
]

{ #category : #logging }
ErrorLogger >> logColIndexError [
	self log: 'COL INDEX ERROR'.
]

{ #category : #logging }
ErrorLogger >> logCondError [
	self log: 'COND ERROR'.
]

{ #category : #logging }
ErrorLogger >> logNumColsError [
	self log: 'NUM COLS ERROR'.
]

{ #category : #logging }
ErrorLogger >> logOtherError [
	self log: 'OTHER ERROR'.
]

{ #category : #logging }
ErrorLogger >> logTypeError [
	self log: 'TYPE ERROR'.
]

{ #category : #initialization }
ErrorLogger >> setFile: fileName [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
	file := fileName.
]
