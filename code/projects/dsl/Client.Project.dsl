module Client
{
  guid root Project {
    String    UserID;

    String    ApplicationServer;
    String    ApplicationName;

    string?   Nick;
    timestamp CreatedAt;
  }

  event DeleteProject {
    string  Project;
  }
}
