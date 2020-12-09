package br.com.vieirarodrigo.challenge.business.object;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.vieirarodrigo.challenge.DTO.ChallengeDTO;
import br.com.vieirarodrigo.challenge.repository.ChallengeRepository;
import br.com.vieirarodrigo.challenge.repository.vo.ChallengeVO;

@Component
public class ChallengeBO {
	@Autowired
	private ChallengeRepository repository;
	public ChallengeVO save(ChallengeDTO challenge) {
		return repository.save(ChallengeVO.builder()
					.name(challenge.getName())
					.slug(challenge.getSlug())
					.created(challenge.getCreated())
					.build());
	}
	public Optional<ChallengeVO> findById(int id) {
		return repository.findById(id);
	}
}