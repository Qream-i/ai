#p248 E 예제
year_sale = {"2016":237, "2017":98,"2018":158,"2019":233,"2020":120}
#6-1
for key in year_sale:
  if key=="2017" :
    print("%s년 자동차 판매량 : %d대" %(key, year_sale[key]))

#6-2
sm=0
for key in year_sale:
  if key == "2018" or key == "2019" :
    print("%s년 자동차 판매량 : %d" %(key, year_sale[key]))
    sm=sm+year_sale[key]
print("2년간 자동차 판매량 %d대" %sm)

#6-3
sm=0
for key in year_sale:
  sm=sm+year_sale[key]

avg = sm/len(year_sale)
print("5년간 총 판매량 : %d" %sm)
print("5년간 연 평균 판매량 : %d" %avg)

#6-4
big_year=2016
biggest=year_sale["2016"]
for key in year_sale:
  if year_sale[key] >= biggest:
    big_year=key
    biggest=year_sale[key]
print("판매량이 가장 많은 해 : %s년" %big_year)
print("판매량 : %d대" %biggest)

#6-5
person = {"name":"홍길동","age":30,"family":5,"children":["선미","성진","소영"],"pets":["강아지","고양이","이구아나"]}

