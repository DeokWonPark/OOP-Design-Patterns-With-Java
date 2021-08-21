# Yalco Design Pattern

> 본격적인 디자인 패턴 학습 전 전체적인 디자인 패턴의 종류, 활용가능한 부분 등을 사전학습하여 디자인 패턴 학습의 전반적인 틀을 사전에 공부해보고자 하는 의도로 시작하게되었습니다.

얄팍한 코딩사전 - https://www.yalco.kr/29_oodp_1/



<br/>

### 패턴 1. Singleton 패턴

`정의된 클래스의 객체가 하나만 생성되기를 원하는 경우 생성자를 private 하게 지정하여 의도적으로 객체 생성을 제한하는 패턴이다. `

- 클래스의 객체를 static하게 생성하여 getter를 통해 반환한다.
-  프로그램의 설정파일과 같이 프로그램의 전체적으로 통일되어야 하는 기능에 주로 사용된다.



> Settings.java 
>
> 다크모드와 폰트사이즈를 설정하는 클래스를 싱글톤 패턴을 적용하여 프로그램 전체의 세팅하는 부분을 하나로 통일 시켰다.

````java
public class Settings {
	
	private Settings() {} // private 생성자
	private static Settings set = null; // 1개의 객체만 생성하기때문에 클래스 멤버변수로 정의
	
	public static Settings getSettings() {
		if(set == null) {
			set = new Settings();
		}
		return set;
	}

	private boolean darkMode = false;
	private int fotSize = 16;

	public boolean isDarkMode() {
		return darkMode;
	}
	public void setDarkMode(boolean darkMode) {
		this.darkMode = darkMode;
	}
	
	public int getFotSize() {
		return fotSize;
	}
	public void setFotSize(int fotSize) {
		this.fotSize = fotSize;
	}
	
	
	@Override
	public String toString() {
		return "Settings [darkMode=" + darkMode + ", fotSize=" + fotSize + "]";
	}
}

````














