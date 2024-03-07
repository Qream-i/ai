# 4-2캐니에지실험하기.py
# 거짓긍정을 줄이기 위해 없는 에지를 그려주는 것 - 캐니에지 이용

import cv2 as cv

img=cv.imread('soccer.jpg')

gray = cv.cvtColor(img, cv.COLOR_BGR2GRAY)

canny1=cv.Canny(gray,50,150)
canny2=cv.Canny(gray,100,200)

cv.imshow('Original',gray)
cv.imshow('Canny1',canny1)
cv.imshow('Canny2',canny2)

cv.waitKey()
cv.destroyAllWindows()
