package hello.hello_spring.repositroy;

import hello.hello_spring.domain.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements MemberRepository{

    //jpa는 EntityManager통해 동작함
    private final EntityManager entityManager;

    public JpaMemberRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Member save(Member member) {
        //jap 자동으로 insert 쿼리 생성 후 db에 적재함
        entityManager.persist(member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        Member member = entityManager.find(Member.class, id);
        return Optional.ofNullable(member);
    }

    @Override
    public Optional<Member> findByName(String name) {
        List<Member> result = entityManager.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();

        return result.stream().findAny();
    }

    @Override
    public List<Member> findAll() {
        /*
        * createQuery 는 entity 그 자체를 검색함
        * select m from Member m 쿼리문에서도 해당 entity 별칭으로 select로 설정 시 해당 엔티티 검색
        * */
        return entityManager.createQuery("select m from Member m", Member.class)
                .getResultList();
    }
}
