package com.naren.bookstore.Repository;

import com.naren.bookstore.Entity.PurchaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory, Long> {

    List<PurchaseHistory> findAllByUserId(@Param("userId") Long userId);

}