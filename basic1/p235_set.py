#set형
color_list = {'red', 'blue', 'red', 'green'}
print(color_list)
p={1,2,'red','blue'}
plus=color_list & p # &교집합
print(plus)
plus=color_list | p # |합집합
print(plus)
plus=color_list - p # -차집합
print(plus)

a={1,2,3}
#3 바꾸기
a.update({1,2,4})
print(a)
a.remove(3)
print(a)
b={10,11}
b.add(20)
print(b)
b.update({5})
print(b)