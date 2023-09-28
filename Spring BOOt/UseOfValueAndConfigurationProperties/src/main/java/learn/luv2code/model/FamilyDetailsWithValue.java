package learn.luv2code.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class FamilyDetailsWithValue {

	@Value("${family.title}")
	private String title;
	@Value("${family.member}")
	private int member;
	@Value("${family.youngestMember}")
	private String youngestMember;
}
