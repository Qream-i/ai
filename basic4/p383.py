#딕셔너리를 json으로 인코딩학
import json

member = {
            "id":"swhong",
            "name":"홍성우",
            "age":23,
            "history" :[
              {"data":"2021-03-15","route":"mobile"},
              {"data":"2020-06-23","route":"pc"}
            ]
          }

with open("./basic4/member.json","w",encoding="utf-8") as f:
  json.dump(member,ensure_ascii=False, indent=4)

