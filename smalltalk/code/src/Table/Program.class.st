Class {
	#name : #Program,
	#superclass : #Object,
	#instVars : [
		'operation',
		'argument',
		'tableFile',
		'outFile'
	],
	#category : #Table
}

{ #category : #parsing }
Program >> parseArgs: args [
	"Command line arguments to initialize this program -print 0 1.txt 1.out"
	| temp |
	temp  := args splitOn: ' '.
	operation := temp at: 1.
	argument := temp at: 2.
	tableFile := temp at: 3.
	outFile := temp at: 4.
]

{ #category : #printing }
Program >> print [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"
	| name |
	name := 'Program:', String cr.
	name := name, 'operation: ' , operation, String cr.
	name := name, 'argument: ' , argument, String cr.
	name := name, 'tableFile: ' , tableFile, String cr.
	name := name, 'outFile: ' , outFile, String cr.
			
	^ name.
]

{ #category : #actions }
Program >> readTable [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"
	| working stream table |
	table := String new.
	working := FileSystem disk workingDirectory.
	stream := (working / tableFile ) readStream.
	stream do: [ :each | table := table, each ].
	stream close.
	^ table.
]

{ #category : #actions }
Program >> writeTable: value [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
	| working stream |
		working := FileSystem disk workingDirectory.
		stream := (working / outFile) writeStream.
		stream nextPutAll: value; lf.
		stream close.
]
