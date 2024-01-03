#생성자

#자바식 코드
# class P {
#   void P(String name, int age){
#       //생성자 용도: 객체생성하면서 초기화 할 때
#   }
# }

#클래스 설계
class Members:
  def __init__(self) : #생성자 __init__
    self.name = None
    self.age = None
    self.gender = None
  def __init__(self, name= None, age= None, gender= None) : #생성자 __init__
    self.name = name
    self.age = age
    self.gender = gender
  def show_info(self):
    print("이름: ", self.name)
    print("나이: " , self.age )
    print("성별: ", self.gender)

#클래스 사용
m1 = Members("홍길동", 25)
m1.show_info()