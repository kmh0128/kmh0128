손코딩
======

>재귀를 이용한 피보나치 수열
>    >시간복잡도 : O(2^n)
            
            int fibo(int n){
            if(n<2) return n;
            return fibo(n-1) + fibo(n-2);
            }
피보나치 수열
======
![finonacci](https://user-images.githubusercontent.com/100178951/175017729-0584714f-5be1-4abe-98ae-5207df098002.png)

앞에 두개에 있는 항목의 합이 그 다음 항목이 되는것을 의미


메모이제이션을 이용한 피보나치
========

>메모이제이션을 이용한 피보나치
>    >시간복잡도 : O(2^n)
>    >

    int fibo(int n) {
        if(n == 0)
           return 0;
        else if(n == 1)
           return 1;
        else if(fibo[n] != 0)
           return fibo[n];
        else
           return fibo[n] = fibo(n - 1) + fibo(n - 2);
        }




10회 1~10까지 랜덤한 숫자를 출력하여 중복된 숫자가 있을 경우 true, false를 반환
=======
>      10회 1~10까지 랜덤한 숫자를 출력하여 중복된 숫자가 있을 경우 true, false를 반환

        int randomQuiz() {
           for(int i = 0; i<10; i++)
           {
               int n = rand() % 10 + 1;
               cout << n << endl;
               if(!Quiz[n]) {
                     cout << "false" << endl;
                     Quiz[n] = true;
               }
               else
                    cout << "true" << endl;
           }
        }




재귀를 이용한 팩토리얼 문제
==========
>         재귀를 이용한 팩토리얼 문제

           int factorial(int n) {
              if(n == 1)
                 return 1;
              else
                 return n * factorial(n - 1);
           }



1000보다 작은 숫자 중 3과 5의 배수의 총합을 구하는 프로그램
===============
>       1000보다 작은 숫자 중 3과 5의 배수의 총합을 구하는 프로그램

int sum() {
   int res = 0;
   for(int i = 1; i<1000; i++)
   {
      if(i % 3 == 0 || i % 5 == 0)
         res += i;
   }
   return res;
}

//참고자료 https://n-square.tistory.com/82

//참고자료 https://github.com/4z7l/tech_interview.zip/blob/main/%EC%A7%81%EB%AC%B4/Coding.md
