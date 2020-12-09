package br.com.vieirarodrigo.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vieirarodrigo.challenge.repository.vo.ChallengeVO;

@Repository
public interface ChallengeRepository extends JpaRepository<ChallengeVO, Integer>{ }