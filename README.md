# back
# Server

# API 명세

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
<

