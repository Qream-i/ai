#파일 삭제하기
import os

if os.path.exists("new_file.txt"):
  os.remove("new_file.txt")
else:
  print("삭제하려는 파일이 없어요.")


#폴더 삭제하기
