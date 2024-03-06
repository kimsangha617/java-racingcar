package day01;

/**
 * 요구사항 1
 *  ㄴ "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
 *  ㄴ "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
 * 힌트
 *  ㄴ 배열로 반환하는 값의 경우 assertj의 contains()를 활용해 반환 값이 맞는지 검증한다.
 *  ㄴ 배열로 반환하는 값의 경우 assertj의 containsExactly()를 활용해 반환 값이 맞는지 검증한다.
 * 요구사항 2
 *  ㄴ "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다.
 * 요구사항 3
 *  ㄴ "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
 *  ㄴ String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
 *  ㄴ JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.
 */
public class StringSplitPlayground {

    public String[] splitString(String requirements) {
        String delimiter = ",";
        String[] resultArray = new String[0];
        
        if (requirements.contains(delimiter)) {
            return resultArray = requirements.split(delimiter);
        }
        return resultArray;
    }

    public static void main(String[] args) {

        StringSplitPlayground stringTest = new StringSplitPlayground();
        String[] resultArray = stringTest.splitString("1,2");
        System.out.println(resultArray);
    }
}
