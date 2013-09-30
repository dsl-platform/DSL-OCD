package model.ListBool.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListBoolRootRepository extends
        ClientPersistableRepository<model.ListBool.ListBoolRoot> {
    public ListBoolRootRepository(
            final ServiceLocator locator) {
        super(model.ListBool.ListBoolRoot.class, locator);
    }
}
