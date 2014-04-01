module Client
{
  guid root Project {
    String    UserID;
    string?   Nick;
    timestamp CreatedAt;
	
	specification FindByUser 'it => it.UserID == User' {
      string User;
	}
  }

  event DeleteProject {
    string  Project;
  }
}
