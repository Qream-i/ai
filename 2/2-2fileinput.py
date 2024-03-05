import cv2 as cv #open cv 사용
import sys # 운영체제 사용

img = cv.imread('soccer.jpg')
if img is None:
    sys.exit('파일을 찾을 수 없습니다.')

cv.imshow('soccer image', img) 

cv.waitKey () # 멈추기   
cv.destroyAllWindows() # 