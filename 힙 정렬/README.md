###Heap Sort 힙정렬

![types-of-heap](https://user-images.githubusercontent.com/100178951/156138331-c6c6654b-5cdd-4c73-bede-e663a075b5a5.png)


=============
힙정렬
-완전 이진트리의 일정으로 우선순위 큐를 위하여 만들어진 자료구조의 일종입니다.
-이를 통해 최대값과 최소값을 쉽게 추출할수 있습니다
이에 대한 장점은 최대 힙(max heap) 최소 힙(min heap)통하여 구할수있으며
최대 힙은 내림차순 정렬을 구성 최대 힙은 오름차순 구성을 정렬하게됩니다

최대 힙 구성
최대 트리(Max Tree)값이 자식노드가 있다는 가정하에 그 자식의 키값보다 작지않은(크거나같은경우)의 트리
최대 트리이면서 동시에 완전이진트리(complete Binary Tree) 구성이다

최소 힙 구성
최소 트리(Min Tree)는 각 노드의 키값이 (자식 노드가 있다면) 그 자식의 키(Key)값보다 크지 않은(작거나 같은) 트리이다.
최소 트리(Min Tree)이면서 완전 이진 트리(Complete Binary Tree)이다.

완전 이진 트리 (Complete Binary Tree)
완전 이진 트리는 노드를 삽입할 때 왼쪽 중간 오를쪽 순서대로 삽입하는 트리입니다.

힙 정렬(heap sort)의 시간복잡도
힙 정렬의 시간복잡도는 좋은 편이며 가장 유용한 경우는 아주 큰 값의 몇가지가 필요한 상황이다
공식은 T(n) = O(nlog₂n)을 따른다


##참고자료
https://jomuljomul.tistory.com/entry/%EC%99%84%EC%A0%84%EC%9D%B4%EC%A7%84%ED%8A%B8%EB%A6%ACComplete-Binary-Tree%EB%9E%80
https://juhee-maeng.tistory.com/94
https://hongjw1938.tistory.com/22
https://gmlwjd9405.github.io/2018/05/10/algorithm-heap-sort.html
