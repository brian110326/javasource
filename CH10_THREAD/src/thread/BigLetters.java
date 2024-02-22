package thread;

// Thread
// 프로세스 : 실행 중인 프로그램(OS로부터 실행에 필요한 자원(메모리)을 할당받아 실행)
// 프로세스 ==> 프로그램을 수행하는데 필요한 데이터 + 자원 + Thread(실제로 작업을 수행)
// 모든 프로세스는 최소한 하나 이상의 Thread가 존재 ==> 2개 이상의 Thread를 가진 프로세스를 MultiThread 프로세스

// MultiThread 구현
// 1) Runnable 구현하는 클래스 작성
// run() 메소드 오버라이딩

// 2) Thread를 상속받는 클래스 작성

// Multi Thread 단점
// 여러 개의 Thread가 번갈아가면서 작업을 처리하기 때문에 Thread간 작업 전환 시간이 소요되고
// 한 쓰레드가 수행하는 동안 다른 Thread는 대기하는 대기시간이 필요함

// Thread 실행 제어
// 1) sleep(밀리세컨드) : 지정한 시간만큼 Thread 일시정지(자동적으로 실행 대기 상태)
// 2) suspend : 일시정지, resume() 호출해야 실행 대기 상태가 됨
// 3) stop(), interrupt()

// 동기화 : 한 Thread가 진행중인 작업을 다른 Thread가 간섭하지 못하도록 막는 것
// synchronized : 메소드 동기화, 동기화 블록으로 만들기

public class BigLetters {

  public static void main(String[] args) {
    Thread t = new Thread(new SmallLetters());
    t.start();

    for (char ch = 'A'; ch <= 'Z'; ch++) {
      System.out.print(ch + " ");
    }
  }
}
