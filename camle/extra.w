{COMS22201 test2: program to test arithmetic expressions containing extra alnguage features.}
{Already tested: test1 - test7 .}

write(0^1);
writeln;
write(1^1);
writeln;
write(0^0);
writeln;
write(4/2);
writeln;
write(15/3);
writeln;
write(17/5);
writeln;
write(5/3);
writeln;
if 1 < 2
  then write(97)
  else skip;
writeln;
if 2 > 1
  then write(98)
  else skip;
writeln;
if 2 >= 1
  then write(99)
  else skip;
writeln;
writeln;
if 2 < 1
  then write(97)
  else write(7);
writeln;
if 2 > 2
  then write(98)
  else write(8);
writeln;
if 0 >= 1
  then write(99)
  else write(9);
writeln;
writeln;
if 2 != 1
  then write(96)
  else skip;
writeln;
if 1!= 1
  then write(96)
  else write(6);
writeln;


i:= 10;
repeat
(
write(8);
i:=i-1
)
until i>2;
writeln;
repeat
(
write(' <3');
i:= i+1
)
until i<8;
writeln;

i:=24;

repeat
(
write(i);
write(' ');
i:=i-2
)
until i >= 0;

for(i:=1  i <= 4  i:=i+1 ) do write(i);
writeln;

for(i:=0  i != 6  i:=i+2 ) do write(i);
writeln;

for(i:=25  i > 1  i:=i/5 ) do (
write(i);
writeln
)

