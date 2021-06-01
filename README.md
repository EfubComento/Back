# back
# Server

# API 명세
### 전체 포스트 불러옴
### REQUEST
URL
<pre>
<code>
GET /api/post
</code>
</pre>

### RESPONSE
<pre>
<code>
[
   {
      "id":1,
      "company":"삼성전기",
      "department": "영업관리",
      "question_content": "~~~",
      "question_id":1,
      "answer":[
          {
              "answer_id":1,
     "answer_content:"한두달도 안된 동일 전형이라면 필터링 될 확률이 높습니다.
 인사담당자가 동일하기 때문에 분명히 기억할 겁니다."
          }
      ]
   },
   {
      "id":2,
      "company":"모든 회사",
      "department": "모든 직무",
      "question_content": "~~~",
      "question_id":2
      "answer":[
          {
              "answer_id":3,
     "answer_content:"~~~",
          },
          {
              "answer_id":4,
     "answer_content:"~~~",
          }
      ]
   }
]
</code>
</pre>

### 개별 포스트 불러옴
### REQUEST
URL
<pre>
<code>
GET /api/post/{id}
</code>
</pre>

### RESPONSE
<pre>
<code>
 {
      "id":1,
      "company":"삼성전기",
      "content": "한두달도 안된 동일 전형이라면 필터링 될 확률이 높습니다.
 인사담당자가 동일하기 때문에 분명히 기억할 겁니다.",
      "question_content": "~~~",
      "question_id":1,
      "answer":[
          {
              "answer_id":1,
     "answer_content:"~~~",
          },
          {
              "answer_id":2,
     "answer_content:"~~~",
          }
      ]
   }
</pre>
</code>

## 질문
### 전체조회
### REQUEST
URL
<pre>
<code>
GET /api/question
</pre>
</code>

### RESPONSE
<pre>
<code>
[
   {
      "id":1,
      "company":"삼성전기",
      "position":"모든직무",
      "title":"현대모비스 1차 면접탈락 후 동일직무 지원해도 될까요?",
      "content":"현대모비스에서 1차면접을 탈락한 후 한두달도 되지 않아 동일 직무들이 다시 수시채용이 올라왔습니다. 공고가 다시 뜬 기간이 너무 짧아서 동일 직무를 지원해도 확률이 있을지에 대해서 고민이 됩니다. 제 흥미와 역량이 이전 지원 직무에 적합하지만 끼워맞춘다면 다른 직무에 지원할수도 있긴 합니다.. 하지만 썩 내키지 않아서 계속 고민이 되는데 조언해주시면 감사하겠습니다!"
   },
   {
      "id":2,
      "company":"모든회사",
      "position":"모든직무",
      "title":"입사시 제약사 RA업무 배정이 궁금합니다.",
      "content":"안녕하세요, 이번에 RA직무로 최종합격했습니다.-신제품 기획개발-허가 및 발매, 허가 변경 등 사후 관리 업무-RA consulting-약사법, 의약품 안전규칙, 규정 f/u 이렇게 되어있는데 입사하게 되면 저 업무를 다 하게 되는건가요 아니면 저 중에 입사동기들이 각각 몇개씩 배정받아 담당으로 하게되나요? 저는 허가발매쪽을 하고 싶은데 혹시 기획개발 쪽만 하게 될까봐 걱정되네요"
   },
   {
      "id":3,
      "company":"모든회사",
      "position":"모든직무",
      "title":"금융권 IT 임원 면접 준비",
      "content":"안녕하세요 금융권을 딱 하나 썼는데 임원 면접을 준비 중입니다. 평소 금융권에 관심도 없었고 해당 회사를 사용해본 적도 없습니다. 금융권은 특히 로열티를 많이 본다는데 어떻게 관심을 표현해야 할까요....? 지금이랑 해당 회사 입출금 통장이라도 하나 만들까요? 금융권에 관심이 전혀 없었지만 면접에서는 관심 있어 왔던 척 해야하는게 맞는거죠?"
   }
]
</code>
</pre>

### 개별조회
### REQUEST
URL
<pre>
<code>
GET /api/question/{id}
</code>
</pre>

### RESPONSE
<pre>
<code>
{
   "id":1,
   "company":"삼성전기",
   "position":"모든직무",
   "title":"현대모비스 1차 면접탈락 후 동일직무 지원해도 될까요?",
   "content":"현대모비스에서 1차면접을 탈락한 후 한두달도 되지 않아 동일 직무들이 다시 수시채용이 올라왔습니다. 공고가 다시 뜬 기간이 너무 짧아서 동일 직무를 지원해도 확률이 있을지에 대해서 고민이 됩니다. 제 흥미와 역량이 이전 지원 직무에 적합하지만 끼워맞춘다면 다른 직무에 지원할수도 있긴 합니다.. 하지만 썩 내키지 않아서 계속 고민이 되는데 조언해주시면 감사하겠습니다!"
}
</code>
</pre>

## 답변
### 전체조회
### REQUEST
URL
<pre>
<code>
GET /api/answer
</code>
</pre>

### RESPONSE
<pre>
<code>
[
   {
      "id":1,
      "company":"삼성전기",
      "content": "한두달도 안된 동일 전형이라면 필터링 될 확률이 높습니다.
 인사담당자가 동일하기 때문에 분명히 기억할 겁니다.",
      "question_content": "~~~",
      "question_id":1,
      "answer":[
          {
              "answer_id":1,
     "answer_content:"~~~",
          },
          {
              "answer_id":2,
     "answer_content:"~~~",
          }
      ]
   },
   {
      "id":2,
      "company":"모든 회사",
      "department": "모든 직무",
      "question_content": "~~~",
      "question_id":2
      "answer":[
          {
              "answer_id":3,
     "answer_content:"~~~",
          },
          {
              "answer_id":4,
     "answer_content:"~~~",
          }
      ]
   }
]
</code>
</pre>


### 개별조회
### REQUEST
URL
<pre>
<code>
GET /api/answer/{id}
</code>
</pre>

### RESPONSE
Key
|Name|Type|Description|
|------|---|---|
|id|INTEGER|캠프번호|
|company|STRING|회사|
|content|STRING|내용|
|question_id|STRING|질문아이디|

<pre>
<code>
{
   "id":1,
   "company":"삼성전기",
   "content":"한두달도 안된 동일 전형이라면 필터링 될 확률이 높습니다. 인사담당자가 동일하기 때문에 분명히 기억할 겁니다.",
   "question_id":"1"
}
</code>
</pre>


## 부트캠프
### 전체조회
### REQUEST
URL
<pre>
<code>
GET /api/bootcamp
</code>
</pre>

### RESPONSE
<pre>
<code>
[
   {
      "id":2,
      "image":"https://cdn.comento.kr/edu/title_j2bCuxH7EB.jpg?s=960x502",
      "category":"연구개발",
      "content":"대기업 배터리시스템 연구개발자를 통해 제대로 배우는 R&D 프로세스 실무"
   },
   {
      "id":3,
      "image":"https://cdn.comento.kr/edu/title_lcPVix0bQS.jpg?s=960x502",
      "category":"기획",
      "content":"문화예술 공공기관 직무 체험 : 예술기획 및 행정 프로세스 이해하기"
   },
   {
      "id":4,
      "image":"https://cdn.comento.kr/edu/title_j2bCuxH7EB.jpg?s=960x502",
      "category":"IT",
      "content":"데이터 관리자 진짜 실무와 30년 커리어 방향 세우기"
   }
]
</code>
</pre>

### 개별조회
### REQUEST
URL
<pre>
<code>
GET /api/bootcamp/{id}
</code>
</pre>

### RESPONSE
Key
|Name|Type|Description|
|------|---|---|
|id|INTEGER|캠프번호|
|image|STRING|이미지URL|
|category|STRING|직무카테고리|
|content|STRING|내용|

<pre>
<code>
{
   "id":1,
   "image":"https://cdn.comento.kr/edu/title_j2bCuxH7EB.jpg?s=960x502",
   "category":"IT/SW",
   "content":"데이터 관리자 진짜 실무와 30년 커리어 방향 세우기"
}
</code>
</pre>

### 생성
### REQUEST
URL
<pre>
<code>
POST /api/bootcamp
</code>
</pre>

Body
|Name|Type|Description|
|------|---|---|
|image|STRING|이미지URL|
|category|STRING|직무카테고리|
|content|STRING|내용|

### RESPONSE
key
|Name|Type|Description|
|------|---|---|
|status|STRING|성공메시지|
<pre>
<code>
{"message" : "Success"}
</code>
</pre>

### 수정
### REQUEST

### 삭제
### REQUEST
URL
<pre>
<code>
DELETE /api/bootcamp/{id}
</code>
</pre>

### RESPONSE
key
|Name|Type|Description|
|------|---|---|
|status|STRING|성공메시지|

<pre>
<code>
{"message" : "Success"}
</code>
</pre>

