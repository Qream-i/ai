#속성 : 자바에서 필드, 변수
# class A {
#   int k =10; #인스턴스 필드 
#   static int sk = 10; #정적 필드
# }

class Student :
  pet = []
  def push_pet(self,x):
    self.pet.append(x)

john = Student()
john.push_pet("고양이")
print(john.pet)
john.push_pet("강아지")
print(john.pet)