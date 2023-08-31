package com.vn.repository;

import com.vn.entity.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails,Long> {

    @Query("""
        SELECT td
        FROM TransactionDetails td
        WHERE td.orderId = ?1
    """)
    TransactionDetails findByOrderId(Long orderId);
}
