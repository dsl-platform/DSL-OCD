package com.dslplatform.ocd
package impl
package java
package test

import types._


trait TestGetterTypeJava
    extends TestGetterType { this: TestValuePropertiesJava =>

    valueProperties foreach { p =>

      p.

      registerTest("getter test", """
    @Test
    public void Test() throw NoSuchFieldException {
        assertTrue(new FieldTester(${javaClass}.class, "${fieldName}").typeEquals(${fieldClass}.class));
    }
""")


    }

}
