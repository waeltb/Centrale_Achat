package com.pi.Centrale_Achat.repositories;

import com.pi.Centrale_Achat.entities.Bill;
import com.pi.Centrale_Achat.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepo extends JpaRepository<Location,Integer> {
}
