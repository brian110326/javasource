package lang;

public class StringEx4 {

  public static void main(String[] args) {
    String[] names = { "Lee", "Hong", "Park", "Kim" };
    System.out.println(findKim(names)); //"Kim"의 위치를 찾아내서 위치를 나오게하기 ==> Kim은 0번 위치에 있다
  }

  public static String findKim(String[] arr) {
    // for (String s : arr) {
    //   if (s.contains("Kim")) {
    //     return "Kim 은 " + s.indexOf("Kim") + "번 위치에 있다";
    //   }
    // }
    // return "";

    int idx = 0;
    for (int i = 0; i < arr.length; i++) {
      if ("Kim".equals(arr[i])) {
        idx = i;
        break;
      }
    }
    return "Kim은 " + idx + " 번 위치에 있다.";
  }
}
