package gitlabbuild;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GitLabBuild {
	
	@Builder.Default long id = System.currentTimeMillis();
	
	public static void main(String[] args) {
		
		System.out.println(GitLabBuild.builder()
				
				.build());
				
	}
	

}

