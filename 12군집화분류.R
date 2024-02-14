mydata <- iris[,1:4]
fit <- kmeans( x=mydata, centers=4)
fit
fit$cluster # 각 데이터에 대한 군집번호
head(iris)
iris[107:127,]
fit$centers # 중심좌표
fit$size # 각 군집의 포인트수 (관찰값 수)
fit$totss

# 군집 시각화
library(cluster)
clusplot(mydata, fit$cluster, color=T, shade=T, labels=2, lines=0)
