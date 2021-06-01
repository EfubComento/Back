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
### 조회
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
Key
|Name|Type|Description|
|------|---|---|
|status|INTEGER|성공 200, 실패 400|

<pre>
<code>
SUCCESS { "code" : 200, "message" : "Success" }
FAIL { "code" : 400, "message" : error.message }
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
Key
|Name|Type|Description|
|------|---|---|
|status|INTEGER|성공 200, 실패 400|

<pre>
<code>
SUCCESS { "code" : 200, "message" : "Success" }
FAIL { "code" : 400, "message" : error.message }
</code>
</pre>

