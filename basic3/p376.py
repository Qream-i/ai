#csv 파일처리
import csv

# file_name = "./basic3/weather.csv"
# f=open(file_name, "r")
# lines = csv.reader(f)
# for line in lines:
#   print(line)
# f.close

# file_name = "./basic3/weather.csv"
# f=open(file_name, "r")
# lines = csv.reader(f)
# next(lines)
# for line in lines:
#   if line[1] == "2023-12-27 0:00 AM":
#     result = line[2]
#     print(result)
# f.close

read_file_name = "./basic3/weather.csv"
write_file_name ="./basic3/weather_온도.csv"
rf=open(read_file_name, "r")
wf = open(write_file_name,"w")
lines = csv.reader(rf)
wr = csv.writer(wf)
next(lines)
for line in lines:
  if line[1] != "2023-12-27":
    result = line[2]
    wr.writerow(result)
rf.close()
wf.close()