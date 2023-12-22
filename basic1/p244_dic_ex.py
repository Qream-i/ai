#딕셔너리 생성
inventory = {"메로나" : [300,20],
              "비비빅" :[400,3],
              "죠스바":[250,100]}

#메로나 가격?
print(inventory["메로나"][0], "원", sep="")
#죠스바의 재고는
print(inventory ["죠스바"][1],"개",sep="")
#월드콘 추가 1500, 50개
inventory["월드콘"]=[1500,50]
print(inventory)
inventory["죠스바"] = [250,100]
#아이스크림 품목수는 요소와 갯수
print ( len(inventory), "종류")
#아이스크림 종류는
for key in inventory :
  print (key, end="")
print ()

#메로나 300 20 6000
#비비빅 400 3 1200
#죠스바 250 100 25000
for i in inventory:
  t=inventory[i][0] * inventory[i][1]
  print ( f"{i} {inventory[i][0]}원 {inventory[i][1]}개 {t}원")
print("메로나", inventory["메로나"][0], inventory["메로나"][1], inventory["메로나"][0]*inventory["메로나"][1])
print("비비빅", inventory["비비빅"][0], inventory["비비빅"][1], inventory["비비빅"][0]*inventory["비비빅"][1])
print("죠스바", inventory["죠스바"][0], inventory["죠스바"][1], inventory["죠스바"][0]*inventory["죠스바"][1])