r= 0 #전역변수
def printSum(sList) :
  #r = 0 #지역변수
  global r
  r=0 #전역변수
  for s in sList:
    r += s
  return r

sList = [1,3,5,6,2]
print( printSum(sList))
print(r)


#288p 연습문제
# def func():
#   x=200

# func()
# print(x)

def func():
  x=200
  print(x)

x=100
func()
print(x)

def func():
  global x
  x= 200
  print(x)

x=100
func()
print(x)

"""
#E7-4
def trans(x):
  result = x * 0.621371
  return result

kilo=int(input("킬로미터를 입력하세요: "))
mile = trans(kilo)

print( "%d 킬로미터는 %.2f 마일이다." %(kilo,mile) )

#E7-5
def plus(a1):
  result = x + y
  return result
def min(a2):
  result = x - y
  return result
def mul(a3):
  result = x*y
  return result
def div(a4):
  result = x / y
  return result
select = int(input("원하는 연산자를 선택하세요(1/2/3/4)"))
x=int(input("첫 번째 숫자를 입력하세요: "))
y=int(input("두 번째 숫자를 입력하세요: "))
if select == 1 :
  result = plus(select)
  print("%d + %d = %d" %(x, y, result))
if select == 2 :
  result = min(select)
  print("%d - %d = %d" %(x, y, result))
if select == 3 :
  result = mul(select)
  print("%d * %d = %d" %(x, y, result))
if select == 4 :
  result = div(select)
  print("%d / %d = %d" %(x, y, result))

#E7-6
def ea(x):
  result = senlist.count(wordlist)
  return result
sentence = input("영어 문장을 입력하세요: ")
senlist = list(sentence)
word = input("알파벳 하나를 입력하세요: ")
wordlist = list(word)
print("%s 에 포함된 %s 의 개수는 %d 개이다." %(sentence, word,result))

#E7-7
def tup1Sum( t1 ):
  sm=0
  for i in t1 :
    sm= sm+i
  return sm
tup1=(10, 20, 30, 40, 50)
ss=tup1Sum ( tup1 )
print ( "튜플의 합계 : %d" %(ss))

#E 7-8
def reverseFun(strVar):
  for i in range ( len(strVar)-1, -1, -1) :
    print(strVar[i], end="")
strVar=input("문자열을 입력하세요.")
reverseFun (strVar)


#7-9
def blankToHyponFun(s):
  global s 
  s = s1.replace(" ", "-")


s=input("문자열을 입력하세요: ")
blankToHyponFun(s)
print(s)


def engQuiz(eng_dic):
  for i in eng_dic:
    answer = input ( f"{eng_dic}")


    """

# 7-3

