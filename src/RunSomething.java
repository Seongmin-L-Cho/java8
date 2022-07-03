
@FunctionalInterface // 이게 있으면 함수형 인터페이스란걸 강제로 선언. 2개 넣으면 오류남
public interface RunSomething {

    void doIt();

    // 함수형 인터페이스 -> 추상 메소드를 딱 하나만 가지고 있는 인터페이스
}
