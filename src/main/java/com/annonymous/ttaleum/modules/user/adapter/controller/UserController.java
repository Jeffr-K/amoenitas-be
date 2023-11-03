package com.annonymous.ttaleum.modules.user.adapter.controller;

import com.annonymous.ttaleum.modules.user.adapter.adapter.UserRegistrationAdapter;
import com.annonymous.ttaleum.modules.user.service.UserRegisterUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Validated
@Tag(name = "Member", description = "Member API")
public class UserController {
  private UserRegisterUseCase userRegisterUseCase;

  @PostMapping("/creation")
  @Operation(summary = "유저 등록", description = "유저를 등록합니다.")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "성공"),
    @ApiResponse(responseCode = "404", description = "이미 회원가입한 유저 입니다."),
  })
  public ResponseEntity<Boolean> registerUser(@Valid @RequestBody UserRegistrationAdapter adapter) {
      return ResponseEntity.ok().body(this.userRegisterUseCase.register());
  }

//  @PutMapping()
//  public ResponseEntity<String> modifyUser() {
//    try {
//
//    } catch(Exception e) {
//      throw e;
//    }
//  }
//
//  @DeleteMapping()
//  public ResponseEntity<String> deleteUser() {
//
//  }
//
//  @GetMapping()
//  public ResponseEntity<User> getUser() {
//    return ResponseEntity.ok().body(new User());
//  }
//
//  @GetMapping("/find")
//  public ResponseEntity<List<User>> getUsers() {
//    List<User> users = new ArrayList<>();
//    users.add(new User());
//
//    return ResponseEntity.ok().body(users);
//  }

}
