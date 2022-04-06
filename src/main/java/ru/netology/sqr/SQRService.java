package ru.netology.sqr;

public class SQRService {

    public int calculate(int num) {
        int limit1 = 200;
        int limit2 = 300;
        for (int i = 10; i <= 90; i++) {
            if (i * i >= limit1 && limit2 >= i * i) {
                return i;
            }
        }
        return 0;
    }

  //  public int count(int sum) {
  //      for (int j = 0; j <= 3; j++) {
  //          return j;
  //      }
  //  }
  //  return sum;
}
