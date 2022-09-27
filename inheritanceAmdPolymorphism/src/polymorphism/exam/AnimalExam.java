package polymorphism.exam;

public class AnimalExam {
	public static void main(String[] args) {
		Animal ani = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		
		ani.cry();
		dog.cry();
		dog.running();		
		cat.cry();
		cat.jump();		
		bird.cry();
		bird.fly();
	System.out.println();
	
	Animal aniCat = new Cat();
	Animal aniDog = new Dog();
	Animal aniBird = new Bird();
		
		
		aniCat.cry();
		
		aniDog.cry();
		
		aniBird.cry();
		
		System.out.println();
		
		//배열로 처리
		Animal[] aniArray = new Animal[] {new Dog(),new Cat(),new Bird()};
		
		for(Animal arr: aniArray) {
			arr.cry();
		}
		
		//부모 타입 => 자식 타입
		//형변환이 가능한지 확인 : instanceof
//		aniArray[0] instanceof Dog
//		aniArray[1] instanceof Cat
//		aniArray[2] instanceof Bird
		for(int i=0; i<aniArray.length; i++) {
			
			if(aniArray[i] instanceof Dog) {
			
			Dog childDog = (Dog)aniArray[i];
			
			}else if(aniArray[i] instanceof Cat) {
			
				Cat childCat = (Cat)aniArray[i];
			
			}else if(aniArray[i] instanceof Bird) {
			
				Bird childBird = (Bird)aniArray[i];
			
			}else {
				System.out.println("형변환 불가능한 타입입니다.");
			}
		}
		
		
		
		
	}
}
