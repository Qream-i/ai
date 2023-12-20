#요소 변환 수정(삽입, 삭제, 업데이트)
"""
flowers =["목련", "벚꽃", "장미", "백일홍"]
print(flowers)
flowers[1]="무궁화" #수정
print(flowers)

flowers[3] = "개나리"
print(flowers)

flowers.append("백일홍")
print(flowers)
flowers.append("튜울립")
print(flowers)

#실무에서 리스트 어떻게 사용할까 
scores = []
while True :
  score = int(input("성적을 입력하세요 (종료 -1)"))
  scores.append(100)
  scores.append(90)
  scores.append(85)
  scores.append(100)
  scores.append(98)
  print (scores)
  """

#특정요소 위치찾기
number = [5, 20, 13, 7, 8, 22, 7, 17]
print (number)
idx = number.index(7, 5) #"7" 값의 인덱스를 찾되, 5번째 있는 인덱스 이후로 찾기
print(idx)


number = [5, 20, 13, 7, 8, 22, 7, 17, 8, 9, 8, 1]
print(number.index(8, 9, 11))


flowers=["목련", "벚꽃", "장미", "벚꽃", "백일홍", "벚꽃" ]
flowers.remove("목련")
print(flowers)
flowers.remove("벚꽃")
print(flowers)
#없는 꽃을 remove하면 error 남
x= flowers.pop(2)
print(x)
#pop은 지우면서 해당하는 문자를 return 함.
#remove는 해당하는 문자를 지우기만 함
flowers.clear
print(flowers)

#197
data=list(range(1,21))
for i in range(0, len(data)):
  print("%d" %data[i] ,end=" ")
print()
for i in range(0, len(data)):
  if (i+1) % 2 == 0 :
    print(data[i], end=" ")
print()
i=0
while i<len(data):
  print("%d"%data [i], end=" ")
  i+=2

print()
data = []
for x in range(10,21):
  data.append (x)

print(data)