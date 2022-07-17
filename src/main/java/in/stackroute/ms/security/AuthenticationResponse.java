package in.stackroute.ms.security;


public class AuthenticationResponse {
	private final String jwt;

	public String getJwt() {
		return jwt;
	}


	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}
	
}
