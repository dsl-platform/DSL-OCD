package model.OneString.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneStringRootRepository extends
        ClientPersistableRepository<model.OneString.OneStringRoot> {
    public OneStringRootRepository(
            final ServiceLocator locator) {
        super(model.OneString.OneStringRoot.class, locator);
    }
}
