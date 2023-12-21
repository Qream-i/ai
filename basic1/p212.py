#문3)
jumsu = [ [10,20], [30,40,50], [60]]
print( sum(jumsu[0]) )
print( sum(jumsu[1]) )

#for 문을 이용해서 전체 합 구하기
sm=0
for i in range(0, len(jumsu)):
  sm+=sum(jumsu[i])
print ( sm )

#217쪽
strings = [["원두커피","라떼","콜라"], ["우동","국수","피자","파스타"]]
strings[1].remove("피자")
strings[1].remove("파스타")
for i in range(0, len(strings)):
  for j in range (0, len(strings[i])):
    print(strings[i][j])


#222쪽
seats=[[0,0,0,0,0,0,0,0,0,0],\
      [0,0,0,0,0,0,0,0,0,0],\
      [0,0,0,0,0,0,0,0,0,0],\
      [1,1,1,0,0,0,0,0,1,0],\
      [0,0,0,0,0,1,0,0,0,0],\
      [0,1,0,0,0,1,0,1,0,0],\
      [0,0,0,0,0,0,1,0,0,0],\
      [1,0,1,0,0,0,0,0,0,1]]

for i in range (0, len(seats)):
  for j in range(0, len(seats[i])):
    if seats[i][j] == 0 :
      print ("%3s" % "□", end="")
    else :
      print ("%3s" % "■", end="")
  print()


# seats=[[0,0,0,0,0,0,0,0,0,0],\
#       [0,0,0,0,0,0,0,0,0,0],\
#       [0,0,0,0,0,0,0,0,0,0],\
#       [0,0,0,0,0,0,0,0,0,0],\
#       [0,0,0,0,0,0,0,0,0,0],\
#       [0,0,0,0,0,0,0,0,0,0],\
#       [0,0,0,0,0,0,0,0,0,0],]
# for i in  range( 0, len( seats )):
#     print("%d행"%i, end=" ")
#     for j in  range( 0, len( seats[i] )):
#         if seats[i][j] == 0:
#             print("%3s" % "□", end="")
#     print()
# row = int(input("좌석예약하기 행을 입력하기"))
# colum =  int(input("좌석예약하기 열을 입력하기"))
# seats[ row ][colum ] = 1

# for i in  range( 0, len( seats )):
#     print("%d행"%i, end=" ")
#     for j in  range( 0, len( seats[i] )):
#         if seats[i][j] == 0:
#             print("%3s" % "□", end="")
#         else :
#             print("%3s" % "■", end="")    
#     print()

#224쪽
my_list=["p","y","t","h","o","n","i","s","f","u","n","!"]
print(my_list[5:11])
print(my_list[-5:-2])
print(my_list[8:])
print(my_list[:4])

# geni= ['I',' ','a','m',' ','a',' ','g','e','n','i','u','s','!']
# for i in range(0,len(geni)):
#   print(geni[i], end="")

# geni= ['I',' ','a','m',' ','a',' ','g','e','n','i','u','s','!']
# i=0
# while i<=len(geni) :
#   i=+1
#   break
# print(geni[i])

#심화무제
file_names=["file1.py", "file2.txt", "file3.pptx", "file4.doc"]
for file_name in file_names :
  fs = file_name.split(".")
  print(f"{file_name} => 파일명 : {fs[0]}, 확장자 : {fs[1]}")
  