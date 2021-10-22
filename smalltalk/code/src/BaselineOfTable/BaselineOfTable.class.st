Class {
	#name : #BaselineOfTable,
	#superclass : #Object,
	#category : #BaselineOfTable
}

{ #category : #baselines }
BaselineOfTable >> baseline: spec [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
			
	<baseline>
	spec
		for: #common
		do: [ spec package: 'Table' ]
]

{ #category : #accessing }
BaselineOfTable >> projectClass [
	"comment stating purpose of instance-side method"
	"scope: class-variables  &  instance-variables"	
			
	^ MetacelloCypressBaselineProject
]
