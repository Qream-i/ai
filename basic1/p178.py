# for i in range (10):#0~9까지
#   print(i,end=" ")

# print("-"*10)
# for i in range (1,11) : #1~10까지
#   print (i, end=" ")

# print("-"*30)
# for i in range (11,0,-1) : # 11부터 1까지 밑으로
#   print (i, end=" ")

# print("-"*10)
# for i in "I love you!":
#   print (i, end=" ")

# sum=0
# j=1
# while True:
#   if sum >= 50 :
#     break
#   else : 
#     j+= 1
#     sum += j
# print(j, sum)

# #178 4-6
# #10! = 1*2*3* ... * 10
# fac = 1
# for i in range (1, 11) :
#   fac = fac * i 
# print (fac)

#S4-1
# count = 0
# for i in range(1, 1001) :
#   print( i, end=" ")
# for i in range(1, 1001) :
#   if i % 3 !=0 :
#     print (i, end=" ")
# count = 0
# for i in range (1, 1001) : 
#   if count == 10:
#     print()
#     count = 0
#   if i%3!=0:
#     print(i, end=" ")
#     count+=1
"""
i=1
count =0
while i<=1000 :
  if count ==10 :
    print ( )
    count=0
  if i % 3 != 0 :
    print (i, end=" ")
    count += 1
  i += 1

print()
#4-2 성적을 입력받아 등급 판정하기 'q' 입력하면 프로그램 종료
con = "y"
while con == "y" : 
  score = int (input ("성적을 입력하세요 : "))
  if 90<= score <=100:
    result = "수"
  elif 80<= score <=89:
    result = "우"
  elif 70<= score <=79:
    result = "미"
  elif 60<= score <=69:
    result = "양"
  elif 0<= score <=59:
    result = "가"
  print ( f"등급 : {result}")
  con = input ("계속하시겠습니까? (중단 : q, 계속 : y)")
print()
"""

#4-3 
start = int ( input("시작 수를 입력해주세요 :") )
end = int ( input("끝 수를 입력해주세요 :"))
x = True
for i in range(start, end+1) :
  x = True
  for j in range(2, i) :
    if i % j == 0 :
      x = False
      break
  if x : 
    print(i, end=" ")