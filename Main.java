public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요");

        // 매우 큰 배열 생성 (더 큰 배열 크기)
        int[] largeArray = new int[10000000]; // 1000만 개의 배열 생성
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i;
        }
        System.out.println("큰 배열 생성 완료");

        // 매우 큰 문자열 생성 (더 큰 문자열 생성)
        String largeString = "A".repeat(10000000);  // 1천만 개의 A 문자 생성
        System.out.println("큰 문자열 일부 출력: " + largeString.substring(0, 100));

        // 반복적으로 출력 (반복 횟수를 더 늘림)
        for (int i = 0; i < 1000000; i++) { // 100만 번 반복
            System.out.println("반복 출력: " + i);
        }

        // 불필요한 메서드 호출 (불필요한 메서드를 더 많이 추가)
        doSomething1();
        doSomething2();
        doSomething3();
        doSomething4();
        doSomething5();
        // 추가적으로 불필요한 메서드 호출...
    }

    public static void doSomething1() {
        System.out.println("불필요한 출력 1");
    }

    public static void doSomething2() {
        System.out.println("불필요한 출력 2");
    }

    public static void doSomething3() {
        System.out.println("불필요한 출력 3");
    }

    public static void doSomething4() {
        System.out.println("불필요한 출력 4");
    }

    public static void doSomething5() {
        System.out.println("불필요한 출력 5");
    }

    // 아래는 불필요한 주석들이 많이 추가됨
    /*
        이 주석은 매우 길고 반복적입니다.
        이 주석은 매우 길고 반복적입니다.
        이 주석은 매우 길고 반복적입니다.
        이 주석은 매우 길고 반복적입니다.
        이 주석은 매우 길고 반복적입니다.
        이 주석은 매우 길고 반복적입니다.
        이 주석은 매우 길고 반복적입니다.
        이 주석은 매우 길고 반복적입니다.
        이 주석은 매우 길고 반복적입니다.
        이 주석은 매우 길고 반복적입니다.
        이 주석은 매우 길고 반복적입니다.
        이 주석은 매우 길고 반복적입니다.
        (필요에 따라 더 많은 주석을 추가할 수 있습니다)
    */
}
