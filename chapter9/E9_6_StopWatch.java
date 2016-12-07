public class E9_6_StopWatch {

  public static void main(String[] args) {

    StopWatch myWatch = new StopWatch();
    for(int i = 0; i < 10000000; i++) {
      ;
    }

    System.out.println();

    myWatch.stop();
    System.out.println(myWatch.getElapsedTime());
  }
}

class StopWatch {

  private static long startTime, endTime;

  StopWatch() {
    startTime = System.currentTimeMillis();
  }

  public static void start() {
    startTime = System.currentTimeMillis();
  }

  public static void stop() {
    endTime = System.currentTimeMillis();
  }

  public static long getElapsedTime() {
    return endTime - startTime;
  }
}
