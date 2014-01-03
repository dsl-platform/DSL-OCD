package model.OneInt.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneIntRootRepository extends
        ClientPersistableRepository<model.OneInt.OneIntRoot> {
    public OneIntRootRepository(
            final ServiceLocator locator) {
        super(model.OneInt.OneIntRoot.class, locator);
    }
}
