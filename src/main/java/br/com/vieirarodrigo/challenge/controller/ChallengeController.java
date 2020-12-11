package br.com.vieirarodrigo.challenge.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vieirarodrigo.challenge.DTO.ChallengeDTO;
import br.com.vieirarodrigo.challenge.business.object.ChallengeBO;
import br.com.vieirarodrigo.challenge.repository.vo.ChallengeVO;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/employee")
public class ChallengeController {
	@Autowired
	private ChallengeBO challengeBO;
	@ApiOperation(value="This service creates a new Challenge in the database.")
	@PostMapping(path = "/v1/challenges")
	public @ResponseBody ChallengeVO save(@RequestBody ChallengeDTO Challenge) {
		return challengeBO.save(Challenge);
	}
	@ApiOperation(value="This service seeks to Challenge by CompanyId.")
	@GetMapping(path = "/v1/challenges/{id}")
	public @ResponseBody Optional<ChallengeVO> findByCompanyId(@PathVariable int id) {
		return challengeBO.findById(id);
	}
}
