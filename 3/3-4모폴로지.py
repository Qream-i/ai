#3-4모폴로지.py

import cv2 as cv
import numpy as np
import matplotlib.pyplot as plt

img = cv.imread('JohnHancocksSignature.png', cv.IMREAD_UNCHANGED)

t,bin_img=cv.threshold(img[:,:,3], 0, 255, cv.THRESH_BINARY + cv.THRESH_OTSU)
plt.imshow(bin_img, cmap='gray'), plt.xticks([]), plt.yticks([])
plt.show()

b=bin_img[bin_img.shape[0]//2:bin_img.shape[0], 0:bin_img.shape[0]//2+1]
plt.imshow(b,cmp='gray'), plt.xticks([]), plt.yticks([])
plt.show()

