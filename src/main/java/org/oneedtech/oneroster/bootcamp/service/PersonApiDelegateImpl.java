package org.oneedtech.oneroster.bootcamp.service;

import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.oneedtech.oneroster.bootcamp.api.UsersApiDelegate;
import org.oneedtech.oneroster.bootcamp.model.SingleUserDType;
import org.oneedtech.oneroster.bootcamp.model.UserDType;
import org.oneedtech.oneroster.bootcamp.model.UserSetDType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonApiDelegateImpl implements UsersApiDelegate {
  private List<UserDType> persons;
  private Integer PERSON_COUNT = 50;
  private Faker faker = new Faker();

  @PostConstruct
  void initPersonRepository() {
    persons =
        IntStream.range(0, PERSON_COUNT)
            .mapToObj(
                i ->
                    new UserDType.Builder()
                        .sourcedId(UUID.randomUUID().toString())
                        .status(UserDType.StatusEnum.ACTIVE)
                        .dateLastModified(null)
                        .username(faker.name().username())
                        .enabledUser(UserDType.EnabledUserEnum.TRUE)
                        .givenName(faker.name().firstName())
                        .familyName(faker.name().lastName())
                        .middleName(faker.name().nameWithMiddle())
                        .build())
            .collect(Collectors.toList());
  }

  @Override
  public ResponseEntity<UserSetDType> getAllUsers(Integer limit, Integer offset, String sort, String orderBy,
        String filter, List<String> fields) {
            return ResponseEntity.ok(UserSetDType.builder().users(persons).build());
}

  @Override
  public ResponseEntity<SingleUserDType> getUser(String sourcedId, List<String> fields) {
    return persons.stream()
        .filter(p -> p.getSourcedId().equals(sourcedId))
        .findFirst()
        .map(user -> ResponseEntity.ok(SingleUserDType.builder().user(user).build()))
        .orElse(ResponseEntity.notFound().build());
  }
}
