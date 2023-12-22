#딕셔너리 key-value (자바의 맵)
score = {"kor":90,"eng":89,"math":95}
print(score["kor"])
user={"id":"kim55", "name":"강성준", "level":"7","point":10000}
#전체 출력하기
for uKey in user :
  print(f"{uKey} - {user[uKey]} ~~")


print(user["id"])
print (user["level"])
#추가하기
score["music"]=100
print(score)
user["vip"] = "우수회원"
print(user)

#수정하기
score["music"] = 80
print(score)
user["vip"]="최우수회원"
print(user)

#삭제하기
score.pop("music")


#반복문을 이용한 딕셔너리 처리
area_code = {"02":"서울", "051":"부산", "053":"대구", "062":"광주"}
for k in area_code: #key값이 자동으로 k로 한개 씩 넘어감
  print(f"{k} - {area_code[k]}")

sk=""
for k in area_code:
  sk=sk+k+" "
print(sk)