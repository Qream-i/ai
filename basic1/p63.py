#문자열 반복 연산자
x="토끼" * 10
print(x)

date="20220301"
year= date[0:4]
month= date[4:6]
day= date[6:]
date2 = year + "-" + month + "-" + day
print(date2)

animal = "고양이"
age = 25
score = 12.55
x = "나는 %s를 좋아하는 %d 살 포인트 점수 %.2f입니다." %(animal, age, score)
print(x)

#y="ab"
#x="%c"%y # %c 한글자 %s 한글자 이상
#print(x)

y=15
x="%o" %y # %o는 8잰수로 표시
print(x)

y=15
x="%x"%y # %x 는 16진수로 표시
print(x)
# %s %c %d %f %o %x

# 키보드 입력
# input()
"""
name = input ("이름을 입력하세요")
print("%s 이름입니다" %name ) 

int = input("점수")
print(type(score))
print ("%d 점입니다" %(int)(score))
int = int(input("점수"))
print(type(score))
print ("%d 점입니다" %score)
#실수 반지름 12.5789를 입력 받아서 원넓이(반지름*반지름*3.14)를 구하세요
radius=float(input("반지름"))
area = radius*radius*3.14
print("%f 원넓이" %area)
"""
print("문자열에는 문자 앞 뒤에 쌍따옴포(\")를 붙인다")


#1
주식명 ="삼성전자"
주식싯가 = 50000
주식수 = "10주"
print(주식명, "주식", 주식수, "총평가금액은 ", 주식싯가, "원 입니다. ", sep=" ")

#2
시가총액 = "298조"
현재가 = 50000
per = 15.79
print("시가총액", 시가총액, "\n현재가", 현재가,"원", "\nper", per  )

#3
h="Hello"
p="python"
hello = "%s! %s" %(h, p)
print(hello)

#4
a="123"
print(type(a))

#5
num_str = "1234"
num=(int)(num_str)
print (num)

#6
num_str ="12.567"
num=(float)(num_str)
print(num)

#7
year="2020"
num=(int)(year)
print(num)

#8
price = 48960
month="36"
sum = price*(int)(month)
print(sum)

# 문자열 1
letters = 'java programming'
print(letters[5], letters[1], letters[-2])

#2
car ="43다 6521"
print(car[4:])
print(car[-4:0])

#3
string = "홀짝홀짝홀짝홀짝"
print(string[1:8:2])
#string[시작인덱스:종료인덱스:증가인덱스]

#4
string="PYTHON"
print(string[::-1])

#5
string=string.replace("Y","K")
print(string)

string = "abcdef"
print( string.replace('a','A'))
#일시적임.. string= 달아주는거 아니면 값이 변하지않음

phone_number="010-888-9999"
phone_number=phone_number.replace('-',' ')
print(phone_number)
phone_number=phone_number.replace(' ','')
print(phone_number)


url = "http://www.naver.com"
url = url.split(".")
print(url[1])

a="123"
b="456"
print ((int)(a+b))

#17 format을 이용한 문자열 출력
name1 = "홍길동"
age1 = 25
eyesight1 = 1.2
name2 = "이순신"
age2= 13
eyesight2 = 0.8

print("이름 : {} 나이 : {} 시력 : {}".format(name1, age1, eyesight1))
print("이름 : {} 나이 : {} 시력 : {}".format(name2, age2, eyesight2))

#18(가장 많이 쓰는 타입) 파이썬 3.6~ 앞에 f 하나쓰는걸로 해결
name1 = "홍길동"
age1 = 25
eyesight1 = 1.2
name2 = "이순신"
age2= 13
eyesight2 = 0.8

print(f"이름 : {name1} 나이 : {age1} 시력 : {eyesight1}")
print(f"이름 : {name2} 나이 : {age2} 시력 : {eyesight2}")

#19

총금액 = "5,896,124,650"
총금액 = 총금액.replace(',', '')
print((int)(총금액))

#20
날짜 = '2024/01(E) 1사분기'
날짜 = 날짜.split( "(" )
print(날짜[0])


#21
data = "      공백제거하기   "
data = data.strip("  ")
print(data)

#22
lowerWord = "python is very good"
lowerWord = lowerWord.upper()
print(lowerWord)

#23
upperWord="JAVA LANGUAGE"
upperWord = upperWord.lower()
print(upperWord)

#24
capitalizeWord="python quiz"
capitalizeWord=capitalizeWord.capitalize()
print(capitalizeWord)

#25
fileName="abc.csk"
#fileName=fileName.endswith("csv")
#print((bool)(fileName))
if fileName.endswith("csv") :
  print("엑셀파일입니다.")


#26
fileName = "abc.xlsx"
if fileName.endswith(("csv", "xlsx")):
  print((bool)(fileName))
