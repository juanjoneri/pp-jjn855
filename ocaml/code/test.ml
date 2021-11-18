open Main;;

(* Problem 1 *)
Printf.printf "\n\n%s\n" "Problem 1" ;;

let solution = Main.remove_all [2; 4; 3; 7; 2; 8; 2] 2;;
List.iter (Printf.printf "%d ") solution ;;
(* - : int list = [4; 3; 7; 8] *)

let solution = Main.remove_all [2] 2;;
List.iter (Printf.printf "%d ") solution ;;
(* - : int list = [] *)

(* Problem 2 *)
Printf.printf "\n\n%s\n" "Problem 2" ;;

let solution = Main.all_from_to (-5) 7 ((<) 0);;
(Printf.printf "%d\n") solution ;;
(* - : int = 7 *)

let solution = Main.all_from_to 3 7 (fun x -> x mod 2 = 0);;
(Printf.printf "%d\n") solution ;;
(* - : int = 2 *)

(* Problem 3 *)
Printf.printf "\n\n%s\n" "Problem 3" ;; 

let solution = Main.separate (fun x -> x mod 2 = 0) [-3; 5; 2; -6];;
let a, b = solution ;;
Printf.printf "(%d, %d)\n" a  b ;;
(* - : int * int = (2, 2) *)

let solution = Main.separate (fun x -> x > 0) [-3; 5; 2; 0 ; -90 ; 0];;
let a, b = solution ;;
Printf.printf "(%d, %d)\n" a  b ;;
(* - : int * int = (2, 4) *)

let solution = Main.separate (fun x -> false) [-3; 5; 2; 0 ; -90 ; 0];;
let a, b = solution ;;
Printf.printf "(%d, %d)\n" a  b ;;
(* - : int * int = (0, 6) *)

let solution = Main.separate (fun x -> true) [-3; 5; 2; 0 ; -90 ; 0];;
let a, b = solution ;;
Printf.printf "(%d, %d)\n" a  b ;;
(* - : int * int = (6, 0) *)


(* Problem 4 *)
Printf.printf "\n\n%s\n" "Problem 4" ;; 

let solution = Main.all_even [4; 2; 12; 5; 6];;
(Printf.printf "%B\n") solution ;;
(* - : bool = false *)

let solution = Main.all_even [4; 2; 12; 0; 6];;
(Printf.printf "%B\n") solution ;;
(* - : bool = true *)

let solution = Main.all_even [];;
(Printf.printf "%B\n") solution ;;
(* - : bool = true *)


(* Problem 5 *)
Printf.printf "\n\n%s\n" "Problem 5" ;; 

let solution = Main.sum_square 3 9;;
(Printf.printf "%d\n") solution ;;
(* - : int = 190 *)

let solution = Main.sum_square 8 9;;
(Printf.printf "%d\n") solution ;;
(* - : int = 0 *)

let solution = Main.sum_square 0 2;;
(Printf.printf "%d\n") solution ;;
(* - : int = 1 *)

let solution = Main.sum_square (-9) (-3);;
(Printf.printf "%d\n") solution ;;
(* - : int = 190 *)


(* Problem 6 *)
Printf.printf "\n\n%s\n" "Problem 6" ;;

let solution = Main.concat "hi" ["How"; "are"; "hi"; "you?"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "How are you?" *)

let solution = Main.concat "a" ["a"; "a"; "a"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "" *)

let solution = Main.concat "a" ["aa"; "bb"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "aa bb" *)

let solution = Main.concat "" ["Hola"; "como"; "estas"; "?"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "aa bb" *)

(* Problem 7 *)
Printf.printf "\n\n%s\n" "Problem 7" ;;

let solution = (fun list -> List.fold_right (Main.remove_all_rec 2) list Main.remove_all_base) [2; 4; 3; 7; 2; 8; 2];;
List.iter (Printf.printf "%d ") solution ;;
(* - : int list = [4; 3; 7; 8] *)


(* Problem 8 *)
Printf.printf "\n\n%s\n" "Problem 8" ;;
let add_tuples (a, b) (c, d) = (a + c, b + d) ;;

let solution = (fun p -> fun list -> List.fold_right (Main.separate_rec p) list Main.separate_base) (fun x -> x mod 2 = 0) [-3; 5; 2; -6];;
let a, b = solution ;;
Printf.printf "(%d, %d)\n" a  b ;;
(* - : int * int = (2, 2) *)

let solution = (fun p -> fun list -> List.fold_right (Main.separate_rec p) list Main.separate_base) (fun x -> false) [-3; 5; 2; -6];;
let a, b = solution ;;
Printf.printf "(%d, %d)\n" a  b ;;
(* - : int * int = (0, 4) *)


(* Problem 9 *)
Printf.printf "\n\n%s\n" "Problem 9" ;; 

let solution = List.fold_left Main.all_even_rec Main.all_even_base [4; 2; 12; 5; 6];;
Printf.printf "%B\n" solution;;
(* - : bool = false *)

let solution = List.fold_left Main.all_even_rec Main.all_even_base [4; 2; 12; 0; 6];;
Printf.printf "%B\n" solution;;
(* - : bool = false *)


(* Problem 10 *)
Printf.printf "\n\n%s\n" "Problem 10" ;; 

let solution = Main.concat2 "hi" ["How"; "are"; "hi"; "you?"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "How are you?" *)

let solution = Main.concat2 "a" ["a"; "a"; "a"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "" *)

let solution = Main.concat2 "a" ["aa"; "bb"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "aa bb" *)

let solution = Main.concat2 "" ["Hola"; "como"; "estas"; "?"];;
(Printf.printf "%s\n") solution ;;
(* - : string = "aa bb" *)
