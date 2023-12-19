#182 리스트
list1 = [1, 1.1, "문자", [1,9], 7, 8]
#이런식으로 요소는 다양해도 괜찮음 
print(list1[1:5:3])

list1 = [3, 15, -12.5, "사과", "딸기"]
print(list1)
print(type(list1))

#리스트를 만드는 방법
#방법1) 변수=[요소1, 요소2]
#방법2) list() 함수를 사용하기

list2 = list(range(1,21,2))
print(list2)
print(type(list2))

list3 = list("abcdef")
print(list3)
print(type(list3))

color = ["빨강", "주황", "노랑", "초록", "파랑", "남색", "보라"]
print(color[0])
print(color[5])
print(color[2:6])
print(color[-3])
print(color[-4:-1])

print(color)
print(color[:])
print(color[::])

list6=(color[1], color[4], color[5])
print ( list6 )
print(type(list6))

#반복문과 리스트
#for i in color:
#   변수  리스트  color = ["빨강", "주황", "노랑", "초록", "파랑", "남색", "보라"]

for i in color:
  print("나는 %s를 좋아합니다" %i)