package kr.or.connect.diexam01;

public class Car {
	//필드
	private Engine v8;

	//디폴트 생성자
	public Car() {
		System.out.println("Car 생성자");
	}
	
	//엔진메서드 실행될때 엔진 받아와서 car엔진에 넣음
	public void setEngine(Engine e) {
		this.v8 = e;		
	}
	
	//run메소드
	public void run() {
		System.out.println("엔진을 이용하여 달립니다.");
		v8.exec(); //v8엔진을 이용해서 달림
	}
	
	
	public static void main(String[] args) {
		Engine e = new Engine();
		Car c = new Car();
		c.setEngine(e);
		c.run();
		//순서 유의해서 잘 보기!
		//이런 과정을 spring의 bean에 등록하고 대신 해주도록 함!(applicationContext.xml에 빈 등록)
	}
	
}
