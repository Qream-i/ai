import time

seconds = time.time()
print(seconds)

#타임스탬프를 가지고 그리니치 표준시 구하기
tm = time.gmtime()
print(tm)

#localtime 함수는 타임스탬프로 현재 시간을 얻는데 사용
tm=time.localtime(seconds)
print(tm)

print ("시작")
time.sleep(10)
print("끝")

def func():
  sum = 0
  for i in range (1,100001) :
    sum+=1
  print(sum)

start = time.time()
func()
end=time.time()
