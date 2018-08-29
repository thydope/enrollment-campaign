package ua.thydope.finalproject.component.role;

import ua.thydope.finalproject.component.api.Entity;

public class Role extends Entity {
  private String name;

  public Role(Integer id) {
    super(id);
  }

  public Role(Integer id, String name) {
    super(id);
    this.name = name;
  }
}
