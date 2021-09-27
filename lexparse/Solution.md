# How to execute tests:

1. cd into lexparse/
2. run `sh ./s tests/your_test.prog`

OR

1. cd into lexparse/code/
2. run `sh ./simple ../tests/your_test.prog`

# Assumptions

## Main Method

In order to be considered valid, a main method needs to satisfy:
- declared at the **program level**
- name is `main`
- return type is `void`
- has no arguments

Tests: `main_\w*?.prog`

## Types

Types must be either primitive: `int`, `bool`, `char` or `enum`
OR a name that is in scope (class, interface, etc).

Errors will output the invalid name that was found

Tests: `names_invalid_not_defined.prog` and `names_valid.prog`

## Name Use Error

- A constant, variable, or method name must be declared in the given scope, or in an enclosing scopes for its use to be valid as a designator.

- Names that appear after a `.` (e.g. `Num.ONE` and `val.putp()`) are accessible as long as they were previously defined in the program (even if they are not necessarily available in that context or scope (e.g. `Num.put()` is valid))

Errors will output the name that was not found or not in scope

Tests: `names_\w*?.prog`

## Var Error

For the context of this check, new scopes are created at the following levels:
- program
- enum definition (e.g. `enum Num { ZERO, ZERO = 0 }` is invalid but `enum NumOne { ZERO} enum NumTwo { ZERO}` is valid)
- class
- interface
- method definitions

Errors will output the name that caused the collision

Tests: `var_\w*?.prog`

## Lex Error & Parser Error

When one of these two error is found, the execution will stop and we will not run any semantic checks. 

Errors will output the line where the problem was encountered.

Tests: `lex_invalid.prog` and `parser_invalid.prog`