package com.example.gfl_patterns.dto_task.repository;

import com.example.gfl_patterns.dto_task.dto.UserFilterDto;
import com.example.gfl_patterns.dto_task.entity.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.PersistenceContext;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class UserCustomRepositoryImpl implements UserCustomRepository {

    @PersistenceContext
    private Session session;

    @Value("${page.size}")
    private Integer pageSize;

    @Override
    public List<User> findAllByFilter(UserFilterDto filter) {
        var cb = session.getCriteriaBuilder();
        var criteria = cb.createQuery(User.class);
        var expression = criteria.from(User.class);

        List<Predicate> predicates = new ArrayList<>();

        if (filter.getUsername() != null) {
            predicates.add(cb.equal(expression.get("username"), filter.getUsername()));
        }
        if (filter.getMinBalance() != null) {
            predicates.add(cb.greaterThan(expression.get("balance"), filter.getMinBalance()));
        }
        if (filter.getMaxBalance() != null) {
            predicates.add(cb.lessThan(expression.get("balance"), filter.getMaxBalance()));
        }

        criteria.select(expression)
                .where(predicates.toArray(Predicate[]::new))
                .orderBy(cb.asc(expression.get("username")));

        return session.createQuery(criteria)
                .setMaxResults(pageSize)
                .setFirstResult(filter.getCurrentPage())
                .getResultList();
    }
}
