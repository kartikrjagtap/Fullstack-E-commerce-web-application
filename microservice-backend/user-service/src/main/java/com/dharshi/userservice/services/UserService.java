package com.dharshi.userservice.services;

import com.dharshi.userservice.dtos.ApiResponseDto;
import com.dharshi.userservice.exceptions.ServiceLogicException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public interface UserService {
    ResponseEntity<ApiResponseDto<?>> existsUserById(String userId) throws ServiceLogicException;

}
