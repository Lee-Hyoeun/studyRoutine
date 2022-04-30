package ch03Search;
// 자연스러운 정렬을 하려면 다음과 같은 방법으로 클래스를 정의

class  a7_1ComparableA implements Comparable<a7_1ComparableA> {// Comparable< a7_1ComparableA>인터페이스구현
	//필드, 메서드 등
	
	
	//compareTo 메서드 구현
	public int compareTo(a7_1ComparableA c) {
		return 0;
		// this가 c보다 크면 양의 값 반환
		// this가 c보다 작으면 음의 값 반환
		// this가 c와 같면 0변환
	}
	
	//equals 메서드 구현
	public boolean equals(Object c) {
		return false;
		// this가 c와 같으면 true반환
		// this가 c와 같지 않으면 false반환
		
		
	}
	

}
