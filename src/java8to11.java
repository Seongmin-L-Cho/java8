import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class java8to11 {

    public static void main(String[] args){
        List<String> name = new ArrayList<>();
        name.add("abc");
        name.add("def");
        name.add("ghk");
        name.add("ㅋㅌㅊ");
//        name.forEach(System.out::println); //메서드 레퍼런스 | 이터레이터

//        Spliterator<String> spliterator = name.spliterator();
//        Spliterator<String> spliterator1 = spliterator.trySplit(); // 기존 spliterator 반으로 나눈다
//        ghk
//        ㅋㅌㅊ
//         ====
//        abc
//        def
        // 결과
//        while(spliterator.tryAdvance(System.out::println));
//        System.out.println("====");
//        while(spliterator1.tryAdvance(System.out::println)); // tryadvance hasnext 비슷한 기능

        name.removeIf(s->s.startsWith("a")); // a로 시작하면 지운다

        Comparator<String> comparator = String::compareToIgnoreCase;// 문자순 정렬
        name.sort(comparator.reversed() ); //comparator.thenComparing() thenComparing 추가 비교 필요
        // comparator ->


        // webMvcConfigure
    }

}
