f2=open("./basic3/data.txt","r",encoding = "utf-8")
lines = f2.readlines() #리스트로 변환
print(lines)
for line in lines:
  data = line.split(",")
  i=0
  sum=0
  while i < len(data):
    if i ==0:
      print (data[i], end =":")
    else:
      sum += int(data[i])
    i=i+1
  avg = sum / (len(data)-1)
  print("합계는 : %d점" % sum)
  print("평균은 : %.2f점" %avg)
f2.close()