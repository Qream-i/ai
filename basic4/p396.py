#클래스 : 설계도 (필드-변수, 함수-동작)
#객체 object :클래스를 메모리 올려서 실제 자료를 넣어주는 것
#메소드 : 클래스 안에 있는 함수, 동작하기
#필드 : 파이썬에서 속성

#클래스 만들기(정의)
class Person :
  name ="홍길동"
  list1=[] #빈 리스트 생성
  def method1() :
    print("메소드임")

#클래스를 사용하기
p1 = Person() #자바식으로 Perswon p1 = new Person()
print(p1.name)
p1.list1.append("aa")
print(p1.list1)
p1.method1()
p1.method2(25)