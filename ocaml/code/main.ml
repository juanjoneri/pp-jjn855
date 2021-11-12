
Printf.printf "\n\n%s\n" "Problem 1" ;; 
(* Problem 1 *)
(* Write a function remove_all : int list -> int -> int list such that
remove_all list m returns a list in the same order as the input list,
but with all the numbers equal to m removed. You may not use any
library functions. *)

let rec remove_all list m =
    match list with
        | [] -> []
        | head :: tail -> 
        (match head with
            | x when x = m -> (remove_all tail m)
            | _ -> head :: (remove_all tail m))
;;

let solution = remove_all [2; 4; 3; 7; 2; 8; 2] 2;;
List.iter (Printf.printf "%d ") solution ;;
(* - : int list = [4; 3; 7; 8] *)

Printf.printf "\n\n%s\n" "Problem 2" ;; 
(* Problem 2 *)
(* Write a function all_from_to : int -> int -> (int -> bool) -> int
such that all_from_to m n p tells the number of integers greater than
or equal to m and also less than or equal to n which satisfy a given
predicate p : int -> bool.  You may not use any library functions. *)

let rec all_from_to m n p = 
    if m > n then 0
    else
        (if p m then 1 + (all_from_to (m + 1) n p)
        else (all_from_to (m + 1) n p))

;;

let solution = all_from_to (-5) 7 ((<) 0);;
(Printf.printf "%d\n") solution ;;
(* - : int = 7 *)

let solution = all_from_to 3 7 (fun x -> x mod 2 = 0);;
(Printf.printf "%d\n") solution ;;
(* - : int = 2 *)

Printf.printf "\n\n%s\n" "Problem 3" ;; 
(* Problem 3 *)
(* Write a function separate : ('a -> bool) -> 'a list -> int * int
such that separate p l returns a pair of integers, the first indicates
the number of elements of l for which p returns true, and the second
indicates the number of elements for which p returns false. You may
not use any library functions. *)

let add_tuples (a, b) (c, d) = (a + c, b + d) ;;

let rec separate p l = 
    match l with
        | [] -> (0, 0) 
        | head :: tail -> 
            (if p head then (add_tuples (1, 0) (separate p tail))
            else (add_tuples (0, 1) (separate p tail)))
;;

let solution = separate (fun x -> x mod 2 = 0) [-3; 5; 2; -6];;
let a, b = solution ;;
Printf.printf "(%d, %d)\n" a  b ;;
(* - : int * int = (2, 2) *)

let solution = separate (fun x -> x > 0) [-3; 5; 2; 0 ; -90 ; 0];;
let a, b = solution ;;
Printf.printf "(%d, %d)\n" a  b ;;
(* - : int * int = (2, 4) *)

let solution = separate (fun x -> false) [-3; 5; 2; 0 ; -90 ; 0];;
let a, b = solution ;;
Printf.printf "(%d, %d)\n" a  b ;;
(* - : int * int = (0, 6) *)

let solution = separate (fun x -> true) [-3; 5; 2; 0 ; -90 ; 0];;
let a, b = solution ;;
Printf.printf "(%d, %d)\n" a  b ;;
(* - : int * int = (6, 0) *)


Printf.printf "\n\n%s\n" "Problem 4" ;; 
(* Problem 4 *)
(* Write a function all_even : int list -> bool that returns whether
every element in the input list is even. You may use mod for testing
whether an integer is even. You may not use any other library functions. *)

let rec all_even list = 
    match list with
        | [] -> true
        | head :: tail -> ((head mod 2) = 0) && (all_even tail)
;;

let solution = all_even [4; 2; 12; 5; 6];;
(Printf.printf "%B\n") solution ;;
(* - : bool = false *)

let solution = all_even [4; 2; 12; 0; 6];;
(Printf.printf "%B\n") solution ;;
(* - : bool = true *)

let solution = all_even [];;
(Printf.printf "%B\n") solution ;;
(* - : bool = true *)


Printf.printf "\n\n%s\n" "Problem 5" ;; 
(* Problem 5 *)
(* Write a function sum_square : int -> int -> int such that
sum_square m n calculates the sum of the squares of the elements
strictly greater than m and strictly less than n if there are any, and
0 otherwise. You may not use any library functions. *)

let rec sum_square m n = 
    if (m + 1) >= n then 0
    else ((m + 1) * (m + 1)) + sum_square (m + 1) n
;;

let solution = sum_square 3 9;;
(Printf.printf "%d\n") solution ;;
(* - : int = 190 *)

let solution = sum_square 8 9;;
(Printf.printf "%d\n") solution ;;
(* - : int = 0 *)

let solution = sum_square 0 2;;
(Printf.printf "%d\n") solution ;;
(* - : int = 1 *)

let solution = sum_square (-9) (-3);;
(Printf.printf "%d\n") solution ;;
(* - : int = 190 *)


Printf.printf "\n\n%s\n" "Problem 6" ;; 
(* Problem 6 *)
(* Write a function concat : string -> string list -> string such that
concat s l creates a string consisting of the strings in the list l
concatenated together, with a single space inserted between
consecutive elements. Also all strings equal to s should be
excluded. You may not use any library functions. *)

let rec concat s list =
    match list with
        | [] -> ""
        | head :: tail -> 
            if head = s then (concat s tail)
            else head ^ " " ^ (concat s tail)
;;

let solution = concat "hi" ["How"; "are"; "hi"; "you?"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "How are you?" *)

let solution = concat "a" ["a"; "a"; "a"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "" *)

let solution = concat "a" ["aa"; "bb"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "aa bb" *)

let solution = concat "" ["Hola"; "como"; "estas"; "?"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "aa bb" *)

(* For problems 7 through 9, you will be supplying arguments to the
higher-order functions List.fold_right and List.fold_left. You should
not need to use explicit recursion for any of 7 through 10. *)


Printf.printf "\n\n%s\n" "Problem 7" ;; 
(* Problem 7 *)
(* Write a value remove_all_base and function remove_all_rec : int ->
int -> int list -> int list such that (fun list -> List.fold_right
(remove_all_rec m) list remove_all_base) computes the same results as
remove_all of Problem 1. There should be no use of recursion or
library functions in defining remove_all_rec. *)

let remove_all_base = [] ;;
let remove_all_rec m n r = 
    if m = n then r
    else n :: r
;;
let solution = (fun list -> List.fold_right (remove_all_rec 2) list remove_all_base) [2; 4; 3; 7; 2; 8; 2];;
List.iter (Printf.printf "%d ") solution ;;
(* - : int list = [4; 3; 7; 8] *)


Printf.printf "\n\n%s\n" "Problem 8" ;; 
(* Problem 8 *)
(* Write a value separate_base and function separate_rec : ('a ->
bool) -> 'a -> int * int -> int * int such that (fun p -> fun list ->
List.fold_right (separate_rec p) list separate_base) computes the same
results as separate of Problem 3. There should be no use of recursion
or library functions in defining separate_rec. *)

let add_tuples (a, b) (c, d) = (a + c, b + d) ;;

let separate_base = (0, 0) ;;
let separate_rec p x (tl, fl) =
    if p x then (add_tuples (1, 0) (tl, fl))
    else (add_tuples (0, 1) (tl, fl))
;;

let solution = (fun p -> fun list -> List.fold_right (separate_rec p) list separate_base) (fun x -> x mod 2 = 0) [-3; 5; 2; -6];;
let a, b = solution ;;
Printf.printf "(%d, %d)\n" a  b ;;
(* - : int * int = (2, 2) *)

let solution = (fun p -> fun list -> List.fold_right (separate_rec p) list separate_base) (fun x -> false) [-3; 5; 2; -6];;
let a, b = solution ;;
Printf.printf "(%d, %d)\n" a  b ;;
(* - : int * int = (0, 4) *)


Printf.printf "\n\n%s\n" "Problem 9" ;; 
(* Problem 9 *)
(* Write a value all_even_base and function all_even_rec : bool -> int
-> bool such that List.fold_left all_even_rec all_even_base computes
the same results as all_even of Problem 4. You may use mod for testing
whether an integer is even. There should be no use of recursion or
other library functions in defining all_even_rec. *)

let all_even_base = true ;;
let all_even_rec r x = ((x mod 2) = 0) && r 

let solution = List.fold_left all_even_rec all_even_base [4; 2; 12; 5; 6];;
Printf.printf "%B\n" solution;;
(* - : bool = false *)

let solution = List.fold_left all_even_rec all_even_base [4; 2; 12; 0; 6];;
Printf.printf "%B\n" solution;;
(* - : bool = false *)


Printf.printf "\n\n%s\n" "Problem 10" ;; 
(* Problem 10 *)
(* Write a function concat2 : string -> string list -> string that
computes the same results as concat of Problem 6. The definition of
concat2 may use List.fold_left : ('a -> 'b -> 'a) -> 'a -> 'b list ->
'a but no direct use of recursion, and no other library functions. *)

let concat_rec s left right =
    if left = s then right
    else left ^ " " ^ right
;;

let concat2 s list = List.fold_right (concat_rec s) list ""

let solution = concat2 "hi" ["How"; "are"; "hi"; "you?"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "How are you?" *)

let solution = concat2 "a" ["a"; "a"; "a"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "" *)

let solution = concat2 "a" ["aa"; "bb"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "aa bb" *)

let solution = concat2 "" ["Hola"; "como"; "estas"; "?"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "aa bb" *)
