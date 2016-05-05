{------------------------------------------------------------
 -- Language Engineering: COMS22201
 -- Assessed Coursework 2: CWK2
 -- Question 3: Axiomatic Semantics of While with read/write
 ------------------------------------------------------------
 -- This stub file gives two code fragments (from the test7.w 
 -- source file used in CWK1) that you will need to annotate 
 -- with tableau correctness proofs using the partial axiomatic 
 -- semantics extended with axioms for read/write statements.
 -- 
 -- To answer this question, upload one file "cwk2.w" to the 
 -- "CWK2" unit component in SAFE by midnight on 01/05/2016.
 --
 -- For further information see the brief at the following URL:
 -- https://www.cs.bris.ac.uk/Teaching/Resources/COMS22201/cwk2.pdf
 ------------------------------------------------------------}


{------------------------------------------------------------
 -- Part A)
 --
 -- provide a tableau-based partial correctness proof
 -- of the following program (for computing factorials) 
 -- with respect to the given pre- and post-conditions
 -- by completing the annotation of the program with 
 -- logical formulae enclosed within curly braces:
 ------------------------------------------------------------}

{ head(IN)=n }

write('Factorial calculator'); 
{ OUT = append(OUT, ['Factorial calculator']) }

writeln;
{ OUT = append(OUT, [’\n’]) }

write('Enter number: ');
{ OUT = append(OUT, ['Enter number: ']) }

{n = head(IN) }
read(x);
{ x = n }

write('Factorial of '); 
{ OUT = append(OUT, ['Factorial of ']) }

write(x); 
{ OUT = append(OUT, [n]) }

write(' is ');
{ OUT = append(OUT, [' is ']) }

y := 1;
{ y=1 & x=n & n>0 } 
{ n!=yx! & x>0 } 

while !(x=1) do (
  
  { n!=yx! & x>0 }
  { n!=(y*x)(x-1)! & (x-1)>0 }
  
  y := y * x;
  { n!=y(x-1)! & (x-1)>0  }

  x := x - 1
  { n!=yx! & x>0 }
);
{ n!=yx! & x>0 }
{ y=n!}

{ append(OUT,[y]) = append(OUT, [n!]) }
write(y);
{ OUT = append(OUT, [n!]) }

{ append(OUT,[’\n’]) = append(OUT,[n!,_]) }
writeln;
{ OUT=append(OUT,[n!,_]) }

{ append(OUT,[’\n’]) = append(OUT,[n!,_,_]) }
writeln;
{ OUT=append(OUT,[n!,_,_]) }



{------------------------------------------------------------
 -- Part B)
 --
 -- provide a tableau-based partial correctness proof
 -- of the following program (for computing exponents) 
 -- with respect to suitable pre- and post-conditions:
 ------------------------------------------------------------}

write('Exponential calculator'); writeln;
{ OUT = append(OUT, ['Exponential calculator']) }

write('Enter base: ');
{ OUT = append(OUT, ['Enter base: ']) }

{n = head(IN) }
read(base);
{ base = n }

if 1 <= base then (
  
   write('Enter exponent: ');
  { OUT = append(OUT, ['Enter exponent: ']) } 

  {n = head(IN) }
  read(exponent);
  { exponent = n }

  num := 1;

  count := exponent;

  {num=1 & count=exponent & count>0 }

  {base^exponent=num*base & 1<=count}
  {base^exponent=num*base & 1<=count}
  while 1 <= count do (

    {base^exponent=num*base & 1<=count}
    {base^exponent=num*(base^(exponent-1)) & 1<=count}
    num := num * base;

    {base^exponent=num*(base^(exponent-1)) & 1<=count}
    count := count - 1

  );
  {base^exponent=num*base & 1<=count}
  {base^exponent = count}
  
  write(base); 
  { OUT = append(OUT, [base]) } 

  write(' raised to the power of '); 
  { OUT = append(OUT, [' raised to the power of ']) } 

  write(exponent); 
  { OUT = append(OUT, [exponent]) } 
  
  write(' is ');
  { OUT = append(OUT, [' is ']) }  

  write(num)
  { OUT = append(OUT, [num]) } 
) else (
   write('Invalid base '); 
  { OUT = append(OUT, ['Invalid base ']) } 

  write(base)
  { OUT = append(OUT, [base]) } 
);

writeln
{ OUT = append(OUT, [’\n’]) }