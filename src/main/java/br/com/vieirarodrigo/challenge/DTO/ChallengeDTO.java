package br.com.vieirarodrigo.challenge.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ChallengeDTO {
	public int id;
	public String name;
	public String slug;
	public Date created;
}