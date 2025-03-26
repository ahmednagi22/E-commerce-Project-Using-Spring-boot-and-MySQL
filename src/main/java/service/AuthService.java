package service;

import com.ecommerce.response.SignUpRequest;

public interface AuthService {
    String createUser(SignUpRequest request);
}
