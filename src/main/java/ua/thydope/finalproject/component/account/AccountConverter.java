package ua.thydope.finalproject.component.account;

import java.util.Map;

import ua.thydope.finalproject.controller.converter.ParamMapConverter;

public final class AccountConverter implements ParamMapConverter<Account> {
  private AccountConverter() {}

  public static AccountConverter getInstance() {
    return SingletonHelper.INSTANCE;
  }

  @Override
  public Account apply(Map<String, String[]> source) {
    String username = source.get("username")[0];
    String password = source.get("pwd")[0];
    return new Account(username, password);
  }

  private static class SingletonHelper {
    private static final AccountConverter INSTANCE = new AccountConverter();
  }
}
