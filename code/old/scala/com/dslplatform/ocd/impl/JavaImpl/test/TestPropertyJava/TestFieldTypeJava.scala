package com.dslplatform.ocd
package impl
package java
package test

import types._


trait TestFieldTypeJava
    extends TestFieldType { this: TestValuePropertiesJava =>

    valueProperties foreach { p =>

      registerTest("field test", """
    @Test
    public void Test() throw NoSuchFieldException {
        assertTrue(new FieldTester(${javaClass}.class, "${fieldName}").typeEquals(${fieldClass}.class));
    }
""")


    }

}
