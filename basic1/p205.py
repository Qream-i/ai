#특정 문자열 찾기, 문자열 치환, 문자열 쪼개기
string1 = "Python is fun!"
print(string1)
a= string1.find("fun")
#fun이라는 문자를 찾았다. 어디에?
print(a)

b=string1.find("n")
print(b)

#못 찾으면 -1 > 이 find는 되게 많이 씀

studentName="홍길동, 이순신, 이경미, 최수진"
a=studentName.find("최수진")
print (a)
if a == -1:
  print("우리반 아닙니다.")
else:
  print("우리반 입니다.")

#치환하기
m = studentName.replace("최수진","정수진")
print(m)

data="홍길동/이순신/최경주"
data= data.replace("/", " ")
print(data)
data=data.replace(" " , "-")
print(data)

hello="have a nice day"
print(hello)
list1 = hello.split(" ")
print(list1)
print(type(list1))

for i in range (0,len(list1)):
  print("list1[%d] : %s" %(i,list1[i]))


names = ["황애린", "홍지수","안지영"]
print(names)

x="/".join(names)
print(x)
phoneNumber=["010","1234","4567"]
xx="-".join(phoneNumber)
print(xx)
print(type(xx))
#join은 list함수를 문자열로 합쳐줌

#p209 5-25
phone_list1 = ["010-3654-2637", "010-3984-5377", "00-3554-0973"]
print(phone_list1)

phone_list2=[]
for number in phone_list1:
  x=number.replace("-", "")

phone_list2.append(x)
print(phone_list2)

#p210 5-26

sentences=["Love me, love my dog.", "No news is good News.", "Blood is thicker than water."]
for sentence in sentences:
  x= sentence.replace(" ","_")
  print(x)

#p218 C5-5
questions = ["s_hool","compu_er","deco_ation","windo_","hi_tory"]
answers=["c","t","r","w","s"]

for i in range(0, len(questions)) :
  q="%s : 밑줄 안에 들어갈 알파벳은?" %questions[i]
  guess=input(q)

  if (guess ==answers[i]) :
    print("정답!")
  else :
    print ("틀렸어요!")

#p219 C5-6
scores=[]
while True:
  x=int(input("성적을 입력하세요 (종료시 -1 입력):"))

  if x==-1:
    break
  else :
    scores.append(x)

  sum=0
  for score in scores:
    sum= sum+score

  avg=sum/len(scores)
  print("합계: %d, 평균: %.2f" %(sum, avg))