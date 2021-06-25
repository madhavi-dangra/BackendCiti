package com.citi.trade.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citi.trade.model.*;

@Repository
public interface UserHistoryRepository extends JpaRepository<UserHistory, Long>{
	List<UserHistory> findByUserId(long user_id);
	List<UserHistory> findByUserName(String userName);
	@SuppressWarnings("unchecked")
	UserHistory save(UserHistory s);

}
