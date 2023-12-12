#변수연습
_name="홍길동"
Name1kk="다른변수"
_name="이순신"
print(_name)
print(type(_name)) #type 함수는 자료형을 보여준다.
number=10
print(type(number))
pi = 3.14
ok = True
print(type(pi))
print(type(ok))

#사칙연산
str1="abc"
str2="def"
print (str1+str2)
print (str1*3)
str3= str1+str2
print(str3)

number=1; number2 =2; number3=3
number4 = number +number2
number5 = number2 * number3
number6 = number2**number3
number7 =number3/number2
number8 = number3%number2
print(number, number2, number3, sep=" -- ")
print(number4, number5, number6, sep=" == ")
print(number7, number8, sep=" --> ")

ok1 = True
ok2 = False
ok3 = ok1 + ok2
ok4 = ok1-ok2
ok5= ok1*ok2
#ok6=ok1/ok2
print(ok3, ok4, ok5, sep=" >> ")

print(-26.35 + 8.7*(-21.0))
print(3/5)
a=100/35
print(a)
print("%.2f"%a)
b=100//35 #나누기를 하되, 소숫점 아래는 절삭
print(b)

jumin = '061225-4098745'
#성별추출하기 4
birth = jumin[:5]
print(birth)
gender = jumin[7]
print(gender)
year=jumin[:2]
month=jumin[2:4]
day=jumin[4:6]
print("20", year, "년", month, "월", day, "일", sep="")
print(len(jumin))

a=100
print(a)
#숫자인경우, len(길이를 의미) 함수 사용 불가

print("-"*100)

a=100
b="abc"
c=(str)(a)+b

a="100"
b="200"
c=(int)(a)+(int)(b)
print(type(c))
print(c)