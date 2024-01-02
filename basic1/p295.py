x='A'
print(ord(x))

print()

x=round(7.25678)
print(x)

x= max (10,9,-20)
print(x)
x=min([1,5,0,7])
print(x)
x=max((10,8,7,20))
print(x)
x=min({10,98,67,10})
print(x)
x=min({1:"a", 0:"b",-1:"c"})
print(x)

#세제곱의 합계 구하기
def square_sum(n):
  sm=0
  for i in range(1, n+1):
    sm=sm+i*i*i
  return sm
n=int(input("n의 값을 입력하시오."))
print(square_sum(n)) 


#c8-1 풀기
def square_sum(n):
  sm=0
  for i  in range (1,n+1):
    sm= sm+(i*i*i)
    print("%d*%d*%d" %(i,i,i), end="")
    if i==n:
      print("=", end="")
    else :
      print("+", end="")
  print(sm)

N=int(input("N의 값을 입력하세요 : "))
square_sum(N)