"
Program handles program specific logic like reading and writing files.
"
Class {
	#name : #Program,
	#superclass : #Object,
	#instVars : [
		'hasHeaders',
		'operation',
		'argument',
		'tableFile',
		'outFile',
		'errorFile'
	],
	#category : #Table
}

{ #category : #execution }
Program >> execute [
	| in out errorLogger |
	in := Table new. "Initialize table using readTable"
	errorLogger := ErrorLogger new.
	errorLogger setFile: errorFile.
	in setLogger: errorLogger.
	in parseTable: (self readTable) withHeaders: hasHeaders.
	
	out := (operation = '-print') ifTrue: [ (in print: argument) print ] ifFalse: [
			 (operation = '-sum') ifTrue: [ in sum: argument ] ifFalse: [
			 (operation = '-when') ifTrue: [ (in when: argument) print ] ifFalse: [ '' ]]].
	
	self writeTable: out.
]

{ #category : #parsing }
Program >> parseArgs: args [
	"Parses command line arguments to initialize this program -print 0 1.txt 1.out"
	| temp re |
	temp  := args splitOn: ' '.
	
	hasHeaders := temp includes: '-header'.
	hasHeaders ifTrue: [temp remove: '-header'].
	
	operation := temp at: 1.
	argument := temp at: 2.
	tableFile := temp at: 3.
	outFile := temp at: 4.
	
	re := '(.*)(\w+\.\w+)$' asRegex.
	re matches: tableFile.
	errorFile := (re subexpression: 2), 'stdout.txt'
]

{ #category : #printing }
Program >> print [
	"Returns the name of this program for debugging."
	| name |
	name := 'Program:', String cr.
	name := name, 'hasHeaders: ' , (hasHeaders ifTrue: ['YES'] ifFalse: ['NO']), String cr.
	name := name, 'operation: ' , operation, String cr.
	name := name, 'argument: ' , argument, String cr.
	name := name, 'tableFile: ' , tableFile, String cr.
	name := name, 'outFile: ' , outFile, String cr.
	name := name, 'errorFile: ' , errorFile, String cr.
			
	^ name.
]

{ #category : #actions }
Program >> readTable [
	"Reads the lines from tableFile into a string."
	| working stream table |
	table := OrderedCollection new.
	working := FileSystem disk workingDirectory.
	stream := (working / tableFile) readStream.
	[stream atEnd] whileFalse: [table add: (stream nextLine)].
	stream close.
	^ table.
]

{ #category : #actions }
Program >> writeTable: value [
	"Writes the value to outFile as is."
	| working stream |
		working := FileSystem disk workingDirectory.
		stream := (working / outFile) writeStream.
		stream nextPutAll: value; lf.
		stream close.
]
