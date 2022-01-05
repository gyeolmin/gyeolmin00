public class gyeol_01 {
	
	
	//메서드 호출
	public static void main(String[] args) {
		carSpeedCheck("고속도로", 110);
	}
	
	
	
	//메서드 선언
	public static void carSpeedCheck(String streetType, int speed) {
		
		System.out.println("현재 구간은 " + streetType + " 입니다."); //입력된 구간명
		System.out.println("현재 속도는 " + speed + "km/h 입니다."); //입력된 속도
		
		System.out.println((streetType.equals("고속도로"))); //구간 판단 true or false
		System.out.println((streetType.equals("일반도로")));
		System.out.println((streetType.equals("어린이보호구역")));
		
		
		//고속도로
		if(streetType.equals("고속도로")) {
			System.out.println("현재 " + streetType + " 주행 중 입니다.");
			if(speed <= 99) {
				System.out.println("정상 속도 주행 중 입니다.");
			}
			else {
				System.out.println("제한속도 초과 입니다. 속도를 줄이세요.");
			}
			
		}
		
		
		//일반도로
		else if(streetType.equals("일반도로")) {
			System.out.println("현재 " + streetType + " 주행 중 입니다.");
			if(speed <= 79) {
				System.out.println("정상 속도 주행 중 입니다.");
			}
			else {
				System.out.println("제한속도 초과 입니다. 속도를 줄이세요.");
			}
		}
		
		
		//어린이보호구역
		else if(streetType.equals("어린이보호구역")) {
			System.out.println("현재 " + streetType + " 주행 중 입니다.");
			if(speed <= 29) {
				System.out.println("정상 속도 주행 중 입니다.");
			}
			else {
				System.out.println("제한속도 초과 입니다. 속도를 줄이세요.");
			}
		}
		
		
		//이외
		else {
			System.out.println("알 수 없는 구간 입니다.");
		}
	}
}