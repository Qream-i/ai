# 1. 결측값
z <- c(1,2,3,NA,5,NA,8)
sum(z)
is.na(z)
sum(z,na.rm=T)

m <- mean(z,na.rm=T)
m
sd(z, na.rm=T)
z [ is.na(z) ] <- 0
z

z[ is.na(z) ]<-m

#결측값을 대체한 것을 새로운 벡터로 지정하기
z.new <- as.vector(z)


DF <- data.frame(x = c(1, 2, 3), y = c(0, 10, NA))
na.omit(DF)


z <- c(1,2,3,NA,5,NA,8)
na.omit.new <- na.omit(z)
na.omit.new
na.new.ds <- as.vector(na.omit.new)
na.new.ds

# 2차원 결측값 처리 방법 찾기, 제거, 수정
x <- iris[1:50,]
x
x[1,2] <- NA; x[1,3] <- NA; x[2,3] <- NA; x[3,4] <- NA; 
head(x)

# 찾기 - 반복문 사용
# 열에 있는 것 찾기
ncol(x)
for( i in 1:ncol(x) ){
  this.na <- is.na( x[  ,i ] )
  cat( i, '열 ', sum( this.na ), '\n' )
}

# 행에 있는 것 찾기
ncol(x)
for( i in 1:ncol(x) ){
  this.na <- is.na( x[  i, ] )
  cat( i, '행 ', sum( this.na ), '\n' )
}

# 1. 다음과 같이 결측값이 포함된 데이터셋 ds를 생성한 후, 다음 문제를 해결하기 위한 R 코드를 작성하시오.

 ds <- mtcars
 ds[2,3] <- NA; ds[3,1] <- NA; ds[2,4] <- NA; ds[4,3] <- NA

# (1) 각 열별로 결측값이 몇 개인지 출력하시오.
 ncol(ds)
 for( i in 1:ncol(ds) ){
   this.na <- is.na( ds[  , i ] )
   cat( i, '열 ', sum( this.na ), '\n' )
 }
# (2) 결측값이 포함된 행들의 데이터를 출력하시오.
 nrow(ds)
 idx<-c()
 for( i in 1:nrow(ds) ){
   if( sum ( is.na(ds[i,]))>0){
     c(idx,i)
   }
 }
 head(ds)
# (3) 결측값이 포함된 행은 몇 개인지 출력하시오.
 cnt 
# (4) 결측값이 포함된 행들을 제외하고 새로운 데이터셋 ds.new를 만들어보시오.

 
 st<-data.frame(state.x77)
boxplot(st$Income)
income.out <- boxplot.stats(st$Income)$out
income.out
boxplot(st$Population)

popu.out <- boxplot.stats(st$Population)$out
popu.out

income.out <- boxplot.stats(st$Income)$out
income.out
st$Income[st$Income == income] <-NA
st$Income

popu.out <- boxplot.stats (st$Population)$out
st$Population
# st$Population 값 중에서 popu.out안에 변수값이 있으면 참
st$Population [st$Population %in% popu.out] <- NA
st$Population

#NA 제거하기
dim(st)
st.new <- st[complete.cases(st), ]
dim(st.new)

st.new1 <- st[ , complete.cases((st))]

st.new2 <- na.omit(st)
head(st.new2)
dim(st.new2)

# 3. R에서 제공하는 airquality 데이터셋에 대해 다음의 문제를 해결하기 위한 R 코드를 작성하시오.
# 
# (1) airquality를 AQ에 저장하시오.
AQ <- airquality
head(AQ) 
# (2) AQ에서 열별로 NA의 개수를 출력하시오.
for (i in 1 : ncol ( AQ )){
  cnt <- sum( is.na(AQ [ , i]))
  cat ( names(AQ[i]), ' : ', cnt, '개', '\n') 
}
AQ
# 
# (3) AQ에서 행별로 NA의 개수를 출력하시오.

for(i in 1:nrow (AQ)){
  cnt <- sum (is.na(AQ[i, ]))
  cat(i, '행의 결측값의 갯수 : ', cnt, '개 \n')
  
}
# 
# (4) AQ에서 NA를 포함하지 않은 행들만 출력하시오.
AQ.notNA <- na.omit (AQ)
AQ.notNA
AQ.notNA2 <- AQ[ complete.cases(AQ), ]
AQ.notNA2
# (5) AQ에서 NA를 NA가 속한 열의 평균값으로 치환하여 AQ2로 저장하고, AQ2의 내용을 출력하시오.
col.mean = colMeans(AQ,na.rm=T) # NA를 뺀 칸의 평균
col.mean
AQ2 <- AQ
for(i in 1:ncol (AQ2)){
  AQ[ is.na(AQ2 [ ,i]) ,i] <- col.mean[i]
}
head(AQ)

# 4. R에서 제공하는 state.x77 데이터셋에 대하여 다음 문제를 해결하기 위한 R 코드를 작성하시오.
state.x77
# (1) state.x77 데이터셋을 Population(인구수)를 기준으로 오름차순 정렬하시오.
order (state.x77[,'Population'])
state.x77[ order (state.x77[,'Population']),  ]

head(state.x77)
# (2) state.x77 데이터셋을 Income(소득)을 기준으로 내림차순 정렬하시오.
state.x77[ order (state.x77[,'Income'],  decreasing=T), ]
# (3) Illiteracy(문맹률)가 낮은 상위 10개 주의 이름과 문맹률을 출력하시오.
temp<- state.x77[order (state.x77[,'Illiteracy'], decreasing =T), ]
head(temp, n=15)
temp[1:10, 'Illiteracy']

# 5. R에서 제공하는 mtcars 데이터셋에 대하여 다음 문제를 해결하기 위한 R 코드를 작성하시오
# 
# (1) mtcars 데이터셋을 gear(기어)의 개수에 따라 그룹을 나누어 mt.gear에 저장하시오.(단, split() 함수를 사용하시오.)
# 
# (2) mt.gear에서 gear(기어)의 개수가 4인 그룹의 데이터를 출력하시오.
# 
# (3) mt.gear에서 gear(기어)의 개수가 3인 그룹과 5인 그룹의 데이터를 합쳐서 mt.gear.35에 저장하고 내용을 출력하시오.
# 
# (4) mtcars 데이터셋에서 wt(중량)가 1.5~3.0 사이인 행들을 추출하여 출력하시오



subset (iris, Species == 'setosa')
subset (iris, iris$Sepal.Length > 7.6, select =c(Seqal.Length,Species))
subset (iris, iris$Sepal.Length>7.6)[, c('Sepal.Length','Species')]

# 8. mtcars 데이터셋에서 10개의 행을 임의로 추출하여 mt10에 저장하고, 나머지 행들은 mt.other에 저장하시오. 그리고 mt10과 mt.other의 내용을 출력하시오.
sample (1:nrow(mtcars), size=10, replace = F)
mt10
mt.other <- mtcars [-mt10]




# 11. iris 데이터셋에서 3개의 Species(품종)를 2개씩 짝지어 출력하시오.
iris$Species
sp <- unique (iris$Species)
sp
combn(sp,2) 

# 12. banana, apple, melon,, peach, mango를 3개씩 짝지어 출력하시오.
fruits <- c('banana','apple','melon','peach','mango') 
combn(fruits,3)

aggregate (iris [, 1:4], by=list (iris$Species), FUN=mean)


# 7. mlbench 패키지에서 제공하는 Ionosphere 데이터셋에 대해 다음의 문제를 해결하기 위한 R 코드를 작성하시오.
# 
# (1) 다음과 같이 Ionosphere 데이터셋을 myds에 저장하시오.
install.packages('mlbench')
library(mlbench)
data("Ionosphere")
myds <- Ionosphere
myds 
# (2) myds에서 class 와 V1열의 값을 그룹으로 하여 V3~V10 열의 값들의 표준편차를 출력하시오. (주의: 집계 작업시 팩터 타입의 열은 제외해야 한다).

##################################
# 병합 - merge (데이터셋1, 데이터셋2, by=병합할 열의 이름)
#         all=T (외부조인) 또는 all.x=T (왼쪽 외부조인) 또는 all.y=T(오른쪽 외부조인)
##################################

x<- data.frame(name=c('a','b','c'), math=c(90,80,40))
x
y<- data.frame(name=c('a','b','d'), korean =c(75,60,90))
y
z<- merge(x,y,by=c('name'))
z
z1<-merge(x,y, by=c('name'), all.x=T)
z1
z2<-merge(x,y, by=c('name'), all=T)
z2
z3<-merge(x,y, by=c('name'), all.y=T)
z3

# 14. 다음 문제를 해결하기 위한 R 코드를 작성하시오.
# 
# (1) 제공된 파일 중 subway.csv와 subway_latlong.csv 파일을 읽은 후 병합하여 subway.tot에 저장하시오(병합 기준 열은 STATION_CD와 station).
subway <- read.csv( 'D:/ai/study/r_study/subway.csv', header = TRUE, fileEncoding = "CP949", encoding = "UTF-8")
subway.latlong <- read.csv( 'd:/ai/study/r_study/subway_latlong.csv', header = TRUE, fileEncoding = "CP949", encoding = "UTF-8")
head( subway )
head( subway.latlong  )

subway.tot <- merge( subway, subway.latlong, by.x=c('station'), by.y=c('STATION_CD'),   )
head( subway.tot )

# (2) subway.tot에서 역 이름과 날짜를 기준으로 on_tot(탑승 인원)과 off_tot(하차 인원)을 집계(합계)하여 출력하시오.

agg <- aggregate( subway.tot[, c(  'on_tot','off_tot'   )],  
                  by=list( 역이름=subway.tot$stat_name, 날짜=subway.tot$income_date   ), 
                  FUN=sum )
head( agg )
tail( agg )
# (3) subway.tot에서 2011년도에 대해서만 역 이름을 기준으로 on_tot(탑승 인원)과 off_tot(하차 인원)을 집계(합계)하여 출력하시오. 
# 1단계 2011년도만 추출
condi <- subway.tot$income_date >= 20110101 & subway.tot$income_date <= 20111231
# 2단계 집계함수
aggregate( subway.tot[ condi,  c('on_tot', 'off_tot') ], 
           by=list(역이름=subway.tot$stat_name[condi]), 
           FUN=sum
)
# (4) subway.tot에서 2011년도에 대해서 LINE_NUM(호선)별 on_tot(탑승 인원)과 off_
# tot(하차 인원)을 집계(합계)하여 출력하시오.
aggregate( subway.tot[ condi, c('on_tot', 'off_tot') ], 
           by=list(호선별=subway.tot$LINE_NUM[condi]),
           FUN=sum
)


# 15. 다음의 문제를 해결하기 위한 R코드를 작성하시오.
# (1) 다음과 같이 데이터프레임 authors와 books를 생성하고 authors와 books의 내용을 출력하시오.
# 
authors <- data.frame(
  surname = c("Twein", "Venables", "Tierney", "Ripley", "McNeil"),
  nationality = c("US", "Australia", "US", "UK", "Australia"),
  retired = c("yes", rep("no", 4)))
books <- data.frame(
  name = c("Johns", "Venables", "Tierney", "Ripley", "Ripley", "McNeil"),
  title = c("Exploratory Data Analysis",
            "Modern Applied Statistics ...",
            "LISP-STAT",
            "Spatial Statistics", "Stochastic Simulation",
            "Interactive Data Analysis"),
  other.author = c(NA, "Ripley", NA, NA, NA, NA))
authors
books

# (2) surname과 name을 공통 열로 하여 authors와 books를 병합하여 출력하시오(두 데이터프레임에서 공통 열의 값이 일치하는 것들만 병합).
n <- merge (authors, books, by.x=c('surname'),by.y=c('name') )
n
# (3) surname과 name을 공통 열로 하여 authors와 books를 병합하여 출력하되 authors의 행들이 모두 표시되도록 하시오.
merge (authors, books, by.x=c('surname'),by.y=c('name'), all.x=T )
# (4) surname과 name을 공통 열로 하여 authors와 books를 병합하여 출력하되 books의 행들은 모두 표시되도록 하시오.
merge (authors, books, by.x=c('surname'),by.y=c('name'), all.y=T ) 
# (5) surname과 other.author를 공통 열로 하여 authors와 books를 병합하여 출력하시오.
merge (authors, books, by.x=c('surname'),by.y=c('name'),all=T )
