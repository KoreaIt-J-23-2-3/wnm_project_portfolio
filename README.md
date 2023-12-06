<img src="https://capsule-render.vercel.app/api?type=waving&color=BDBDC8&height=120&text=WoofnMewo&section=header" />

## **📗 목차**

🏆 [프로젝트 소개](#-프로젝트-소개)

👨🏻‍💻 [팀원 소개](#-팀원-소개)

🛠 [개발 도구](#-개발-도구)

⏰ [프로젝트 일정](#-프로젝트-일정)

🔗 [API명세서와 ERD설계도](#-API명세서와-ERD설계도)
  
📝 [메뉴구조도](#-메뉴구조도)
  
💻 [화면 구현 및 주요 기능 코드 리뷰](#-화면-구현-및-주요-기능-코드-리뷰)
  - [Oauth2 회원가입 및 로그인 페이지](#Oauth2-회원가입-및-로그인-페이지)
  - [상품 페이지](#상품-페이지)
  - [장바구니 페이지](#장바구니-페이지)
  - [구매 페이지](#구매-페이지)
  - [리뷰 페이지](#리뷰-페이지)
  - [관리자용 회원 주문 내역 관리 페이지](#관리자용-회원-주문-내역-관리-페이지)
  - [관리자용 상품 관리 페이지](#관리자용-회원-상품-관리)
  - [공지사항 페이지](#공지사항-페이지)
  
✍ [느낀점](#-느낀점)

<br/>

## **🏆 프로젝트 소개**

- 프로젝트 제목
  - 온라인 반려견 & 반려묘 쇼핑몰 "Woof&Meow" 웹 개발

- 프로젝트 목적
  - 학습한 내용 복습 및 활용, 팀원들과의 협업에 대한 이해

- 분류
  - 팀 프로젝트

- 제작 기간
  - 2023.11.01 ~ 2023.11.28

- 주요기능
  - 회원가입 및 Oauth2 로그인 기능
  - 카테고리 별 상품 검색 기능
  - 간편 결제(Kakao / Toss) 기능
  - 장바구니 기능
  - 리뷰 기능
  - 관리자용 회원 주문 내역 관리 및 배송 상태 변경 기능
  - 관리자용 상품 관리 및 입/출고 기능
  - 공지사항 기능 
  
<p align="right"><a href="#top">TOP 🔼</a></p>
<br/>

## **👨🏻‍💻 팀원 소개**

<br/>

> **팀장: 정대풍** 
### Back-End
- 회원정보 RUD 기능 구현 
- 장바구니 CRD 기능 구현
- 결제 기능 구현
- 회원용 구매 확정 기능 구현 
  
### Front-End
- 회원용 주문 내역조회 페이지 구현
- 장바구니 페이지 구현
- 결제 페이지 구현
  
### etc.
- PPT 제작 및 발표

<br/>

> **팀원: 장호진** 
### Back-End
- Security JWT 및 accessToken 구현
- 공지사항 CRUD 기능 구현
- 카테고리 기능 구현

### Front-End
- 상품 페이지 구현
- 공지사항 페이지 구현
- 페이지네이션 기능 구현
  
### etc.
- 회의록 작성

<br/>

> **팀원: 이동헌** 
### BackEnd
- 상품 R 기능 구현 
- 관리자용 상품 CRUD 기능 구현
- 관리자용 회원 주문 내역조회 기능 구현
- 관지자용 배송 상태 변경 기능 구현
- 입/출고 CUR 기능 구현
- 회원용 주문 내역조회 기능 구현
  
### FrontEnd
- 관리자용 회원 주문 내역 관리 페이지 구현
- 관리자용 상품 관리 페이지 구현

### etc.
- API 명세서 관리
- ERD 명세서 관리

<br/>

> **팀원: 임예림** 
### Back-End
- 리뷰 CRUD 기능 구현
  
### Front-End
- 회원가입 페이지 구현
- 간편로그인 페이지 구현
- 회원 수정 페이지 구현
- 리뷰 페이지 구현
  
### etc.
- 회의록 작성

  <br/>

> **공동작업**
### etc.
- API 명세서 작성
- DB 설계

<p align="right"><a href="#top">TOP 🔼</a></p>
<br/>

## **🛠 개발 도구**

<br/>

### Back-End

<img src="https://img.shields.io/badge/JAVA-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"> <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/Amazon_AWS-232F3E?style=for-the-badge&logo=amazon-aws&logoColor=white">

### Front-End

<img src="https://img.shields.io/badge/Visual Studio Code-007ACC?style=for-the-badge&logo=Visual Studio Code&logoColor=white"/> <img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"> 
<img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white"> 
<img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"> 
<img src="https://img.shields.io/badge/react-61DAFB?style=for-the-badge&logo=react&logoColor=black"> 


### SCM(형상관리)
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">

### etc.
<img src="https://img.shields.io/badge/python-3776AB?style=for-the-badge&logo=python&logoColor=white"> <img src="https://img.shields.io/badge/firebase-FFCA28?style=for-the-badge&logo=firebase&logoColor=white"> <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=Docker&logoColor=white">

<p align="right"><a href="#top">TOP 🔼</a></p>
<br/>

## **⏰ 프로젝트 일정**

![개발일정](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/121537196/7d2a748f-634b-4723-bfe1-ffabaee3e0f4)

<p align="right"><a href="#top">TOP 🔼</a></p>
<br/>

## **🔗 API명세서와 ERD설계도**

### API 명세서
https://marbled-teeth-f44.notion.site/c214f75ad9754971b2a3bfb30026b037?v=80d087df81eb43e899eaf11fa02d050c&pvs=4

<br/>

### ERD 설계도

![WoofNMeow_ERD ](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/de2d7ae5-ac10-47ac-8cc1-eff351a216ad)

<p align="right"><a href="#top">TOP 🔼</a></p>
<br/>

## **📝 메뉴구조도**

### User 메뉴구조도
<img width="1366" alt="User메뉴구조도" src="https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/6cf83521-1c1d-48d3-be0c-063fa75357ae">

<br/>

### Admin 메뉴구조도
<img width="1366" alt="Admin메뉴구조도" src="https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/63cf70f2-53b8-4c01-8ba1-6f0d934d3e0f">

<p align="right"><a href="#top">TOP 🔼</a></p>
<br/>

## **💻 화면 구현 및 주요 기능 코드 리뷰**

<br/>

### **Oauth2 회원가입 및 로그인 페이지**
  <details>
  <summary>회원가입 영상</summary>
  <div markdown="1">

![회원가입](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/9158d176-e9aa-4606-9e72-256f8ec6440c)

  
  </div>
  </details>
<br/>

  <details>
  <summary>간편 로그인 영상(구글, 카카오, 네이버)</summary>
  <div markdown="1">
  
![구글 로그인](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/53f6adf8-12b3-45e5-8c12-f88d1ff47bcf)
![카카오 로그인](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/aa8847ae-8a33-467f-9d29-ffb040e68d19)
![네이버 로그인](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/84eda95c-3f11-4d4f-adf8-e655ae0abcb2)

  
  </div>
  </details>
<br/>



### **상품 페이지**
  <details>
  <summary>상품 관련 페이지 영상</summary>
  <div markdown="1">
  
![상품 관련 페이지](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/68a8fd9c-872b-418c-8ef7-760831a1e472)

  </div>
  </details>
  
<br/>

### **장바구니 페이지**
  <details>
  <summary>장바구니 페이지 영상</summary>
  <div markdown="1">
  
  ![장바구니 페이지](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/3470cdfe-7dd3-4f4b-bc49-ef36879245fe)

  
  </div>
  </details>
<br/>

### **구매 페이지**
  <details>
  <summary>상품 바로 구매 영상</summary>
  <div markdown="1">
  
![상품 바로 구매](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/6a0a50f1-67c9-4a6a-a70b-bb9d9aebe435)

  
  </div>
  </details>
  
  <details>
  <summary>장바구니 구매 영상</summary>
  <div markdown="1">
  
![장바구니 구매](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/66b8bd78-e5b5-4d61-ab47-5679f7410f82)

  
  </div>
  </details>
<br/>


### **리뷰 페이지**
  <details>
  <summary>리뷰 페이지 영상</summary>
  <div markdown="1">
  
![리뷰 페이지](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/fbfe5c35-1140-4276-8e6a-837349d4c588)

  
  </div>
  </details>

<br/>

### **관리자용 회원 주문 내역 관리 페이지**
  <details>
  <summary>관리자용 회원 주문 내역 관련 페이지 영상 </summary>
  <div markdown="1">
    
![관리자용 회원 주문 내역 관리](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/fbd6d0fc-c262-4bef-aafa-6746af695b8b)

  </div>
  </details>
<br/>

### **관리자용 상품 관리 페이지**
  <details>
  <summary>관리자용 상품 관련 페이지 영상</summary>
  <div markdown="1">
    
![관리자용 상품 관리 페이지](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/2bab739f-90bb-4522-842b-fd09f2878b30)

  
  </div>
  </details>
<br/>

### **공지사항 페이지**
  <details>
  <summary>공지사항 페이지 영상</summary>
  <div markdown="1">

  ![공지사항 페이지](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/7d0a4b2e-487f-4b12-b05a-6091bb30d2f4)


  </div>
  </details>

<p align="right"><a href="#top">TOP 🔼</a></p>
<br/>

## **✍ 느낀점**

<br/>

> **팀장: 정대풍** 
- 단기간동안 프로젝트를 진행하면서 어려움에 부딪혔지만, 그 과정에서 해결해 나가는것이 쉽지 않았습니다.
  하지만 그런 어려움을 극복하고 나서의 성취감이 뿌듯했습니다. 본 과정은 주로 백엔드에 관련되었지만, 프론트 엔드도 함께 배울수 있어 소중한 경험이 되었습니다.
- 특히, 팀장인 저의 성격이 내성적이라 소통하는데 어려움이 있었습니다.
  그로 인해 팀원들과의 소통이 얼마나 중요한지 깨닫게 되었고, 서로 돕고 협업(협력)하는 것이 이번 프로젝트를 만드는데 얼마나 중요한 역할인지 알게 되었습니다.
- 처음에는 프로젝트 DB구조 등 진행 방향을 어떻게 잡아야 할지 막막 했었는데 강사님 덕분에 프로젝트의 방향성을 잡았으며, 이를 통해 프로젝트의 각종 명세서, 구조, 진행 방향 의 중요성과 우선순위를 알게되었습니다.
- 프로젝트를 이끌어나가는 팀장으로서 저의 어떤 부분에서 무엇이 부족한지 스스로 깨닫게 되는 소중한 경험이었습니다.
  부족한 부분을 찾아 공부하고, 코드를 좀 더 깊이 이해할수 있는 기회가 되었으며, 이 과정을 통해 성장 할 수 있을거 같아 뿌듯하고 뜻깊은 시간이었습니다.
<br/>

> **팀원: 장호진** 
- 프로젝트를 시작하면서 명세서같은 문서를 작성할 때 어떤 부분까지 작성해야 할 지 막막했는데 최대한 자세하게 적으라고 하셔서 자세하게 적었다고 생각했는데 프로젝트가 진행되면서 늘어나고 수정 되는걸 보고 실제 회사에선 어떻게 진행되는지 궁금해 졌고,
  프로젝트를 시작하기 전에 팀원들 끼리 맞춰야 할 부분들을 정해야 한다고 했을 때 어떤 것들을 정해야 할 지 막막해서 생각나는 것들을 최대한 정했다고 생각하고 프로젝트를 시작하게 되었을 때 초반에는 크게 문제가 될 것들이 보이지 않아서 순조롭게 진행된다고 생각했는데
  중간에 DB의 테이블 구조를 변경하지 않으면 데이터를 가져오는 게 너무 복잡해 질 것 같다는 선생님의 말씀에 갑자기 테이블 구조를 바꿔야 했을 때,
  프로젝트 막바지에 처음에 생각하지 못했던 페이지네이션 기능을 추가해서 다른 컴포넌트에 적용하게 되었을 때 props로 받은 상태에서 문제가 생기는 걸 보고 이런 것들도 추가하기 전에 시간이 좀 들더라도 어떤 식으로 동작하게 만들지 팀원들과 이야기하고 조언을 구했더라면 문제를 더 쉽게 해결하고 일정    에 문제가 생기지 않았을 것 같아서 아쉽고 팀원에게 미안한 마음이 생겼습니다.
- 프로젝트를 하면서 배웠던 것들을 응용하는 것이 얼마나 어려운지, 초기 기획 단계에서 세세한 부분들을 정하는게 얼마나 중요한지, DB구조를 잘 짜는게 얼마나 중요한지, 내가 짠 코드를 다른 사람이 알기 쉽게 클린 코드를 작성하는 것이 얼마나 중요한지,
  다른 사람이 짠 코드를 이해하는게 얼마나 중요한지  조금이라도 깨달을 수 있었던 시간이 된 것 같습니다.
<br/>

> **팀원: 이동헌** 
- 프로젝트를 진행하면서 힘들었던 부분을 몇 가지 뽑아보자면 협업, 비동기 처리, 정규화 된 데이터베이스의 활용이었다.
  Git을 활용하여 처음 진행한 협업이었기에 브랜치를 사용하는것 자체부터 익숙하지 않았고 새로 작성한 코드를 기존 코드와 문제없이 합치는데 다양한 오류를 해결하는데 많은 시간을 소비하였다.
- 하지만 협업에 많은 시간을 소비한다고 해도 반드시 필요한 작업 구조라고 생각한다.
  코드를 잘 작성한다고 하여도 한 사람이 전체 서비스에 대해 볼 수 있는 시각은 한정적이며, 다양한 사람의 시각으로 장점을 합친 결과물을 만들기 위해서는 시간을 소비한다고 하더라도 이러한 작업 구조에 익숙해질 필요가 있어 의미가 있다고 생각된다.
  React의 비동기 처리는 여러 요청이 복합적으로 오고 가는 상황에서 정확하게 사용하지 않는다면 올바르게 랜더링된 화면을 띄울 수 없어 주의해서 사용하여야 한다.
  특히 비동기 처리에 대해서 가장 힘들었던 부분은 어느 부분에서 코드의 구조적 오류가 발생하였는지 육안으로 확인하기 힘들다는 점이다.
  useState()를 사용한 랜더링이 연속적으로 일어날 때, 새로 랜더링해야 할 화면을 띄우지는 못하지만 클라이언트는 이것을 오류로 인지하지 못하기에 해당 기능을 수행하는 useState() 상태 저장 활동 전반적인 부분을 모두 점검할 필요가 있어서 시간이 많이 소비되었다.
  이 문제를 방지하려면 필요한 만큼의 적은 상태 활용과 오류가 발생하여도 랜더링이 어떤 순서로 일어나야 하는지 보기 쉽도록 코드를 주기적으로 정리하는 것이 좋다고 생각된다.
- 데이터베이스의 정규화는 프로젝트를 진행하는 도중 한번 바뀌었는데, 기존에는 하나의 상품 테이블에 사이즈 column에 해당 상품에 대한 재고를 숫자로 넣어놨지만, 프로젝트를 진행하는 중 상품의 사이즈별 재고 관리, 가격 책정이 불가능하다고 판단되어 사이즈와 가격을 분리하여 정규화하였다.
  구조를 바꿈으로 인해 기존 코드를 수정하는 시간이 굉장히 오래 걸렸으며, 이것을 방지하기 위해서는 처음부터 확장성을 고려하여 데이터베이스를 설계하는 것이 중요하다고 생각된다.
- 회사에서 진행되는 현업에 비해 가벼운 프로젝트라고 할지라도, 첫 작업이라 그런지 꽤 부담스럽게 느껴지는 작업이었다. 

> **팀원: 임예림** 
- 프로젝트 시작 하기 전에는 그래도 열심히 공부하고 노력했고, 어느정도 전체적으로 이해했다 생각했었으나 프로젝트를 하면서 새롭게 알게 된 부분도 많았고 알고있었다고 생각한 부분들도 다시 깨닫게 된 부분이 있었습니다.
  그 바탕에는 팀원분들의 도움이 있었기 덕분이라 생각합니다. 프로젝트로 끝이 아니라 앞으로 코드에 대해 공부할 것은 무궁무진하다 생각하며 수료 후에도 배운 부분에 대해 더 꼼꼼히 복습해야되겠다는 다짐과 반성의 시간이 되었습니다.
  프로젝트가 끝난 이 시점에 다시 시작점을 되돌아보니 아쉬움이 많이 남지만 생각한 것 보다 한 프로젝트를 만든다는 건 더 복잡했고, 혼자였다면 헤쳐나가지 못할 시간들을 팀원분들과 함께여서 무사히 완성했습니다. 감사합니다.

<p align="right"><a href="#top">TOP 🔼</a></p>
<br/>
