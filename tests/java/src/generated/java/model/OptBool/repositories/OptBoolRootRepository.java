package model.OptBool.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OptBoolRootRepository extends
        ClientPersistableRepository<model.OptBool.OptBoolRoot> {
    public OptBoolRootRepository(
            final ServiceLocator locator) {
        super(model.OptBool.OptBoolRoot.class, locator);
    }
}
