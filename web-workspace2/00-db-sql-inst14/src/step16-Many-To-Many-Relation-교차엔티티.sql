/*
	다 대 다 관계 ( Many To Many Relation ) 는 실무에서 사용하지 않는다 
	다 대 다 관계는 교차엔티티(Intersection Entity)로 해소한다 ( 1 대 다 관계 or 다 대 1 관계 ) 
	교차엔티티(Intersection Entity)는 제휴 엔티티( Association Entity ) 또는 
	릴레이션 엔티티( Relation Entity ) 라고도 부른다 

	예 )    고객과 상품 엔티티는 다 대 다 관계이다 
			아이유 고객은 0 or 1 or 다수의 상품을 구매할 수 있다 
			새우깡이라는 상품은 0 or 1 or 다수의 고객에게 판매될 수 있다 
			
	이 경우 교차 엔티티를 이용해 
	고객과 상품의 일반 정보 엔티티 외에 
	고객과 상품의 교차(제휴,관계) 정보를 저장하는 별도의 엔티티를 만든다 
	
	고객일반정보 ----0|<- 주문정보 ->|0----0|<- 상품일반정보 		 		

	고객과 주문정보는 1 대 다 가 되었지만 
	주문과 상품정보는 다 대 다 이므로 ( 주문서 하나에 다수의 상품이 주문될 수 있고, 하나의 상품은 다수의 고객에게 주문될 수 있다)
	다시 주문과 상품정보엔티티 사이의 교차엔티티(주문상품)를 생성한다
	
	 고객일반정보 ----0|<- 주문정보 ----|<-주문상품 ->|0---- 상품일반정보 


*/








