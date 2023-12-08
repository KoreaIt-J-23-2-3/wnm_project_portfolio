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

## **🏆 프로젝트 소개** [[Notion]](https://marbled-teeth-f44.notion.site/Woof-Meow-Team-Project-5dff0bf505a144dfbb29f9942d010560)

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

<img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"> <img src="https://img.shields.io/badge/react-61DAFB?style=for-the-badge&logo=react&logoColor=black"> <img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"> <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white">


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
[https://marbled-teeth-f44.notion.site/c214f75ad9754971b2a3bfb30026b037?v=80d087df81eb43e899eaf11fa02d050c&pvs=4](https://marbled-teeth-f44.notion.site/abb193ef34d84b8e9b0c63dc43a830ab?v=edb9cfe1930b4cf5a0b37853dd6df6f6&pvs=4)

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
  
  <details>
  <summary>간편 로그인 영상(구글, 카카오, 네이버)</summary>
  <div markdown="1">
  
![구글 로그인](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/53f6adf8-12b3-45e5-8c12-f88d1ff47bcf)
![카카오 로그인](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/aa8847ae-8a33-467f-9d29-ffb040e68d19)
![네이버 로그인](https://github.com/KoreaIt-J-23-2-3/wnm_project_portfolio/assets/137989661/84eda95c-3f11-4d4f-adf8-e655ae0abcb2)

  
  </div>
  </details>
<br/>

  <details>
  <summary>Oauth2로그인 및 회원가입 코드리뷰</summary>
  <div markdown="1">
  
## Front-End
**Oauth2 로그인**
```javascript
	const handleGoogleLogin = () => {
			window.location.href = "http://localhost:8080/oauth2/authorization/google"
	}

	const handleKakaoLogin = () => {
			window.location.href = "http://localhost:8080/oauth2/authorization/kakao"
	}

	const handleNaverLogin = () => {
			window.location.href = "http://localhost:8080/oauth2/authorization/naver"
	}
```
- 구글, 카카오, 네이버 간편 로그인을 구현
<br>

**Oauth2 로그인 토큰 저장**
```javascript
	const [ searchParams, setSearchParams ] = useSearchParams();
	const queryClient = useQueryClient();
	useEffect(() => {
		if(!searchParams.get("token")) {
				alert("정상적인 접근이 아닙니다.")
				navigate("/")
		} else {
				localStorage.setItem("accessToken", "Bearer " + searchParams.get("token"));
				queryClient.refetchQueries("getPrincipal");
		}
	}, []);

	return <Navigate to={"/"}/>
```
- useEffect로 dependency에 아무것도 주지 않아서 이 컴포넌트에 접근했을때 한번만 코드가 실행되도록 함
- Url에 파라미터로 토큰을 받아 localStorage에 accessToken이란 key로 Bearer 표시를 추가하여 토큰을 저장해주고 홈화면으로 보내줌

<br>

**Oauth2 로그인 후 회원가입**
```javascript
	const user = {
        oauth2Id: searchParams.get("oauth2Id"),
        provider: searchParams.get("provider"),
        name: "",
        nickname: "",
        email: "",
        phoneNumber: "",
        defaultAddressNumber: 0,
        defaultAddressName:"",
        defaultAddressDetailName:""
    }

    useEffect(() => {
        if(!searchParams.get("provider")){
            alert("정상적인 접근이 아닙니다.")
            navigate("/")
        }
    })

    const [ signupUser, setSignupUser ] = useState(user);
    
    const handleInputChange = (e) => {
        setSignupUser({
            ...signupUser,
            [e.target.name]: e.target.value
        });
    }

    const handleSignupSubmit = async () => {
        try {
            await signupApi(signupUser);
            alert("회원가입 완료");
            window.location.replace("/auth/signin");
        }catch(error) {
            alert("회원가입 중 오류가 발생하였습니다.")
        }
    }

    const handleCancelOnClick = () => {
        navigate(-1)
    }
```
- 간편 로그인 후 회원정보를 추가로 받아 DB에 저장하기 위해 구현
- user객체에 정보를 담아 백앤드로 전달
- 주소 정보는 Daum주소 Api를 사용, Oauth2Id와 Provider는 Bearer토큰에 담겨있는 정보를 가져옴, 나머지 정보는 인풋을 통해 저

<br>

## Back-End
**Controller**
```java
	@ValidAop
	@PostMapping("/api/auth/signup")
    public ResponseEntity<?> signup(@Valid @RequestBody SignupReqDto signupReqDto, BindingResult bindingResult) {
        return ResponseEntity.ok().body(userService.signup(signupReqDto));
	}
```
- 회원가입 요청을 받는 컨트롤러
<br>

**Dto**
```java
	@NotBlank
	private String oauth2Id;
	@NotBlank
	private String provider;
	@Email
	private String email;
	@Pattern(regexp = "^[가-힣]{2,6}$", message = "이름 형식을 다시 확인해주세요.")
	private String name;
	@NotBlank
	private String nickname;
	@Pattern(regexp = "^[0-9]{11}$", message = "전화번호를 다시 확인해주세요.")
	private String phoneNumber;
	@NotBlank
	private String defaultAddressNumber;
	@NotBlank
	private String defaultAddressName;
	@NotBlank
	private String defaultAddressDetailName;

	public User toEntity() {
			return User.builder()
							.oauth2Id(oauth2Id)
							.provider(provider)
							.email(email)
							.name(name)
							.nickname(nickname)
							.phoneNumber(phoneNumber)
							.defaultAddressNumber(defaultAddressNumber)
							.defaultAddressName(defaultAddressName)
							.defaultAddressDetailName(defaultAddressDetailName)
							.build();
	}
```
- 회원가입 Controller에서 받을 정보를 담을 Dto생성
- 이름과 전화번호에만 정규식으로 유효성 검사, 이메일은 어노테이션을 사용해서 검사
- repository에서 entity로 변환하기 위한 메소드 작성성
<br>

**Service**
```java
	@Transactional(rollbackFor = Exception.class)
	public Boolean signup(SignupReqDto signupReqDto) {
			try {
					return userMapper.saveUser(signupReqDto.toEntity()) > 0;
			}catch (Exception e) {
					throw new SignupException
									(errorMapper.errorMapper("회원가입 오류", "회원가입 중 오류가 발생하였습니다."));
			}
	}
```
- 회원가입 요청을 처리하는 서비스
- 회원가입에서 발생하는 오류 처리
<br>

**Repository**
```java
	public Integer saveUser(User user);
```
- 회원 가입을 위한 메소드
<br>

**Entity**
```java
	private int userId;
	private String roleName;
	private String oauth2Id;
	private String provider;
	private String name;
	private String nickname;
	private String email;
	private String phoneNumber;
	private String defaultAddressNumber;
	private String defaultAddressName;
	private String defaultAddressDetailName;
	private String profileUrl;
```
- Dto에서 변환하여 Repository에서 사용할 Entity
<br>


**Mapper**
```java
	<insert id="saveUser" parameterType="com.woofnmeow.wnm_project_back.entity.User">
		insert into
				user_tb
		values(0,
					'ROLE_USER',
					#{oauth2Id},
					#{provider},
					#{name},
					#{nickname},
					#{email},
					#{phoneNumber},
					#{defaultAddressNumber},
					#{defaultAddressName},
					#{defaultAddressDetailName},
					default)
	</insert>
```
- 회원가입 insert문
- 유저 권한을 기본적으로 USER로 넣어줌
<br>

**Config**
```java
	.and()
	.oauth2Login()
	.successHandler(oauth2SuccessHandler)
	.userInfoEndpoint()
	.userService(principalUserDetailsService);
```
- 간편로그인을 허용하기위해 필터에 코드 추가
<br>

**PrincipalUser**
```java
	@Getter
	private User user;

	public PrincipalUser(User user, Map<String, Object> attributes, String nameAttributeKey) {
			super(null, attributes, nameAttributeKey);
			this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
			ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority(user.getRoleName()));
			return authorities;
	}

	@Override
	public String getName() {
			if(user.getProvider().equals("google")) {
					return super.getAttributes().get("sub").toString();
			} else {
					return super.getAttributes().get("id").toString();
			}
	}
```
- Jwt토큰을 만들기위한 PrincipalUser객체
- 카카오나 네이버와 달리 google의 경우 attributes에서 사용자 정보가 담긴 부분의 키값이 sub이기 때문에 getName을 사용할 때 조건이 필요
<br>

**successHandler**
```java
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
			OAuth2AuthenticationToken authenticationToken = (OAuth2AuthenticationToken) authentication;
			OAuth2User oAuth2User = authenticationToken.getPrincipal();

			String oauth2Id = oAuth2User.getName();
			String provider = oAuth2User.getAttribute("provider") == null ? "google" : oAuth2User.getAttribute("provider").toString();

			User user = userMapper.findUserByOauth2Id(oauth2Id);
			
			if(user == null) {
					response.sendRedirect("http://localhost:3000/auth/signup" +
									"?oauth2Id=" + oauth2Id +
									"&provider=" + provider);
					return;
			}
			PrincipalUser principalUser = new PrincipalUser(user, oAuth2User.getAttributes(), provider.equals("google") ? "sub" : "id");

			String accessToken = jwtProvider.createToken(principalUser);
			response.sendRedirect("http://localhost:3000/auth/oauth2/signin" +
							"?token=" + URLEncoder.encode(accessToken, "UTF-8"));
    }
```
- Jwt토큰에 간편로그인을 제공한 회사의 이름을 넣어주기 위해 provider를 추가
- 회원가입한 사용자가 없을 경우 회원가입 화면으로 oauth2Id와 provider를 담아서 보내주었음
- principal객체를 생성해서 Jwt토큰을 생성 후 로그인 화면으로 보내주었음 
<br>

**Controller**
```java
	.and()
	.oauth2Login()
	.successHandler(oauth2SuccessHandler)
	.userInfoEndpoint()
	.userService(principalUserDetailsService);
```
- 간편로그인을 허용하기위해 필터에 코드 추가
<br>

  </div>
  </details>



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
  
  <details>
  <summary>장바구니 페이지 코드 리뷰</summary>
  <div markdown="1">

  ## Front-End
  **장바구니 등록**
  ```javascript
       const handleAddToCartOnClick = async () => {
        try {
            const option = {
                headers: {
                    Authorization: localStorage.getItem("accessToken")
                }
            }
            if(!principal.data) {
                alert("로그인 후 사용해주세요.")
                navigate("/auth/signin")
            } else {
                if(selectedProducts.length === 0) {
                    alert("상품을 선택해주세요.")
                } else {
                    if(window.confirm("해당 상품을 장바구니에 담겠습니까?")) {
                        addToCartApi(principal.data.data.userId, [...selectedProducts], option);
                        alert("장바구니에 상품이 정상적으로 담겼습니다.")
                        navigate(`/product/cart/${principal?.data?.data?.userId}`)
                    } else {
                        alert("취소되었습니다.")
                    }
                }
            }
        } catch(error) {
            console.log(error)
        }
    }
  ```
  - 로그인(accessToken) 상태에서 장바구니 등록이 가능하다
  - selectProduct 안에는 상품의 상세ID와 상품 수량의 데이터가 들어가 있다.
  <br/>
  
  **장바구니 조회**
  ```javascript
       const getCartProducts = useQuery(["getCartProducts"], async () => {
        try {
            const option = {
                headers: {
                    Authorization: localStorage.getItem("accessToken")
                }
            }
            const response = getCartApi(principal.data.data.userId, option);
            return await response;
        } catch(error) {
            console.log(error)
        }
    }, {
        refetchOnWindowFocus: false,
        onSuccess: response => {
            setCartProducts(!response?.data ? [] : response.data);
        }
    })
  ```
  - React-Query를 사용하여 장바구니 상품 조회를 할 수 있다.
  - 해당 로그인한 userId만 조회가 가능하다.
  <br/>

  **장바구니 삭제**
 ```javascript
    const handleDeleteProductOnClick = async (index) => {
        
        if(window.confirm("선택하신 상품을 삭제하시겠습니까? ")) {
            try {
                const option = {
                    headers: {
                        Authorization: localStorage.getItem("accessToken")
                    }
                }

                const response = await deleteCartApi(cartProducts[index].cartId, option);
                if (response.data === true) {
                    const deleteProduct = [...cartProducts]
                    deleteProduct.splice(index, 1);
                    setCartProducts(deleteProduct);
                    window.location.reload();
                } else {
                    throw new Error("상품 삭제 실패")
                }
            } catch(error) {
                console.log(error)
            }
        }else {
            return;
        }
    }
 ```
  - 장바구니 페이지에서 해당 로그인한 userId만 삭제가 가능하다.
  <br/>

  
  ## Back-End
  **Controller**
  ```java
    // 장바구니 등록
    @PostMapping("/api/cart/{userId}")
    public ResponseEntity<?> addProductToCart(@PathVariable int userId, @RequestBody List<AddCartReqDto> addCartReqDto) {
        return ResponseEntity.ok(cartService.addProductToCart(userId, addCartReqDto));
    }

    // 장바구니 조회
    @GetMapping("/api/cart/{userId}")
    public ResponseEntity<?> getCartByUserId(@PathVariable int userId) {
        return ResponseEntity.ok(cartService.getCartByUserId(userId));
    }

    // 장바구니 삭제
    @DeleteMapping("/api/cart/{cartId}")
    public ResponseEntity<?> removeProductOfCart(@PathVariable int cartId) {
        return ResponseEntity.ok(cartService.removeProductOfCart(cartId));
    }
  ```
  - 장바구니 등록 같은 경우 List형태로 올수가 있어 List로 데이터를 받는다
  <br/>

  **Dto**
  ```java
  @NoArgsConstructor
  @AllArgsConstructor
  @Builder
  @Data
  public class AddCartReqDto {
      private int productDtlId;
      private int count;
  
      public Cart toCartProductsEntity(int userid) {
          return Cart.builder()
                  .userId(userid)
                  .productDtlId(productDtlId)
                  .count(count)
                  .build();
      }
  }
  ```
  - Dto는 상품의 상세ID와 상품 수량의 데이터만 받고 Builder를 통해 Entity로 변환한다.
  - userId는 로그인한 회원의 userId를 넣는다.
  ```java
  @Data
  @Builder
  public class GetUserCartProductsRespDto {
      private int cartId;
      private int productDtlId;
      private int count;
  
      private ProductDtl productDtl;
  }
  ```
  - 장바구니 조회는 장바구니ID와 상품상세ID, 상품수량 그리고 상품상세에 대한 Entity의 데이터를 Front로 보내준다.
  <br/>

  **Entity**
  ```java
  @NoArgsConstructor
  @AllArgsConstructor
  @Builder
  @Data
  public class Cart {
      private int cartId;
      private int userId;
      private int productDtlId;
      private int count;
  
      private ProductDtl productDtl;
  
      public GetUserCartProductsRespDto toGetUserCartProductsRespDto() {
          return GetUserCartProductsRespDto.builder()
                  .cartId(cartId)
                  .productDtlId(productDtlId)
                  .count(count)
                  .productDtl(productDtl)
                  .build();
      }
  }
  ```
  - Entity에서 ResponseDto로 변환하는 로직이다.
  <br/>

  **Repository**
  ```java

  @Mapper
  public interface CartMapper {
    // 장바구니 등록
    public int insertCart(Cart cart);

    // 장바구니 조회
    public List<Cart> selectCartByUserId(int userId);

    // 장바구니 삭제
    public int deleteProductOfCart(int cartId)
  }
  ```
  - Mapper를 통해서 DB(MyBatis)와 매핑해주는 역할
  <br/>
  
  
  **mapper(MyBatis)**
  ```xml
   <resultMap id="cartMap" type="com.woofnmeow.wnm_project_back.entity.Cart">
        <id property="cartId" column="cart_id"/>
        <result property="userId" column="user_id"/>
        <result property="productDtlId" column="product_dtl_id"/>
        <result property="count" column="count"/>
        <association property="productDtl" resultMap="productDtlMap"/>
    </resultMap>

    <resultMap id="productDtlMap" type="com.woofnmeow.wnm_project_back.entity.ProductDtl">
        <id property="productDtlId" column="product_dtl_id" />
        <result property="productMstId" column="product_mst_id" />
        <result property="price" column="price" />
        <result property="sizeId" column="size_id" />
        <result property="actualStock" column="actual_stock" />
        <result property="tempStock" column="temp_stock" />
        <association property="productMst" resultMap="productMstMap"/>
        <association property="size" resultMap="sizeMap"/>
    </resultMap>

    <resultMap id="productMstMap" type="com.woofnmeow.wnm_project_back.entity.ProductMst">
        <id property="productMstId" column="product_mst_id"/>
        <result property="productName" column="product_name"/>
        <result property="productCategoryId" column="product_category_id"/>
        <result property="productDetailText" column="product_detail_text"/>
        <result property="productThumbnailUrl" column="product_thumbnail_url"/>
        <result property="productDetailUrl" column="product_detail_url"/>
        <result property="createDate" column="create_date"/>
        <association property="petType" resultMap="petTypeMap" />
        <association property="category" resultMap="categoryMap" />
    </resultMap>

    <resultMap id="petTypeMap" type="com.woofnmeow.wnm_project_back.entity.PetType">
        <id property="petTypeId" column="pet_type_id"/>
        <result property="petTypeName" column="pet_type_name"/>
    </resultMap>

    <resultMap id="categoryMap" type="com.woofnmeow.wnm_project_back.entity.Category">
        <id property="productCategoryId" column="product_category_id"/>
        <result property="productCategoryName" column="product_category_name"/>
    </resultMap>

    <resultMap id="sizeMap" type="com.woofnmeow.wnm_project_back.entity.Size">
        <id property="sizeId" column="size_id"/>
        <result property="sizeName" column="size_name"/>
    </resultMap>

    <select id="selectCartByUserId" resultMap="cartMap">
      select
          ct.cart_id,
          ct.count,
          ct.user_id,
          pdt.product_dtl_id,
          pdt.price,
          pmt.product_name,
          pmt.product_thumbnail_url,
          st.size_name,
          psv.actual_stock,
          psv.temp_stock
      from
          cart_tb ct
          left outer join product_dtl_tb pdt on(pdt.product_dtl_id = ct.product_dtl_id)
          left outer join product_mst_tb pmt on(pmt.product_mst_id = pdt.product_mst_id)
          left outer join size_tb st on(st.size_id = pdt.size_id)
          left outer join product_stock_view psv on(psv.product_dtl_id = pdt.product_dtl_id)
      where
          ct.user_id = #{user_id}
    </select>
  ```
  - 조회는 resultMap를 사용해서 상품의 정보를 가져올 수 있도록 하였다.
  
  ```xml
  <insert id="insertCart" parameterType="com.woofnmeow.wnm_project_back.entity.Cart" statementType="CALLABLE">
      {call p_add_cart(#{userId}, #{productDtlId}, #{count})}
  </insert>
  ```
  ```PROCEDURE
  CREATE DEFINER=`woofnmeow`@`%` PROCEDURE `p_add_cart`(
	in vn_user_id int,
	in vn_product_dtl_id int,
    in vn_count int
  )
  BEGIN
  	declare vn_search_count int;
  
  	select
  		count(*) into vn_search_count
      from
  		cart_tb
  	where
  		user_id = vn_user_id
  		and product_dtl_id = vn_product_dtl_id;
  
  	if vn_search_count = 0 then 
  		insert into cart_tb
  		values(0, vn_user_id, vn_product_dtl_id, vn_count);
  	else
  		update cart_tb
  		set count = count + vn_count
  		where
  			user_id = vn_user_id
  		and product_dtl_id = vn_product_dtl_id;
      end if;
  END
  ```
  - 장바구니 등록 SQL 쿼리문은 같은 상품을 등록할시 수량만 올라갈 수 있도록 하여 프로시져를 사용하였다.
  - 없는 상품이면 insert / 있는 상품이면 update 
  
  ```xml
    <delete id="deleteProductOfCart">
        delete
        from
            cart_tb
        where
            cart_id = #{cartId}
    </delete>
  ```
  - 장바구니 상품을 삭제하는 SQL 쿼리문 이다.
  <br/>
  
  **Service**
  ```java
    // 장바구니 등록
    @Transactional(rollbackFor = Exception.class)
    public Boolean addProductToCart(int userId, List<AddCartReqDto> addCartReqDto) {
        try {
            return addCartReqDto.stream()
                    .map(dto -> dto.toCartProductsEntity(userId))
                    .map(cart -> cartMapper.insertCart(cart))
                    .allMatch(successCount -> successCount == 1);
        }catch (Exception e) {
            throw new CartException
                    (errorMapper.errorMapper("장바구니 오류", "상품을 장바구니에 담는 중 오류가 발생하였습니다."));
        }
    }

    // 장바구니 조회
    public List<GetUserCartProductsRespDto> getCartByUserId(int userId) {
        try {
            return cartMapper.selectCartByUserId(userId)
                    .stream()
                    .map(Cart::toGetUserCartProductsRespDto)
                    .collect(Collectors.toList());
        }catch (Exception e) {
            throw new CartException
                    (errorMapper.errorMapper("장바구니 오류", "장바구니를 불러오는 중 오류가 발생하였습니다."));
        }
    }

    // 장바구니 삭제
    @Transactional(rollbackFor = Exception.class)
    public Boolean removeProductOfCart(int cartId) {
        try {
            return cartMapper.deleteProductOfCart(cartId) > 0;
        }catch (Exception e) {
            throw new CartException
                    (errorMapper.errorMapper("장바구니 오류", "장바구니에서 상품을 삭제하는 중 오류가 발생하였습니다."));
        }
    }
  ```
  - 장바구니 등록 : 로그인한 userId와 상품 정보를 이용하여 장바구니에 등록하고 둘다 successCount가 1이면 성공, 실패시 롤백과 예외처리를 던진다.
  - 장바구니 조회 : 로그인한 userId로 조회를 하고 각 상품을 ResponseDto를 List로 반환한다.
  - 장바구니 삭제 : 장바구니 ID로 해당되는 상품을 삭제한다. 실패시 롤백과 예외처리를 던진다.
  <br/>
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

  <details>
  <summary>상품 바로 구매 및 장바구니 상품 구매 코드 리뷰</summary>
  <div markdown="1">

  ## Front-End
  **상품 바로 구매**
  ```javascript
    const buyNowOnClick = () => {
        if(!principal.data) {
            alert("로그인 후 사용해주세요.")
            navigate("/auth/signin")
        } else {
            if(selectedProducts.length === 0) {
                alert("상품을 선택해주세요.")
            } else {
                localStorage.setItem("orderData", JSON.stringify(selectedProducts));
                localStorage.setItem("isCart", false);
                navigate("/order")
            }
        }
    }
  ```
  - 선택한 상품과 isCart를 로컬스토리지에 담아서 구매페이지로 넘어간다.
  <br/>

  **장바구니 상품 구매**
  ```javascript
    const handleBuyOnClick = () => {
        if(!principal.data) {
            alert("로그인 후 사용해주세요.")
            navigate("/auth/signin")
        } else {
            if(selectedCartProduct.length === 0) {
                alert("상품을 선택해주세요.")
            } else {
                const overStockProducts = cartProducts.filter(cp => selectedCartProduct.filter(scp => scp.productDtlId === cp.productDtl.productDtlId)[0]?.count > cp.productDtl.tempStock);
                if(overStockProducts.length > 0) {
                    alert(`상품의 재고가 부족합니다.\n${overStockProducts?.map(osp => {
                        return `${osp.productDtl.productMst.productName}[size: ${osp.productDtl.size.sizeName}]\n`
                    }).join("")}`)
                    return
                } 
                localStorage.setItem("orderData", JSON.stringify(selectedCartProduct))
                localStorage.setItem("isCart", true);
                navigate("/order")
            }
        }
    }
  ```
  - 장바구니에 담겨있는 상품중 선택한 상품과 isCart를 로컬스토리지에 담아서 구매페이지로 넘어간다.
  - 만약 선택한 상품의 재고가 부족하면 상품의 재고가 부족하다는 알림창을 띄워준다.
  <br/>
  
  **구매 페이지**
  ```javascript
    const [ buyProductList, setBuyProductList ] = useState(JSON.parse(localStorage.getItem("orderData")));
  ```
  - 로컬스토리지에 담아서 넘어온 상품 데이터를 useState로 상태를 관리한다.
  <br/>

  **구매 버튼(KakaoPay, TossPay)**
 ```javascript
    const handlePaymentSubmit = (provider) => {
        if(!window.IMP) {return} 
        const { IMP } = window;
        IMP.init("imp31774216");

        const paymentData = {
            pg: "",
            pay_method: "",
            merchant_uid: `mid_${new Date().getTime()}`, // 구매자 식별코드(결제날,시간)
            amount: priceInfo.finalPrice, // 금액
            name:  'Woof&Meow',// 상품이름
            buyer_name: principal?.data?.data?.name, // 구매자 이름
            buyer_email: principal?.data?.data?.email
        }

        switch(provider) {
            case "kakao": 
                paymentData.pg = "kakaopay";
                paymentData.pay_method = "kakaopay";
                break;
            case "toss": 
                paymentData.pg = "tosspay";
                paymentData.pay_method = "tosspay";
                break;
        }

        IMP.request_pay(paymentData, (response) => {
            const { success, error_msg } = response;

            if(success) {
                const option = {
                    headers: {
                        Authorization: localStorage.getItem("accessToken")
                    }
                }

                const order = {
                    userId: principal.data.data.userId,
                    shippingName: shippingUserInfo.name,
                    shippingPhone: shippingUserInfo.phone,
                    shippingAddressNumber: shippingUserInfo.addressNumber,
                    shippingAddressName: shippingUserInfo.addressName,
                    shippingAddressDetailName: shippingUserInfo.addressDetailName,
                    orderProductData: [...buyProductList],
                    isCart: localStorage.getItem("isCart")
                }

                addOrderApi(order, option)
                .then(response => {
                    alert("결제가 완료되었습니다.");
                    localStorage.removeItem("orderData")
                    navigate("/")
                    console.log(response);
                })
            } else {
                alert(error_msg)
            }
        });
    }
 ```
  - KakaoPay, TossPay 둘 중 하나를 선택하여 결제를 한다.
  - 결제가 완료되면 구매할때 기입한 데이터들을 Axios를 통해 Back-End로 보내준다.
  - 이때 로컬스토리지에 있는 isCart도 같이 보내준다.
  <br/>

  
  ## Back-End
  **Controller**
  ```java
    @PostMapping("/api/order")
    public ResponseEntity<?> addOrder(@RequestBody AddOrderReqDto addOrderReqDto) {
        return ResponseEntity.ok().body(orderService.addOrder(addOrderReqDto));
    }
  ```
  - Front-End에서 넘어온 데이터를 AddOrderReqDto로 받는 로직이다.
  <br/>

  **Dto**
  ```java
    @Data
    public class AddOrderReqDto {
    // 배송지 정보
    private int userId;
    private String shippingName;
    private String shippingPhone;
    private String shippingAddressNumber;
    private String shippingAddressName;
    private String shippingAddressDetailName;
    // 주문 상품 정보
    private List<OrderProductsReqDto> orderProductData;
    // 장바구니 구매, 바로 구매 구별
    private Boolean isCart;

    public Order toOrderEntity() {
        return Order.builder()
                .userId(userId)
                .shippingName(shippingName)
                .shippingPhone(shippingPhone)
                .shippingAddressNumber(shippingAddressNumber)
                .shippingAddressName(shippingAddressName)
                .shippingAddressDetailName(shippingAddressDetailName)
                .build();
    }
}
  ```
  - Dto에는 구매시 기입한 데이터와 isCart가 있다.
  - toOrderEntity는 Dto의 데이터를 Entity로 변환한다.
  <br/>

  **Entity**
  ```java
  @NoArgsConstructor
  @AllArgsConstructor
  @Data
  @Builder
  public class Order {
      private int orderId;
      private int userId;
      private LocalDateTime orderDate;
      private String shippingName;
      private String shippingPhone;
      private String shippingAddressNumber;
      private String shippingAddressName;
      private String shippingAddressDetailName;
      private int orderStatus;
  ```
  - Dto에서 변환한 데이터를 받는 Entity이다.
  - DB의 테이블과 컬럼명이 동일하다.
  ```java
  @NoArgsConstructor
  @AllArgsConstructor
  @Builder
  @Data
  public class OrderProducts {
      private int orderProductsId;
      private int orderId;
      private int productDtlId;
      private int count;
  ```
  - Order Entity는 배송관련 데이터를 담는 Entity이면 OrderProducts는 구매 상품의 데이터를 담는 Entity이다.
  <br/>
  
  **Repository**
  ```java
@Mapper
public interface OrderMapper {
    @Options(useGeneratedKeys = true, keyProperty = "orderId")
    public Integer insertOrder(Order order);
    public Integer insertProductsToOrder(Map<String, Object> reqMap);
}
  ```
  - 주문을 추가하고 상품도 같이 추가되는 로직이다.
  
  ```java
@Mapper
public interface CartMapper {
    public int deleteProductOfCartWhenIsCart(DeleteOrderCartVo deleteOrderCartVo);
}
  ```
  - 해당 로직은 장바구니의 상품을 구매할지 장바구니 들어있는 데이터를 삭제하는 로직이다.
  <br/>
  
  
  **mapper(MyBatis)**
  ```xml
    <insert id="insertOrder" parameterType="com.woofnmeow.wnm_project_back.entity.Order" useGeneratedKeys="true" keyProperty="orderId">
        insert into
            order_tb
        values
            (0, #{userId}, now(), #{shippingName}, #{shippingPhone}, #{shippingAddressNumber}, #{shippingAddressName}, #{shippingAddressDetailName}, 0)
    </insert>

    <insert id="insertProductsToOrder" parameterType="hashmap">
        insert into
            order_products_tb
        values(0, #{orderId}, #{productDtlId}, #{count})
    </insert>
  ```
  - DB에 결제시 배송관련 데이터와 구매 상품 관련 데이터를 추가하는 SQL쿼리문이다.
  
  ```xml
    <delete id="deleteProductOfCartWhenIsCart">
        delete
        from
            cart_tb
        where
            user_id = #{userId}
        and product_dtl_id in (
        <foreach collection="products" item="productDtlId" separator=",">
            #{productDtlId}
        </foreach>
        )
    </delete>
  ```
  - 로그인한 userId를 통해 장바구니에 있는 상품 목록을 삭제하는 SQL쿼리문이다.
  <br/>

  **Vo**
  ```java
  @Builder
  @Data
  public class DeleteOrderCartVo {
      private int userId;
      private List<Integer> products;
  }
  ```
  - 장바구니 상품을 구매할시 삭제할 상품의 데이터만 삭제하려고 VO를 사용했다.
  <br/>
  
  **Service**
  ```java
    @Transactional(rollbackFor = Exception.class)
    public boolean addOrder(AddOrderReqDto addOrderReqDto) {
        try {
            Order order = addOrderReqDto.toOrderEntity();
            orderMapper.insertOrder(order);
            addOrderReqDto.getOrderProductData().forEach(productData -> {
                orderMapper.insertProductsToOrder(productData.toProductDtlMap(order.getOrderId()));
            });
            if(addOrderReqDto.getIsCart()) {
                cartMapper.deleteProductOfCartWhenIsCart(DeleteOrderCartVo.builder()
                        .userId(addOrderReqDto.getUserId())
                        .products(addOrderReqDto.getOrderProductData().stream()
                                .map(orderProduct -> orderProduct.getProductDtlId())
                                .collect(Collectors.toList()))
                        .build());
            }
            return true;
        }catch (Exception e) {
            throw new OrderException
                    (errorMapper.errorMapper("주문 오류", "주문 중 오류가 발생하였습니다."));
        }
    }
  ```
  - insertOrder에는 Order 배송관련 데이터를 넣는다.
  - insertProductsToOrder에는 Dto안에 있는 getOrderProductData를 반복문을 돌려서 데이터를 넣는다.
  - 만약 Dto안에 있는 isCart가 True이면 장바구니에 있는 상품 데이터를 삭제한다.
  <br/>
  
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
