package ua.thydope.finalproject.controller.frontcommand;

public class CommandFactory {

  public static Command findGetCommand(String location) {
    switch (location) {
    case "login": {
      return new LoginCommand();
    }
    case "logout": {
      return new LogOut();
    }
    case "index": {
      return new GetBlankCommand();
    }
    case "signup": {
      return new SignUpCommand();
    }
    case "assessments": {
      return new ListAssessments();
    }
    case "requestassess": {
      return new RequestAssessment();
    }
    case "assess": {
      return new Assess();
    }
    default: {
      return new GetBlankCommand();
    }
    }
  }
}
