### 알고리즘이란 ? (알고리즘, algorithm)
* 어떤 문제를 풀기 위한 절차/방법
* 어떤 문제에 대해 특정한 '입력'을 넣으면, 원하는 '출력'을 얻을 수 있도록 만든 프로그래밍

### 자료구조와 알고리즘이 중요한 이유
* 어떤 자료구조와 알고리즘을 쓰냐에 따라, 성능의 차이가 크다
- - -
## Sorting
어떤 데이터가 주어졌을 때 순서대로 나열하는 것

### Bubble Sort
두 인접한 데이터를 비교 후, 앞 > 뒤 조건에 만족할 때 위치를 바꾸는 알고리즘 <- 처음부터 끝까지 이를 반복<br>
눈으로 보는 원리 : https://visualgo.net/en/sorting 

**분석**<br>
반복문이 2개 이므로 보통 : O(n^2)<br>
구체적으로 계산하면 : n * (n-1) / 2<br>
완전 정렬이 되어있을 경우 : O(n)
- - -
### Selection Sort
다음을 반복하여 수행
1. 데이터 중 최소값을 찾은 후 가장 앞에 위치한 값과 교체
2. 다시 최소값을 찾은 후 앞의 (1)과정에서 찾은 값을 제외 후 앞에 위치한 값과 교체<br>
눈으로 보는 원리 : https://visualgo.net/en/sorting

**분석**<br>
반복문이 2개 이므로 보통 : O(n^2)<br>
구체적으로 계산하면 : n * (n-1) / 2<br>
완전 정렬이 되어있을 경우 : O(n)
- - -
### Insertion Sort
두번째 인덱스 부터 시작하며 먼저 값을 복사 후 앞에 위치한 값들과 비교 후 낮으면 해당 위치로 이동<br>
눈으로 보는 원리 : https://visualgo.net/en/sorting

**분석**
반복문이 2개 이므로 보통 : O(n^2)<br>
구체적으로 계산하면 : n * (n-1) / 2<br>
완전 정렬이 되어있을 경우 : O(n)
- - -
### Recursive Call (재귀 함수, 재귀 용법)
함수 안에서 동일한 함수를 호출하는 형태

**예제1. Factorial - 시간 복잡도와 공간 복잡도**
* Factorial(n)은 (n - 1)번의 factorial() 함수를 호출하여 곱셈을 한다.
  * 일종의 (n-1)번의 반복문을 호출 하는 것과 동일하다.
  * factorial() 함수를 호출할 때마다, n 개의 지역변수가 생성된다.
* 시간, 공간 복잡도는 O(n-1)이므로, 여기서 상수를 제외하면 O(n) 이 된다.

**예제2. 1부터 n 까지의 곱을 출력되게 만들기**

**예제3. 숫자가 들어 있는 리스트가 주어졌을 때, 리스트의 합을 리턴하는 함수 만들기**

**예제4. palindrome(회문)을 판별하는 함수 만들기**<br>
palindrome이란, 앞으로 읽으나 거꾸로 읽으나 동일한 단어 또는 구

**예제5. 정수 n에 대하여, n이 홀수이면 3 X n + 1 을 하고 n이 짝수이면 n / 2를 한다. 이렇게 계속 진행하여 n 이 결국 1 이 될 때까지 반복한다.예제5. 정수 n에 대하여, n이 홀수이면 3 X n + 1 을 하고 n이 짝수이면 n / 2를 한다. 이렇게 계속 진행하여 n 이 결국 1 이 될 때까지 반복한다.**

**예제6. 정수 4를 1, 2, 3의 조합으로 나타내는 방법은 다음과 같이 총 7가지가 있다.
1+1+1+1<br>
1+1+2<br>
1+2+1<br>
2+1+1<br>
2+2<br>
1+3<br>
3+1<br>
정수 n 이 입력으로 주어졌을 때, n을 1, 2, 3의 합으로 나타낼 수 있는 방법의 수를 구하시오.**
- - -
### Dynamic Programming(동적 계획법), Divide and Conquer(분할 정복)

- Dynamic Programming - DP
    - 입력 크기가 작은 부분 문제들을 해결 후, 해당 부분 문제의 해를 활용하여 보다 큰 크기의 부분 문제를 해결, 최종적으로 전체 문제를 해결하는 알고리즘
    **즉, 상향식 접근법으로, 가장 최하위 해답을 구한 후 이를 저장하고 해당 결과값을 이용해서 상위 문제를 풀어가는 방식**
    - Memorization 기법을 사용
        - 프로그램 실행 시 이전에 계산한 값을 저장하여 다시 계산하지 않도록 하여 전체 실행 속도를 빠르게 하는 기술
    - 문제를 잘게 나눌 때, 부분 문제는 중복되어 재활용 가능
        - EX. 피보나치 수열
- Divide and Conquer
    - 문제를 나눌 수 없을 때까지 나누어서 각각을 풀면서 다시 합병하여 문제의 답을 얻는 알고리즘
    - 하향식 접근법으로, 상위의 해답을 구하기 위해, 아래로 내려가면서 하위의 해답을 구하는 방식
        - 일반적으로 재귀함수로 구현
    - 문제를 잘게 나눌 때, 부분 문제는 서로 중복되지 않는다.
        - Ex. Merge Sort, Quick Sort

**공통점과 차이점**

- 공통점
    - 문제를 잘게 나누어, 가장 작은 단위로 분할
- 차이점
    - Dynamic Programming
        - 부분 문제는 중복(상위 문제 해결하면서 재활용)
        - Memorization 기법 사용 (재활용하여 최적화)
    - Divide and Conquer
        - 부분 문제는 중복 되지 않음
        - Memorization 기법 사용 안함
- - -
### Quick Sort
- 정렬 알고리즘의 꽃
- pivot(기준점)을 정해서, pivot보다 작은 데이터는 왼쪽, 큰 데이터는 오른쪽으로 모우는 함수를 작성한다. 그리고 이를 재귀로 반복한다.
- pivot은 맨 처음 데이터로 선정
- Divide and Conquer 알고리즘 중 하나

**분석**
- 시간 복잡도 : O(n log n)
- 최악의 경우
    - 맨 처음 pivot이 가장 작거나, 클 경우에 발생
    - 모든 데이터를 비교하게 되므로, 시간 복잡도 : O(n^2)
- - -
### Merge Sort
- 다음과 같은 방법을 재귀적으로 반복하여 정렬하는 알고리즘
    1. 리스트를 절반으로 나누어 비슷한 크기의 두부분의 리스트로 나눈다.
    2. 각 부분 리스트를 재귀적으로 합병 정렬을 이용해서 정렬한다.
    3. 두 부분 리스트를 다시 하나의 정렬된 리스트로 합병한다.

### 분석
- 몇 단계 깊이까지 만들어지를 depth라고 하고 i 라한다. 그리고 맨위는 0이다.
    - 다음 그림에서 n/2^2 는 2단계 깊이라 해본다.
    - 각 단계에 있는 하나의 노드 안의 리스트의 길이는 n/2^2 가 된다.
    - 각 단계는 2^i 개의 노드가 있다.
- 따라서, 각 단계는 항상 2^i * n / 2^i = O(n)
- 단계는 항상 log_2 n 개 만들어 진다. 시간 복잡도는 O(log n) 이 된다. (2는 상수이므로 삭제)
- 따라서, 단계별 시간 복잡도는 O(n) * O(log n) 이므로 O(n log n) 이 된다.
<img src="/img/merge_img_1.png" width="500px;">
- - -
### Binary Search

**Divide and Conquer AND Binary Search**

- Divide and Conquer
    - Divide : 문제를 하나 또는 둘 이상으로 나눈다.
    - Conquer : 나눠진 문제가 충분히 작고, 해결 가능하다면 해결하고, 그렇지 않다면 다시 나눈다.
- Binary Search
    - Divide : 리스트를 두 개의 서브 리스트로 나눈다.
    - Conquer
        - ( search value > 중간 값 ) 일 때, 리스트의 '뒷 부분' 부터 다시 찾는다.
        - ( search value > 중간 값 ) 일 때, 리스트의 '앞 부분' 부터 다시 찾는다.
    - 정렬이 되어 있다는 가정이 필요

**분석**

- n개의 리스트를 매번 2로 나누어 1이 될 때까지 비교 연산을 k회 진행
    - n * 1/2 * 1/2 * ... = 1
    - n * (1/2)^k = 1
    - n = 2^k = log_2 n = log_2 2^k
    - log_2 n = k
    - Big-O : O(log n + 1)이므로 상수를 제거하면
    Big-O : O(log n)
- - -
### Sequential Search
- 데이터가 담겨있는 리스트를 앞에서 부터 순차적으로 비교하여 원하는 데이터를 찾는 방법

**분석**

- O(n)
- - -
### Graph
- 실제 세계의 현상이나 사물을 정점(Vertex) 또는 노드(Node)와 간선(Edge)로 표현하기 위해 사용

**용어**

- 주 용어
    - Node : 위치를 말함. Vertex(정점)이라고도 함.
    - Edge : 위치 간의 관계를 표시한 선으로 노드를 연결한 선이라고 보면 된다.(link, branch 라고도 한다)
    - Adjacent Vertex : Edge로 직접 연결된 Node
- 참고 용어
    - Degree : 무방향 그래프에서 하나의 Node에 인접한 Node의 수
    - In-Degree : 방향 그래프의 외부에서 오는 Edge의 수
    - Out-Degree : 방향 그래프에서 외부로 향하는 Edge의 수
    - Path Length : 경로를 구성하기 위해 사용된 Edge의 수
    - Simple Path : 처음 Node와 끝 Node를 제외하고 중복된 Node가 없는 경로
    - Cycle : simple path의 start node와 end node가 동일한 경우

**graph 종류**

- Undirected Graph
    - 방향이 없는 그래프
    - Edge를 통해 Node는 양방향으로 갈 수 있다.
    - Node가 A → B로 연결되어 있을 경우, (A, B) 또는 (B, A)로 표기한다.
- Directed Graph
    - Edge에 방향이 있는 그래프
    - Node가 A→B 방향으로 Edge가 연결되어 있을 경우, <A, B>로 표기한다.( <B , A> 와는 다르다.)
- Weighted Graph OR Network
    - Edge에 비용 또는 가중치가 할당된 그래프
- Connected Graph AND Disconnected Graph
    - Connected Graph
        - 무방향 그래프에 있는 모든 Node에 대해 항상 경로가 존재하는 경우
    - DisConnected Graph
        - 무방향 그래프에서 특정 Node에 대해 경로가 존재하지 않는 경우
- Cycle Graph AND Acyclic Graph
    - Cycle Graph
        - 단순 경로의 start node와 end node가 동일한 경우
    - acyclic Graph
        - Cycle이 없는 경우
- Complete Graph
    - 모든 Node가 서로 연결되어 있는 그래프
    
**그래프와 트리의 차이**<br>
<img src="/img/graph_img_1.png" width="500px;">
- - -
### Breadth-First Search

- 정점들과 **같은 레벨**에 있는 노드들을 먼저 탐색하는 방식### Breadth-First Search<br>
<img src="/img/breadth-first-1.png" width="400px;">

**분석**
- node count : V
- edge count : E
    - V + E 만큼 반복이 수행된다. 그러므로 O(V+E) 가 된다.
- - -
### Greedy Algorithm

- 최적이 해에 가까운 길을 구하기 위해 사용된다.
- **여러 경우 중 한가지 선택해야 될 때, 매순간 최적이라고 생각되는 경우를 선택하는 방식으로 진행해서, 최종적인 값을 구하는 방식**

**Ex1. 동전 문제**

- 지불해야 되는 값이 4720원 일 때, 각각의 동전 10, 50, 100, 500이 있을때 동전의 수가 가장 적게 지불하기

**Ex2. Fractional Knapsack Problem**

- 무게 제한이 K인 배낭에 최대 가치를 가지도록 물건을 넣는 문제
- 물건은 쪼갤 수 있으므로 물건의 일부분이 배낭에 넣어질 수 있다.

**한계**

- 근사치 추정에 활용
    - 반드시 최적의 해를 구할 수 있는 것은 아니다.
    - 최적의 해에 **가까운 값**을 구할 수 있는 방법 중 한가지 이다.

