package com.annonymous.ttaleum.modules.user.adapter.controller;

import com.annonymous.ttaleum.modules.user.adapter.adapter.UserRegistrationAdapter;
import com.annonymous.ttaleum.modules.user.domain.entity.User;
import com.annonymous.ttaleum.modules.user.domain.service.UserRegisterUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@Validated
@Tag(name = "Member", description = "Member API")
@RequiredArgsConstructor
public class UserController {
  private final UserRegisterUseCase userRegisterUseCase;

  @PostMapping("/creation")
  @Operation(summary = "유저 등록", description = "유저를 등록합니다.")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "성공"),
    @ApiResponse(responseCode = "404", description = "이미 회원가입한 유저 입니다."),
  })
  public ResponseEntity<User> registerUser(@Valid @RequestBody UserRegistrationAdapter adapter) {
    User user = this.userRegisterUseCase.register(adapter.toEntity());

    return ResponseEntity.ok().body(user);
  }

  @DeleteMapping("/deletion")
  @Operation(summary = "유저 삭제", description = "유저를 삭제합니다.")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "성공"),
    @ApiResponse(responseCode = "404", description = "이미 회원가입한 유저 입니다."),
  })
  public ResponseEntity<String> deleteUser(
    @Valid @RequestParam(name = "userId") String userId
  ) {
    this.userRegisterUseCase.dropdown(Long.parseLong(userId));

    return ResponseEntity.ok().body("성공");
  }

  @GetMapping(path = "/search")
  @Operation(summary = "유저 조회", description = "유저를 조회합니다.")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "성공"),
    @ApiResponse(responseCode = "404", description = ""),
  })
  public ResponseEntity<Map<String, String>> getUser(
    @Valid @RequestParam(name = "userId") String userId
  ) {
    Optional<User> result = this.userRegisterUseCase.getUser(Long.parseLong(userId));

    Map<String, String> map = new HashMap<>();
    if (result.isPresent()) {
      String name = result.get().getName();
      String email = result.get().getEmail();
      String password = result.get().getPassword();

      map.put("name", name);
      map.put("password", password);
      map.put("email", email);

      return ResponseEntity.ok().body(map);
    }

    return ResponseEntity.ok().body(map);
  }

  @GetMapping(path = "/user-list")
  public ResponseEntity<List<User>> getUsers() {
    List<User> users = this.userRegisterUseCase.getUsers();
    return ResponseEntity.ok().body(users);
  }

}

//public ResponseEntity<Optional<Product>> OneSelect() {}
