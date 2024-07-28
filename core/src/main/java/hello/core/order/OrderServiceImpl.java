package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService{

    /*
    * DIP 위반
    * DiscountPolicy 추상(인터페이스)의존도 하면서 구체(구현) 클래스 FixDiscountPolicy,RateDiscountPolicy 의존 하고 있음
    *
    * 해결방안: 추상(인터페이스)에만 의존하도록 의존관계를 변경
    *
    * --------
    * OCP 위반
    * 확장에는 열려 있지만, 변경에는 닫여 있어야 하지만, new RateDiscountPolicy(); 선언을 통해 클라이언트(OrderServiceImpl) 코드 변경이 일어났기 때문에 OCP위반 발생
    * */

    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy(); DIP 위반
    //private final DiscountPolicy discountPolicy = new RateDiscountPolicy(); DIP 위반

    //private final MemberRepository memberRepository = new MemoryMemberRepository();


    // 생성자 주입 DI 미구현 시 실행할 경우 구현체가 없어 NPE(null pointer exception)가 발생
    // DIP 위반 해결방안
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy rateDiscountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = rateDiscountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
