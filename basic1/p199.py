# 병합, 합계, 순서 거꾸로, 정렬, 복사
person1 = ["kim",24,"kim@naver.com"]
person2 = ["lee",35,"lee@hanmail.net"]

person = person1 + person2
print(person)

scores =[80, 90, 85, 95, 100]
sm=sum(scores)
avg= sm/len(scores)
print("합계:", sm)
print("평균:", avg)

#리스트 안에 문자가 섞여있을때 sum() > 에러
data = [1,2,8.9]
sm=sum(data)
print(sm)

jumsu=list(range(90, 101,1))
avg=sum(jumsu)/len(jumsu)
print(avg)

data=["사과", "배", "귤", "딸기"]
data.reverse()
print(data)

#복사하기
fruits=["apple", "banana", "orange"]
print(fruits)

x=fruits.copy()
print(x)

xx=fruits#fruit 리시트의 주소를 xx변수에 넣는 것. 같은메모리
print(xx)
print(type(xx))
fruits.insert(1, "pineapple")
print(fruits)

# 정렬하기
data = [12,8,15,32,-3,-20,15,34,6]
data1 =['a','A','c','!','한글','가나']

data.sort()
print(data)

data1.sort()
#숫자 섞이면 안되고, 유니코드로 올림차순정렬
print(data1)

data.sort(reverse=True)
#내림차순
print(data)

data1.sort(reverse=True)
#내림차순
print(data1)