2+3
2^3
10%%3
log(10)
log(10, base = 2)
sin(60)
tan(45)
pt
pi
pi=3.14
sin(pi/2)
name <- '홍길동' # <- 단축키는 - alt
name

25+99

2*(3+4)
 456-123
(3+5*6)/7 
(7-4)*3 
210+35 
12356%%7
1256%%7
184%%5
1976/24
16*25+186*5-67*22

area1<-12*12*pi
area1

log(sqrt(8),base=2)
x <-c(1,2,3)
x
y <- c('a','b','c')
y
z <- c(TRUE, TRUE, FALSE, FALSE)
z

num1 <- 1:100
num3 <- c(100:300, 400:500)
num3

help(seq)
seq(from=1, to=100, by=2) #정상적인 형식
seq(1,100,2) #약식
#99 97 ... 1
seq(from=99, to=1, by=-2)

help(rep)

rep(1:4, 2)
rep(1:4, each=2)
rep(1:4, c(2,3,4,5))

score <- c(90,85,70)
score

names(score)
names(score) <- c('김수진','이영미','최진수')

# 부분적으로 출력하고 싶을 때
score[1]
score['이영미']
score[3]


x1 <- 10:14
y1 <- 20:26
x1+y1


d <- 1:10
sum(d)
sum(2*d)
length(d)
mean(d)

d<- 100:200
d
d[-10]
d[0:-10]
d[0:10]
d[10]
d[1:90]
d[d%%2==1]
d[d%%3==0]

d1 <- 1:50
d2 <- 51:100

d1
d2
length(d2)
d1+d2
d2-d1
d1*d2
d2/d1
sum(d1)
sum(d2)
max(d2)
min(d2)
avg(d2)
sum(d2)/length(d2)
sum(d1)/length(d1)
decs(d1)
desc[d]

v1 <-51:90
v2=int[v1<60]
v1[v1<60]
length(v1[v1>65])
v1[v1<65|v1>80]
v1[v1%%7==3]
v1[v1%%7 !=0]
sum(v1[v1%%2==0])


#list
ds <-c(90,85,70,84)
my.info <- list(name="Tom", age=60, status=TRUE ,score=ds)
my.info
my.info[1]
my.info[[1]]

#12

a <- c('Korea', 'Japan', 'China', 'Korea', 'India', 'China', 'Korea')
f<- factor(a)
f
f[4]
levels (f)
as.integer(f)
