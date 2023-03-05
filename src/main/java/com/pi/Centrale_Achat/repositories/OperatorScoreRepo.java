package com.pi.Centrale_Achat.repositories;

import com.pi.Centrale_Achat.entities.OperatorScore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperatorScoreRepo extends JpaRepository<OperatorScore,Integer> {
    List<OperatorScore> findByUser(int operatorId);
}
