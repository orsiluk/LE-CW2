---------------------------------------------------------------
-- Language Engineering: COMS22201
-- Assessed Coursework 2: CWK2
-- Question 1: Denotational Semantics of While with read/write
---------------------------------------------------------------
-- This stub file provides a set of Haskell type definitions
-- you should use to implement various functions and examples 
-- associated with the denotational semantics of While with 
-- read and write statements as previously used in CWK1.
-- 
-- To answer this question, upload one file "cwk2.hs" to the 
-- "CWK2" unit component in SAFE by midnight on 01/05/2016.
--
-- You should ensure your file loads in GHCI with no errors 
-- and it does not import any modules (other than Prelude).
--
-- Please note that you will loose marks if your submission 
-- is late, incorrectly named, generates load errors, 
-- or if you modify any of the type definitions below.
--
-- For further information see the brief at the following URL:
-- https://www.cs.bris.ac.uk/Teaching/Resources/COMS22201/cwk2.pdf
---------------------------------------------------------------

import Prelude hiding (Num)
import qualified Prelude (Num)
  
type Num = Integer
type Var = String
type Z = Integer
type T = Bool
type State = Var -> Z
type Input  = [Integer]  -- to denote the values read by a program
type Output = [String]   -- to denote the strings written by a program
type IOState = (Input,Output,State)  -- to denote the combined inputs, outputs and state of a program

data Aexp = N Num | V Var | Add Aexp Aexp | Mult Aexp Aexp | Sub Aexp Aexp deriving (Show, Eq, Read)
data Bexp = TRUE | FALSE | Eq Aexp Aexp | Le Aexp Aexp | Neg Bexp | And Bexp Bexp deriving (Show, Eq, Read)
data Stm  = Ass Var Aexp | Skip | Comp Stm Stm | If Bexp Stm Stm | While Bexp Stm 
          | Read Var       -- for reading in the value of a variable
          | WriteA Aexp    -- for writing out the value of an arithmetic expression
          | WriteB Bexp    -- for writing out the value of a Boolean expression
          | WriteS String  -- for writing out a given string
          | WriteLn        -- for writing out a string consisting of a newline character
          deriving (Show, Eq, Read)

---------------------------------------------------------------
-- Part A)
--
-- Begin by adding your definitions of the following functions
-- that you previously wrote as part of CWK2p1 and CWk2p2:
---------------------------------------------------------------

-- Write a function fv_aexp with the following signature such that 
-- fv_aexp a returns the set of (free) variables in a: 
fv_aexp :: Aexp -> [Var]
fv_aexp (N n )=[]
fv_aexp (V x )=[x]
fv_aexp (Add a1 a2 ) = rep(fv_aexp (a1 ) ++  fv_aexp (a2 ))
fv_aexp (Mult a1 a2 ) = rep(fv_aexp (a1 ) ++ fv_aexp (a2 ))
fv_aexp (Sub a1 a2 ) = rep(fv_aexp (a1 ) ++ fv_aexp (a2 ))

-- Write a function fv_bexp with the following signature such that 
-- fv_bexp b returns the set of (free) variables in b:  
fv_bexp :: Bexp -> [Var]
fv_bexp(TRUE) = []
fv_bexp(FALSE)= []
fv_bexp(Eq a1 a2) = rep(fv_aexp(a1) ++ fv_aexp(a2))
fv_bexp(Le a1 a2) = rep(fv_aexp(a1) ++ fv_aexp(a2))
fv_bexp(Neg b) = rep(fv_bexp(b))
fv_bexp(And b1 b2) = rep(fv_bexp(b1) ++ fv_bexp(b2))

-- Write a function a_val with the following signature such that
-- a_val a s returns the result of semantically evaluating expression a in state s:
a_val :: Aexp -> State -> Z
a_val (N n) s = n
a_val (V x) s = s x
a_val (Add a1 a2) s = (a_val a1 s) + (a_val a2 s)
a_val (Sub a1 a2) s = (a_val a1 s) - (a_val a2 s)
a_val (Mult a1 a2) s = (a_val a1 s) * (a_val a2 s)

-- Write a function b_val with the following signature such that
-- b_val b s returns the result of semantically evaluating expression b in state s:
b_val :: Bexp -> State -> T
b_val TRUE s = True
b_val FALSE s = False
b_val (Eq a1 a2) s = (a_val a1 s) == (a_val a2 s)
b_val (Le a1 a2) s = (a_val a1 s) <= (a_val a2 s)
b_val (Neg b) s = not(b_val b s)
b_val (And b1 b2) s = (b_val b1 s) && (b_val b2 s)

-- Write a function cond with the following signature such that 
-- cond (b,p,q) s returns p s if b s is true and q s otherwise
cond :: (a->T, a->a, a->a) -> (a->a)
cond (b, p, q) s = if b s then p s else q s

-- Write a function fix with the following signature such that 
-- fix f simply returns f (fix f)
fix :: (a -> a) -> a
fix f = f (fix f)

-- Write a function update with the following signature such that 
-- update s i v returns the state update s[v |-> i]
-- i.e. state obtained from s by updating the value of v to i
---------------------------------------------------------------
-- Ezt nem ertem honnan szedjuk
update :: State -> Z -> Var -> State
update s i v x update s v y x  = if x == y then v else s x  

---------------------------------------------------------------
-- Part B))
--
-- Write a function fv_stm with the following signature such that 
-- fv_stm p returns the set of (free) variables appearing in p:  
---------------------------------------------------------------
 -- Has to be the same as fv_aexp but for Statments, which idk how sholuld look like
 
fv_stm :: Stm -> [Var]
fv_stm (Ass v a)    = rep( fv_stm(V v) ++ fv_stm(a))
fv_stm  Skip        = []
fv_stm (Comp s1 s2) = rep( fv_stm(s1) ++ fv_stm(s2))
fv_stm (If b s1 s2) = rep( fv_stm(b) ++ fv_stm(s1) ++ fv_stm(s2))
fv_stm (While b s)  = rep( fv_stm(s) ++ fv_stm(s))
fv_stm (Read v)     = rep( fv_stm(v))
fv_stm (WriteA a)   = rep( fv_stm(a))
fv_stm (WriteB b)   = rep( fv_stm(b))
fv_stm (WriteS s)   = []
fv_stm (WriteLn l)  = []

---------------------------------------------------------------
-- Part C)
--
-- Define a constant fac representing the following program 
-- (which you may recall from the file test7.w used in CWK1):
{--------------------------------------------------------------
write('Factorial calculator'); writeln;
write('Enter number: ');
read(x);
write('Factorial of '); write(x); write(' is ');
y := 1;
while !(x=1) do (
  y := y * x;
  x := x - 1
);
write(y);
writeln;
writeln;
---------------------------------------------------------------}

fac :: Stm
fac = Comp (WriteS "Factorial calculator") 
     (Comp (WriteLn ) 
     	   (Comp (WriteS "Enter number: " ) 
     		     (Comp (Read "x" ) 
     		     	   (Comp (WriteS "Factorial of " ) 
     		     	   		 (Comp (WriteA ( V "x" ) ) 
     		     	   		 	   (Comp (WriteS " is " ) 
     		     	   		 	   	     (Comp (Ass ( "y" ) ( N 1 ) ) 
     		     	   		 	   	      	   (Comp (While (Neg (Eq (V "x" ) (N 1 ) )) 
     		     	   		 	   	      		 			(Comp (Ass ( "y" ) (Mult (V "y" ) (V "x" ) ) ) 
     		     	   		 	   	      		 				  (Ass ( "x" ) (Sub (V "x" ) (N 1 ) )) 
     		     	   		 	   	      		 			) 
     		     	   		 	   	      		 	 ) 
		     		     	   		 	   	      	 (Comp (WriteA (V "y" ) ) 
		     		     	   		 	   	      	       (Comp (WriteLn ) (WriteLn ) )
		     		     	   		 	   	      	 ) 
     		     	   		 	   	      	   ) 
     		     	   		 	   	      ) 
     		     	   		 	   ) 
     		     	   		 ) 
     		     	   ) 
     		     ) 
     	   ) 
     )

---------------------------------------------------------------
-- Part D)
--
-- Define a constant pow representing the following program 
-- (which you may recall from the file test7.w used in CWK1):
-------------------------------------------------------------
--write('Exponential calculator'); writeln;
--write('Enter base: ');
--read(base);
--if 1 <= base then (
--  write('Enter exponent: ');
--  read(exponent);
--  num := 1;
--  count := exponent;
--  while 1 <= count do (
--    num := num * base;
--    count := count - 1
--  );
--  write(base); write(' raised to the power of '); write(exponent); write(' is ');
--  write(num)
--) else (
--  write('Invalid base '); write(base)
--);
--writeln
--------------------------------------------------------------

pow :: Stm
pow = Comp (WriteS "Exponential calculator")
 	 (Comp (WriteLn)
 	 	   (Comp (WriteS "Enter base: "))
 	 	   (Comp (Read "base")
 	 	   		 (Comp (If (Le (N1 ) (V "base")))
 	 	   		 	   (Comp (WriteS "Enter exponent: " )
 	 	   		 	   		 (Comp (Read "exponent")
 	 	   		 	   		 	   (Comp (Ass ("num") (N 1))
 	 	   		 	   		 	   		 (Comp (Ass ("count") (V "exponent"))
 	 	   		 	   		 	   		 	   (Comp (While (Le (N 1) (V "count"))
 	 	   		 	   		 	   		 	   				(Comp (Ass "num" (Mult (V "num") (V "base")))
 	 	   		 	   		 	   		 	   				)
 	 	   		 	   		 	   		 	   		 )
 	 	   		 	   		 	   		 	   )
	 	 	   		 	   		 	   		   (Comp (WriteA (V "base"))
	 	 	   		 	   		 	   		 	     (Comp (WriteS " raised to the power of ")
	 	 	   		 	   		 	   		 	   	  	   (Comp (WriteA (V "exponent"))
	 	 	   		 	   		 	   		 	   		 	     (Comp (WriteS " is ")
	 	 	   		 	   		 	   		 	   		 	   		   (WriteA (V "num"))
	 	 	   		 	   		 	   		 	   		 	     )
	 	 	   		 	   		 	   		 	   		   )
	 	 	   		 	   		 	   		 	     )
	 	 	   		 	   		 	   		   )
 	 	   		 	   		 	   		  )
 	 	   		 	   		 	   )
 	 	   		 	   		 )
 	 	   		 	   )
 	 	   		 )
 	 	   )
 	 )

---------------------------------------------------------------
-- Part E)
--
-- Write a function s_ds with the following signature such that 
-- s_ds p (i,o,s) returns the result of semantically evaluating 
-- program p in state s with input list i and output list o.
---------------------------------------------------------------

s_ds :: Stm -> IOState -> IOState

---------------------------------------------------------------
-- Part F)
--
-- Write a function eval with the following signature such that 
-- eval p (i,o,s) computes the result of semantically evaluating 
-- program p in state s with input list i and output list o; and 
-- then returns the final input list and output list together 
-- with a list of the variables appearing in the program and 
-- their respective values in the final state.
---------------------------------------------------------------

eval :: Stm -> IOState -> (Input, Output, [Var], [Num])


---------------------------------------------------------------
-- Remove duplicates
---------------------------------------------------------------
rep :: (Eq a) => [a] -> [a]
rep [] = []
rep (x:xs) = x : rep(filter (\y -> (x/=y)) xs)