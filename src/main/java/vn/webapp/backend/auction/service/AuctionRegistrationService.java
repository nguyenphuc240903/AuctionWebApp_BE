package vn.webapp.backend.auction.service;

import vn.webapp.backend.auction.enums.AuctionRegistrationState;
import vn.webapp.backend.auction.model.AuctionRegistration;

import java.util.List;

public interface AuctionRegistrationService {
    void registerUserForAuction(String username, Integer auctionId);
    List<AuctionRegistration> findByAuctionIdAndValid(Integer auctionId);
}
