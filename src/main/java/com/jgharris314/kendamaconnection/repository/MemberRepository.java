package com.jgharris314.kendamaconnection.repository;

import com.jgharris314.kendamaconnection.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MemberRepository extends JpaRepository<Member, UUID> {
    Member findByUsername(String username);
}
