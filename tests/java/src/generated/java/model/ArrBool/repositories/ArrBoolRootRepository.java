package model.ArrBool.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrBoolRootRepository extends
        ClientPersistableRepository<model.ArrBool.ArrBoolRoot> {
    public ArrBoolRootRepository(
            final ServiceLocator locator) {
        super(model.ArrBool.ArrBoolRoot.class, locator);
    }
}
