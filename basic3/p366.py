f = open("new_file.txt", "w", encoding ="utf-8")

names = ["홍길동", "이수진", "최진영", "박수연"]

for name in names:
  f.write ( name + "\n")

print("파일 쓰기 완료")
f.close()

f=open("new_file1.txt","r",encoding="utf-8")

lines = f.readlines()
line = f.readline()
print("파일 읽기 완료")
print(lines)
print(line)
f.close()