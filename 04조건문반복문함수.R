for( k in 2:9) {
  for( i in 1:9 ) {
    cat( k, ' * ', i, ' = ', k*i, '\n'  )
  }
}

class( iris )
head( iris )  

norow <- nrow(iris)
mylabel <- c() # 빈 벡터 만들기 
for( i in 1:norow ){
  if(iris$Petal.Length[i]<=1.6 ) {
    mylabel[i] <- 'L'
  }else if( iris$Sepal.Length[i]>=5.1){
    mylabel[i] <- 'H'
  }else{
    mylabel[i] <- 'M'
  }
}
mylabel
newds <- data.frame( iris$Petal.Length, mylabel)
head(newds)
table(newds$mylabel)

# 1. 다음의 각 문제를 해결하기 위한 R 코드를 작성하시오.

# (1) 1~100 사이의 정수 중 3의 배수들의 합과 개수를 구하시오. 
sum <- 0
cnt <- 0
for( i in 1:100) {
  if( i%%3 == 0 ){
    sum <-  sum + i
    cnt <-  cnt + 1
  }
}
sum
cnt

# (2) 101~200 사이의 숫자 중 3과 4의 공배수를 출력하시오. 
for( i in 101:200) {
  if( i%%3 == 0 & i%%4==0) {
    print(i)
  }
}

# (3) 24의 약수(1,2,3,4, 6,8 12,24) 를 출력하시오. 
for( i in 1:24){
  if( 24%%i == 0){
    print(i)
  }
}

# (4) 10!을 출력하시오.(단, factorial() 함수를 이용하지 않는다.)  10 X9X 8X 7 6 5 4 3 2 1
fac <- 1
for( i in 10:1){
  fac <-  fac * i
  print(i)
}
fac

# 2번 * 출력
for( i in 1:6){
  for( j in 1:i) {
    cat('*')
  }
  cat('\n')
}

# 3
i <- 1
sum <- 0
while( i <= 9 ){
  sum <-  sum + i^2 
  i <- i + 1
}
sum

#4
score <- 80
result <- ifelse( score>60,  'Pass', 'Fail' )
result

#5
prime <- c()
for(i in 2:1000){
  for(j in 2:i){
    if(i %%j ==0) break
  }
  if(j==i)
    prime <-c(prime,i)
}
prime

#6
fibo <- c(0,1)
while (length (fibo)<40 ){
  f.1 <- fibo[length(fibo) -1]
  f.2 <- fibo[length(fibo)]
  fibo <- c(fibo, f.1+f.2)
}
fibo


#apply
apply(iris[, 1:4], 1, mean)
head (iris)
apply(iris[, 1:4], 2, mean)
dim(iris)

# 7. R의 apply() 함수를 이용하여 다음 문제를 해결하는 R 코드를 작성하시오.
#
#(1) iris 데이터셋의 행별 합계를 출력하시오.
apply(iris[,-5], 1, sum)

#(2) iris 데이터셋의 열별 최댓값을 출력하시오.

apply(iris[,-5], 2, max)
