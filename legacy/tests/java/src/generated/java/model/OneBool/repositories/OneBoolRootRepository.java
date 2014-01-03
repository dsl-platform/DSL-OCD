package model.OneBool.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneBoolRootRepository extends
        ClientPersistableRepository<model.OneBool.OneBoolRoot> {
    public OneBoolRootRepository(
            final ServiceLocator locator) {
        super(model.OneBool.OneBoolRoot.class, locator);
    }
}
