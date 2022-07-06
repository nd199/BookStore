package com.naren.bookstore.Service.Impl;

import com.naren.bookstore.Entity.PurchaseHistory;
import com.naren.bookstore.Repository.PurchaseHistoryRepository;
import com.naren.bookstore.Service.PurchaseHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseHistoryServiceImpl implements PurchaseHistoryService {

    @Autowired
    private PurchaseHistoryRepository purchaseHistoryRepository;

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory) {
        purchaseHistory.setCreateTime(LocalDateTime.now());
        return purchaseHistoryRepository.save(purchaseHistory);
    }

    @Override
    public List<PurchaseHistory> findPurchasedItemsOfUser(Long userId) {
        return purchaseHistoryRepository.findAllByUserId(userId);
    }

}
