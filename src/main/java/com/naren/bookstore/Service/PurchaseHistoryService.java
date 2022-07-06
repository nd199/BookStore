package com.naren.bookstore.Service;

import com.naren.bookstore.Entity.PurchaseHistory;

import java.util.List;

public interface PurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<PurchaseHistory> findPurchasedItemsOfUser(Long userId);
}
