#튜플-수정안된다. 용도-변동 불가한 것
t=(1,2)
t1=1,2
print(t[0])
print(t1[1])
print(type(t1))
t2=1,
print(type(t2))
#소괄호는 생략 가능, 1개요소(1,)
animals = ("토끼", "거북이", "사자", "여우")
print(animals[:])
#토끼를 돼지로
#일부로 수정이 안되도록 하려고 위처럼 만듦
#바꾸려면 list()로 바꿨다가 다시 tuple()로
ani_list = list(animals)
print (type(ani_list))
ani_list[0] = "돼지"
animals = tuple(ani_list)
print(animals)

#예제 6-3
n=tuple(range(10,21))
print(n)
print("n[0]=", n[0])
print("n[2:5]=", n[2:5])
print("n[2:]=", n[2:])
print("n[:5]=", n[:5])
print("n[-2]=", n[-2])
print("n[::-1]=", n[::-1])


#실습
t1=('valentine',2,14,'gift')
t2=('love',)
